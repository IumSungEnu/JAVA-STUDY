package org.koreait.repositories;

import com.querydsl.core.BooleanBuilder;
import org.koreait.entities.Member;
import org.koreait.entities.QMember;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, QuerydslPredicateExecutor {
    Member findByUserId(String userId);

    List<Member> findByUserIdNot(String userId);  //userId를 뺀 나머지 자료를 보고싶을때
                                                  //userId <> ...
    List<Member> findByUserNmContaining(String key); //userNm LIKE '%:key%'

    List<Member> findByRegDtBetween(LocalDate sDate, LocalDate pageable, Pageable eDate);
    //Pageable

    List<Member> findByRegDtBetweenOrderByRegDtDesc(LocalDate sDate, LocalDate eDate);
    //조건이 많아지면 길어진다는 단점이 있다.

    @Query("SELECT m FROM Member m WHERE m.userNm LIKe %:key% ORDER BY m.regDt DESC")
    List<Member> findByUsers(@Param("key") String keyword);
    //단점은 오타가 있으면 실행을 해야지만 알수있어 문제가 있다.(필요한 경우 써야한다.)
    // -> Querydsl를 사용
    
    default List<Member> findUsers(String keyword){
        QMember member = QMember.member; //각각 항목에 해당하는 변수, Q형태가 정의

        BooleanBuilder builder = new BooleanBuilder();
        builder.and(member.userNm.contains(keyword))
                .and(member.userId.notIn("user1", "user2"));

        List<Member> members = (List)this.findAll(builder);

        return members;
    }
}
