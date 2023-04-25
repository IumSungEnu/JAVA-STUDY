package org.koreait.controllers.users;

import jakarta.validation.Valid;
import org.koreait.models.user.UserSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController { //회원가입 기능 부분

    @Autowired
    private JoinValidator validator; //JoinValidator 클래스를 생성하면 주입해준다.
    
    @Autowired
    private UserSaveService service; //UserSaveService 클래서 생성 후 주입

    @GetMapping
    public String join(Model model){
        //가입 페이지

        JoinForm joinForm = new JoinForm();  //비어있는 객체 생성
        model.addAttribute("joinForm", joinForm);

        return "user/join";
    }
    
    @PostMapping
    public String joinPs(@Valid JoinForm joinForm, Errors errors){
        //@Valid가 없으면 페이지 이동이 되버려 검증을 확인할 수 없다.

        validator.validate(joinForm, errors);  //validate 추가해준다.

        if(errors.hasErrors()){
            return "user/join";
        }
        
        service.save(joinForm);  //service 추가
        
        return "redirect:/user/login";  //회원가입 완료 후 -> 로그인 이동
    }

    @GetMapping("/login")
    public String login(@CookieValue(required = false) String saveId,  Model model){
        //LoginSuccessHandler에 생성된 쿠키를 가지고 오기 위해 @CookieValue 사용

        if(saveId != null){
            model.addAttribute("userId", saveId);
            model.addAttribute("saveId", saveId);
        }

        return "user/login";
    }
}

//많이 쓰이는 형식들로 꼭 한번씩 다시 해보자.