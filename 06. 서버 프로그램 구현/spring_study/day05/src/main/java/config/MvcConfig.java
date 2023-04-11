package config;

import commons.CommonLibrary;
import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.*;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.Locale;

@Configuration
@EnableWebMvc  //스프링 MVC 설정을 활성화
public class MvcConfig implements WebMvcConfigurer {
    //WebMvcConfigurer 인터페이스는 스프링 MVC의 개별 설정을 조정할 떄 사용한다.
    //기본 추가되는 기능은 모두 WebMvcConfigurer에 들어간다.

    @Autowired
    private ApplicationContext applicationContext;  //스프링 컨테이너

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    /*
    public void configureViewResolvers(ViewResolverRegistry registry) {//ViewResolver
        registry.jsp("/WEB-INF/view/", ".jsp");
    }
    */

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext); //스프링 컨테이너가 필요하기에 넣음
        templateResolver.setPrefix("/WEB-INF/view/");
        templateResolver.setSuffix(".html");
        templateResolver.setCacheable(false); //개발할때는 캐시가 안바뀐다. false
                                              //ture일때는 실제 배포할때...
                                              //번역을 매번하는게 부담스럽기 때문에.
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver());
        templateEngine.setEnableSpringELCompiler(true);
        templateEngine.addDialect(new Java8TimeDialect()); //addDialect 확장모델 - #temporals
        templateEngine.addDialect(new LayoutDialect());  //tag, 다이얼을 가지고 쉽게 소스를 사용한다.
                                                         //컨텐츠 기반으로 대체된다.
        return templateEngine;
    }

    @Bean
    public ThymeleafViewResolver thymeleafViewResolver() {
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setContentType("text/html");   //설정없이 한글깨짐을 지정할수 있다. 예로 join 맨위에 소스
        resolver.setCharacterEncoding("utf-8");
        resolver.setTemplateEngine(templateEngine());
        return resolver;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.viewResolver(thymeleafViewResolver());
    }

    @Bean
    public MessageSource messageSource(){
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.setBasenames("messages.commons");
        ms.setDefaultEncoding("UTF-8");
        //ms.setDefaultEncoding(Locale.KOREA);
        return ms;
    }

    @Bean
    public CommonLibrary cLib(){
        return new CommonLibrary();
    }

    //메인페이지로 이동
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /*
        registry.addViewController("/")
                .setViewName("main/index");
        */

        registry.addViewController("mypage")
                .setViewName("mypage/index");
    }

    //정적 경로 설정
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")        // '/**' 파일을 포함한 모든경로
                .addResourceLocations("classpath:/static/"); //resources -> static
    }
}
