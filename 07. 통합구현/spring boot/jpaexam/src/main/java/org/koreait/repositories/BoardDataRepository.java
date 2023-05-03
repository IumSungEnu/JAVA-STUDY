package org.koreait.repositories;

import com.querydsl.core.BooleanBuilder;
import org.koreait.entities.BoardData;
import org.koreait.entities.QBoardData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {
    //ex11 예제소스

    @Query("SELECT b FROM BoardData b LEFT JOIN FETCH b.member WHERE b.subject LIKE %:key%")
    List<BoardData> getBoardData(@Param("key") String keyword);
    // -> 문제점 : 에러가 발생하면 어디에 어떻게 오류가 있는지 찾는데 시간이 많이 걸린다.

    default List<BoardData> getBoardData2(String keyword) {
        BooleanBuilder builder = new BooleanBuilder(); // and, or, not
        QBoardData boardData = QBoardData.boardData;

        builder.and(boardData.subject.contains(keyword))
                .and(boardData.member.userNo.eq(1L)); //조건이 있는 경우 조건작성

        Pageable pageable = PageRequest.of(0, 3, Sort.by(Sort.Order.desc("id"))); //쿼리는 방향만 잡아주면 알아서 생성한다.
        Page<BoardData> page = findAll(builder, pageable);

        //데이터 부분
        List<BoardData> datas = page.getContent();
        return datas;
    }
}
