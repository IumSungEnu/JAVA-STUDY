package config;

import exam02.Calculator;
import exam02.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  //세팅을 다 해준다.
public class AppCtx {

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator2() {
        return new ProxyCalculator2();
    }
}