package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("controllers") //스캔이 아닌 공통 핸들러이다.(전범위)
public class CommonController {

    @ExceptionHandler(Exception.class)  //모든 예외가 주입된다.
    public String errorHandler(RuntimeException e, Model model){

        e.printStackTrace();
        model.addAttribute("message", e.getMessage());

        return "errors/common";
    }

}
