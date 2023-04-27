package org.koreait.config;

import jakarta.persistence.EntityListeners;
import org.koreait.commons.interceptors.UserInfoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableJpaAuditing
public class MvcConfig implements WebMvcConfigurer {
    
    @Autowired
    private UserInfoInterceptor userInfoInterceptor;

    @Bean
    public MessageSource messageSource(){
        //메세지를 사용하기 위해 메세지 소스 생성
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setDefaultEncoding("UTF-8");
        ms.addBasenames("messages.commons", "messages.errors", "messages.validations");

        return ms;
    }

    //회원관리 공통 데이터 기능
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInfoInterceptor)
                .addPathPatterns("/**");
    }

    //생성한 AuditorAwareImpl를 추가한다.
    @Bean
    public AuditorAware<String> auditorProvider(){

        return new AuditorAwareImpl();
    }

    
}
