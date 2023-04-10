package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    /*
    @GetMapping("/hello")  //get방식에서 /hello를 입력하면 hello가 호출된다.
    public String hello(@RequestParam(name="name", required=false)String nm, boolean agree, Model model){  //관리객체
        //패턴을 가지고 동일한 객체의 파라미터 자료형을 알아서 변환해준다. -> boolean
        //명칭이 다르면 매칭이 안된다. name=null값이 출력된다.
        //@RequestParam를 이용해 name을 nm안에 넣어주어 결과값을 출력한다.
        //required = false -> null값이 들어간다.

        System.out.printf("name=%s, agree=%s%n", nm, agree);
        model.addAttribute("message", "안녕하세요");

        return "hello";  //String, ModelAndView
    }
    */

    @GetMapping("/hello")
    public ModelAndView hello(String name, String agree){

        //처리의 통일성을 위해 사용한다.(잘 사용하지는 x)
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요");
        mv.addObject("name",name);

        mv.setViewName("hello");
        return mv;
    }
}
