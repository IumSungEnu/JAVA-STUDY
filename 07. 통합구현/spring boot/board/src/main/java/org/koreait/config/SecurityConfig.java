package org.koreait.config;


import org.koreait.models.user.LoginFailureHandler;
import org.koreait.models.user.LoginSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SecurityConfig { //시큐리티 보안
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        //로그인
        http.formLogin()
                //로그인 페이지
                .loginPage("/user/login")  //로그인 페이지 url
                //.defaultSuccessUrl("/")    //성공시 이동할 url
                .successHandler(new LoginSuccessHandler()) //.defaultSuccessUrl("/")보다 상세히 설정
                .usernameParameter("userId")
                .passwordParameter("userPw")
                //.failureUrl("/user/login")  //로그인 실패시 이동할 url
                .failureHandler(new LoginFailureHandler())  //.failureUrl("/user/login")보다 좀더 상세하게 설정가능하다.
                //------------------------------------------------------------------------
                //로그아웃 페이지
                .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/user/logout")) //패턴을 입력하면 된다.
                .logoutSuccessUrl("/user/login");  //로그아웃 성공시 이동할 url

        //특정 url을 관리(특정 페이지)
        http.authorizeHttpRequests()
                .requestMatchers("/templates/mypage/**").authenticated() //로그인한 회원만 가능한 url 패턴
                .requestMatchers("/admin/**").hasAuthority("ADMIN")  //관리자만 접근 가능한 url 패턴
                .anyRequest().permitAll();
        
        //관리자 접근 권한 없을 시 -> 접근 권한이 없습니다. 401 - Unauthorized
        //비회원 접근 권한 없는 경우 -> 로그인 페이지

        http.exceptionHandling()
                .authenticationEntryPoint((req, res, e) -> {
                    String redirectUrl = "/user/login";
                    String URI = req.getRequestURI();
                    if(URI.indexOf("/admin") != -1){ //관리자 페이지
                        redirectUrl = "/error/401";
                    }


                    res.sendRedirect(redirectUrl);
                });

        return http.build();
    }

    //정적설정을 추가하기 위해... -> 위에 특정 url(특정페이지)에는 적용되지 않는다.
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return w -> w.ignoring()
                .requestMatchers("/css/**", "/js/**", "/images/**", "/api/**");
    }


    @Bean
    public PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }
}
