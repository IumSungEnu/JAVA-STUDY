package org.koreait.controllers.boards;

import jakarta.validation.Valid;
import org.koreait.models.board.BoradWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoradWriteService service;

    @GetMapping("/write")
    public String write(Model model){
        BoardForm boardForm = new BoardForm();
        model.addAttribute("boardForm", boardForm);

        //기본적인 에러
        boolean result = false;
        if(!result){

        }

        return "board/write";
    }

    @PostMapping("/write")
    public String writePs(@Valid BoardForm boardForm, Errors errors){

        if(errors.hasErrors()){ //에러가 있으면
            return "board/write";
        }

        service.write(boardForm);

        return "redirect:/board/list";
    }

    /* - CommonController에 복사해놨기 때문에 굳이 여기에 놔둘 필요는 없다.
    @ExceptionHandler(RuntimeException.class)
    public String errorHandler(RuntimeException e, Model model){
        e.printStackTrace();

        model.addAttribute("message", e.getMessage());

        return "error/common";
    }
    */
}
