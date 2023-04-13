package controllers.members;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/member/join")
@RequiredArgsConstructor  //final 또는 @NonNull이 있는 멤버 변수 초기화 생성자(많이 쓰인다)
public class JoinController {

    @NonNull
    private final JoinValidator validator;
    private final JoinService service;


    /*
    public JoinController(JoinValidator validator){
        this.validator = validator;
    } //@RequiredArgsConstructor이 주입되면 이 코드는 없어도 된다.
    */

    @GetMapping  //현재 get방식에서...
    public String join(Model model){
        // model.addAttribute("title", "회원가입");
        //model.addAttribute("content", "회원가입 내용");

        Join join = new Join();
        model.addAttribute("join", join);
        return "member/join";
    }

    @PostMapping  //member/join -> @RequestMapping("/member")를 추가했기 때문에
                  //member를 빼도 출력이 가능하다. join도 마찬가지.
    //public String joinPs(String userId, String userPw){
    public String joinPs(@Valid Join join, Errors errors, Model model){  //커맨드 객체
        System.out.println(join);
        //model.addAttribute("join",join);

        validator.validate(join,errors);

         if(errors.hasErrors()){
             //에러가 있으면 처리하지 않는다 -> 양식
             return "member/join";
         }

         //회원가입 처리
        service.join(join);

        //성공시에는 회원 로그인
        return "redirect:/member/login";  //리다이렉트
    }
}

//@Valid를 반드시 입력해야 한다. 그렇지 않으면 호출되지 않는다. 
//커맨드 객체 바로 뒤에 error가 있어야 한다.
