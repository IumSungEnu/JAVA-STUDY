package org.koreait.models.board;

import org.koreait.controllers.boards.BoardForm;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoradWriteService {
    private BoardDAO boardDAO;

    @Autowired
    public void setBoardDAO(BoardDAO boardDAO){
        this.boardDAO = boardDAO;
    }
    public void write(BoardForm boardForm){
        Board board = new Board();
        board.setSubject(boardForm.getSubject());
        board.setContent(boardForm.getContent());

        boardDAO.insert(board);
    }
}
