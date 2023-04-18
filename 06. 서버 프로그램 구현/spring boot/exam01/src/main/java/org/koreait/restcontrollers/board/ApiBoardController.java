package org.koreait.restcontrollers.board;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.commons.CommonException;
import org.koreait.commons.JSONResult;
import org.koreait.controllers.boards.BoardForm;
import org.koreait.models.board.Board;
import org.koreait.models.board.BoardDAO;
import org.koreait.models.board.BoradWriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@Log
@RestController
@RequestMapping("/api/boards")    //실제 게시판을 만들때는 서비스도 만들어 연동한다.
                                  // 지금은 간단하게만 만들어 보자.
@RequiredArgsConstructor
public class ApiBoardController {
    private final BoardDAO boardDAO;

    private final BoradWriteService service;

    /*
    @GetMapping
    public List<Board> boardList(){
        List<Board> list = boardDAO.gets();

        return list;
    }
    */

    @GetMapping
    public ResponseEntity<JSONResult<List<Board>>> boardList() {
        List<Board> list = boardDAO.gets();
        JSONResult<List<Board>> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(true);
        jsonResult.setData(list);

        return ResponseEntity.ok(jsonResult);
    }

    @GetMapping("/{id}")
    public Board board(@PathVariable Long id){
        Board board = boardDAO.get(id);

        return board;
    }

    @PostMapping("/write")
    //public void write(@RequestBody BoardForm boardForm){ // boardForm에 데이터 요청
    public ResponseEntity<List<Board>> write(@RequestBody BoardForm boardForm){
        //@Log를 추가해준다.
        //log.info(boardForm.toString());

        /*
        boolean result = true;
        if (result) {
            throw new CommonException("게시글 등록 실패", HttpStatus.BAD_REQUEST);
        }
        */

        service.write(boardForm); //응답 코드를 반환한다.

        /*
        List<Board> boards = boardDAO.gets();
        return ResponseEntity.status(HttpStatus.CREATED) //201
                             //.body(boards);
                             .build(); //응답 데이터 없이 코드만 출력된다.
        */

        return ResponseEntity.created(URI.create("/board/list")).build();
    }

    /*
    //CommonRestController에 복사, 붙여넣기 하고 여기있던 코드는 주석처리 하거나 지운다.

    @ExceptionHandler(Exception.class)  //공통 오류페이지
    //public String errorHandler(){
    public ResponseEntity<JSONResult<Object>> errorHandler(Exception e){

        //e -> CommonExcecption 클래스로부터 만들어진 객체이면 -getStatus()
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; //500 - 기본 응답 코드
        if(e instanceof CommonException){
            CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }
        JSONResult<Object> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(false);
        jsonResult.setMessage(e.getMessage());
        jsonResult.setStatus(status);

        return ResponseEntity.status(status).body(jsonResult);
    }
    */
}

//시험에 나온다.
