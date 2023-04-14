package org.koreait.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
//@Transactional
public class BoardDAOTest { //단일 테스트
    
    @Autowired
    private BoardDAO boardDAO;
    
    @Test
    @DisplayName("게시글 추가 테스트")
    public void insertTest(){
        Board board = new Board();
        board.setSubject("제목");
        board.setContent("내용");

        boolean result = boardDAO.insert(board);

        assertTrue(result);
    }
    
    @Test
    @DisplayName("게시글 조회 테스트")
    public void getTest(){
        Board board = boardDAO.get(3L);
        System.out.println(board);
    }
}
