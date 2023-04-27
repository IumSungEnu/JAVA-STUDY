package org.koreait.restcontroller;

import lombok.RequiredArgsConstructor;
import org.koreait.commons.JSONResult;
import org.koreait.controllers.BoardForm;
import org.koreait.entities.BoardData;
import org.koreait.models.board.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class ApiBoardController {

    private final BoardDeleteService deleteService;
    private final BoardSaveService service;
    private final BoardInfoService infoService;
    private final BoardListService listService;
    private final BoardSaveValidator validator;



    @GetMapping("/b_in") //조회
    public ResponseEntity<Object> boardList(){
        List<BoardData> list = listService.gets();
        JSONResult<Object> jsonResult = new JSONResult<>();
        jsonResult.setSuccess(true);
        jsonResult.setData(list);

        return ResponseEntity.ok(jsonResult);
    }

    @GetMapping("/{id}")
    public BoardData boardData(@PathVariable Long id){
        BoardData boardData = infoService.get(id);

        return boardData;
    }

    @PostMapping("/b_add") //응답코드(추가)
    public ResponseEntity<Object> write(@RequestBody BoardForm boardForm){
        // 검증

        validator.check(boardForm);
        service.save(boardForm);

        return ResponseEntity.ok().build();
    }

    //수정
    @PostMapping("/b_up")
    public ResponseEntity<Object> update(@RequestBody BoardForm boardForm){

        service.save(boardForm);
        return ResponseEntity.ok().build();
    }



    //삭제
    @DeleteMapping("/b_del")
    public ResponseEntity<JSONResult<Object>> delete(@RequestBody BoardForm boardForm){

                deleteService.delete(boardForm.getId());

        return ResponseEntity.ok().build();
   }
}
