package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //특별한 목적을 관리하는 관리객체
public class HelloController {
    @GetMapping("/hello")
    public String hello(){

        return "hello";  //반환값 : hello ->  /WEB-INF/view/hello.jsp
    }
}
