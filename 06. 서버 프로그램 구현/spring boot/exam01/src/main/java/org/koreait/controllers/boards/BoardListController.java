package org.koreait.controllers.boards;

import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardListController { //일반 컨트롤러로 작업하면 오류가 발생한다.

    @Autowired
    private BoardDAO boardDAO;

    @ResponseBody  //일반 메서드가 아닌 response로 사용할 수 있다. 이걸 추가해야 오류가 발생하지 않는다.
    @GetMapping("/api2/board/{id}")  
    public Board board(@PathVariable Long id){
        Board board = boardDAO.get(id);

        return board;
    }
}

//시험문제에 나온다. 게시판 api만들기★★★
