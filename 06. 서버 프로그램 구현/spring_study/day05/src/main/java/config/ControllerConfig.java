package config;

import controllers.HelloController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"controllers", "models"}) //모든 controllers가 스캔범위(하위범위 포함)
public class ControllerConfig {
    @Bean
    public HelloController helloController(){
        return new HelloController();
    }
}
