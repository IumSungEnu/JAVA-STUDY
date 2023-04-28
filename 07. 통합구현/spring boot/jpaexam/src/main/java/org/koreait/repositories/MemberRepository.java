package org.koreait.repositories;

import org.koreait.entities.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    //구현체가 만들어진다.

    Member findByUserId(String userId);

    List<Member> findByUserNmContaining(String userNm, Pageable pageable);  // %키워드%

    List<Member> findByRegDtBetween(LocalDate sdate, LocalDate edate);

    List<Member> findByUserNmContainingOrderByRegDtDesc(String userNm);

    //하지만 이렇게 하면 변수명이 너무 길어진다는 단점이 있다.
    //이때 사용하는게 pageable이다.(페이징)

    @Query("SELECT m FROM Member m WHERE m.userNm LIKE %:key% ORDER BY m.regDt DESC")
    List<Member> findMembers(@Param("key") String key);



}
