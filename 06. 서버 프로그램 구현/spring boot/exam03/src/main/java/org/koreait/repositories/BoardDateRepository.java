package org.koreait.repositories;

import org.koreait.entities.BoardData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BoardDateRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor { //구현체

    //별도의 패치를 통해서 싹 가져온다.
    //1+N 문제가 발생했을때
    @Query("SELECT b FROM BoardData b LEFT JOIN FETCH b.member") //즉시 로딩 전략(패치만 넣게되면 즉시 로딩이 된다)
                                            //FETCH를 넣게 되면 즉시 로딩이 된다.
    List<BoardData> findBoardDatas();
}
