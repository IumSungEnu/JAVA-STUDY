package controllers.members;

import models.member.Member;
import models.member.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ExamController { //경로 변수
    @Autowired
    private MemberDAO memberDAO;

    @GetMapping("/member2/{id}")   //바뀔수 있는 부분을 {}로 표시, 제한이 없다.(여러개 넣어도 된다)
    public String memberInfo(@PathVariable(name="id", required = false) String userId, Model model){
        //반드시 @PathVariable넣어야 매칭된다.
        //스프링은 알려주어야 한다.
        //@PathVariable(required = false) 없어도 상관없는데 null값이 들어간다.

        System.out.printf("userId=%s%n", userId);

        Member member = memberDAO.get(userId);
        model.addAttribute("member2", member);

        return  "member2/info2";
        
    }
}
