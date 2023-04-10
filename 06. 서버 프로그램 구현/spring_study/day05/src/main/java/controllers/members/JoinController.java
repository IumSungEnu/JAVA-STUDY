package controllers.members;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/join")
public class JoinController {
    @GetMapping  //현재 get방식에서...
    public String join(Model model){
        model.addAttribute("title", "회원가입");
        model.addAttribute("content", "회원가입 내용");

        return "member/join";
    }

    @PostMapping  //member/join -> @RequestMapping("/member")를 추가했기 때문에
                  //member를 빼도 출력이 가능하다. join도 마찬가지.
    //public String joinPs(String userId, String userPw){
    public String joinPs(Join join, Model model){  //커맨드 객체
        //System.out.println("post로 유입");
        System.out.println(join);
        //model.addAttribute("join",join);


        //return "member/join";
        return "redirect:/member/join";  //리다이렉트
    }
}
