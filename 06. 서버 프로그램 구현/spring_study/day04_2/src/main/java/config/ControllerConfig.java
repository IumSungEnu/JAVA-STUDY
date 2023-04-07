package config;

import controllers.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfig { //관리 객체
    @Bean
    public HelloController helloController(){
        return new HelloController();
    }
}
