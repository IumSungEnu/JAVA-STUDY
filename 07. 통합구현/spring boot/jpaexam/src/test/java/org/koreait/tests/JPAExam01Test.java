package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@Transactional
public class JPAExam01Test {

    @Autowired
    private EntityManager em;

    @Test
    @DisplayName("엔티티 테이블 생성 테스트")
    void test01(){
        Member member = new Member();
        member.setUserNo(1L);
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("사용자01");

        //추가
        em.persist(member);  //영속성 추가(상태변화 감지) -> member : 영속성 관리 상태
        em.flush();  //DB에 상태변경 사항 반영 - insert 쿼리

        em.detach(member);  //상태변화 감지x -> 여기에 있으면 아래 수정된 이름이 반영되지 않는다.

        //수정
        member.setUserNm("(수정)사용자01");  //상태가 변경
        em.flush();  //update 쿼리 생성
        
        em.merge(member);  //상태변화 감지o -> 분리상태 -> 영속성 관리 상태 --> 수정된 이름이 반영된다.

        //조회
        Member member2 = em.find(Member.class, member.getUserNo());
        System.out.println(member2);


        //삭제
        //em.remove(member);
        //em.flush();  //delete 쿼리


        String sql = "SELECT m FROM Member m WHERE userNo = :userNo";  //별칭을 해야 오류가 안난다.
        TypedQuery<Member> typedQuery = em.createQuery(sql, Member.class);
        typedQuery.setParameter("userNo", member.getUserNo());

        List<Member> members = typedQuery.getResultList();
        //System.out.println(members);
        members.get(0).setUserNm("(수정2)사용자01");

        em.flush();
    }
}
