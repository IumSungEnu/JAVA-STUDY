package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Configuration
/*
@ComponentScan(basePackages = "models.member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes={ManualBean.class}))    //설정이 있다.(models의 member 하위객체들이 모두 포함된다.)
*/
/*
@ComponentScan(basePackages = "models.member",
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {ManualBean.class}),@ComponentScan.Filter(type=FilterType.ASPECTJ, pattern = "models.member.**Service")
        })
*/

@Component
public class AppCtx3 {
    @Bean
    public DateTimeFormatter dateTimeFormatter(){ //외부에서 받은 데이터는 직접 작성해주어야 한다.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter;
    }
}//결과값 : null -> 2023.04.05 11:35(바뀜)
