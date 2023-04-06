package main;

import config.AppCtx;
import config.AppCtx2;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);

        //JoinService joinService = ctx.getBean("joinService", JoinService.class);
        JoinService joinService = ctx.getBean(JoinService.class); //명시하지 않아도 찾아준다.
        ListService listService = ctx.getBean("listService", ListService.class);

        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("사용자01");
        joinService.join(member);

        listService.print();

        ctx.close(); //객체가 전부 소멸
    }
}
