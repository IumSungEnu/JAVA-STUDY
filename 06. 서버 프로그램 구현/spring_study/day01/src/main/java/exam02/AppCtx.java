package exam02;

import models.member.JoinService;
import models.member.MemberDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //설정 클래스를 알려줘야 한다.
public class AppCtx {
    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }

    @Bean
    public JoinService joinService(){
        JoinService joinService = new JoinService(memberDAO());
        return joinService;
    }
}
