package main;

import config.AppCtx;
import lombok.extern.java.Log;
import models.member.Member;
import models.member.MemberDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
@Log
public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        MemberDAO memberDAO = ctx.getBean(MemberDAO.class);


        Member member = new Member();
        member.setUserId("user03");
        member.setUserPw("123456");
        member.setUserNm("사용자03");

        //boolean result = memberDAO.insert(member);
        long userNo = memberDAO.insert(member);
        System.out.println("추가 성공 : " + userNo);


        /*
        boolean result = memberDAO.delete("user02");
        System.out.println("삭제 성공 : " + result);
        */

        /*
        List<Member> members = memberDAO.gets();
        members.stream().forEach(System.out::println);
        */
        
        /*
        Member member = memberDAO.get("user01");
        if(member != null){
            log.info(member.toString());
        }
        */

        /*
        long total = memberDAO.getTotal();
        log.info("총 회원 수 : " + total);
        */

        ctx.close();
    }
}
