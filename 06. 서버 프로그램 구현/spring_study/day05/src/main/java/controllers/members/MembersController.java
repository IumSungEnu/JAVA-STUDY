package controllers.members;

import models.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MembersController {

    @GetMapping("/members")
    public String members(Model model){ //Model model 의존성 주입
        //반복문을 쓰기 위해서.

        //임시 회원정보 만들기(10명정도)
        List<Member> members = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            Member member = new Member();
            member.setUserId("user" + i);
            member.setUserNm("사용자" + i);
            member.setMobile("010-0000-0000");
            member.setRegDt(LocalDateTime.now());
            members.add(member);
        }
        model.addAttribute("members", members);
        //model.addAttribute("param1", val1);
        //model.addAttribute("param2", val2);
        return "member/members";
    }
}
