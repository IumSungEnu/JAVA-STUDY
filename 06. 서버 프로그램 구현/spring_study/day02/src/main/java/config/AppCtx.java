package config;

import models.member.InfoService;
import models.member.JoinService;
import models.member.ListService;
import models.member.MemberDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.time.format.DateTimeFormatter;

@Configuration
@Import(AppCtx2.class)  //설정클래스를 추가,통합
public class AppCtx {
    //스프링 연동 - 스프링 컨테이너 안에 객체가 안에 있다(보관하고 있다)
    //관리하고 있는 객체를 알려준다.


    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }

    @Bean
    public JoinService joinService(){
        //joinService.setMemberDAO(memberDAO());

        return new JoinService();
    }

    @Bean
    public ListService listService(){
        return new ListService();
    }

    @Bean
    public InfoService infoService(){
        return new InfoService();
    }

    @Bean
    public DateTimeFormatter dateTimeFormatter(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
        return formatter;
    }
}
