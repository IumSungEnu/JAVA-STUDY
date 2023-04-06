package exam02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtx {
    @Bean(initMethod = "init", destroyMethod = "close")
    @Scope("prototype")
    //통제가 불가능한 메서드를 호출할때
    public Message message(){
        return new Message();
    }
}
