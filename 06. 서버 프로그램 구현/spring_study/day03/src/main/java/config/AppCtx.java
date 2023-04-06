package config;

import exam02.Calculator;
import exam02.ImplCalculator;
import exam02.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)  //자동으로 세팅을 다 해준다. - 설정을 해주어야 한다.
public class AppCtx { //스프링 관리 객체 클래스


    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }

    /*
    @Bean
    public RecCalculator calculator(){
        return new RecCalculator();
    }

    @Bean
    public ImplCalculator calculator2(){
        return new ImplCalculator();
    }
    */

    @Bean
    public CommonPointcut commonPointcut(){
        return new CommonPointcut();
    }

    @Bean
    public CachedProxy cachedProxy(){
        return new CachedProxy();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator2() {
        return new ProxyCalculator2();
    }
}