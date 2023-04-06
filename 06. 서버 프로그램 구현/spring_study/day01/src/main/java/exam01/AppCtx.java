package exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //스프링 설정기능
public class AppCtx {

    @Bean   //스프링 관련 객체 -> 스프링에 알려준다.
    public Hello hello(){
        Hello hello = new Hello();
        return hello;
    }
}
