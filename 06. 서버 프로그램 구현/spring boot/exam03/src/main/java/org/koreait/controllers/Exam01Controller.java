package org.koreait.controllers;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceUnit;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.koreait.entities.BoardData;
import org.koreait.entities.Member;
import org.koreait.entities.MemberAddress;
import org.koreait.entities.QBoardData;
import org.koreait.repositories.BoardDateRepository;
import org.koreait.repositories.MemberAddressRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Log
@RestController
@RequiredArgsConstructor
public class Exam01Controller {

    private final BoardDateRepository boardDateRepository;
    private final MemberRepository memberRepository;
    private final MemberAddressRepository memberAddressRepository; //주소 추가
    private final EntityManager em;

    @GetMapping("/ex01")
    public void ex01(){
        Member member = Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .mobile("01000000000")
                .email("user01@user.org")
                .build();

        member = memberRepository.saveAndFlush(member); //회원추가

        List<BoardData> datas = new ArrayList<>(); //데이터 10개를 한꺼번에 추가
        for(int i = 1; i <= 10; i++){
            BoardData data = BoardData.builder()
                    .subject("제목" + i)
                    .content("내용" + i)
                    .member(member)
                    .build();
            datas.add(data);
        }

        boardDateRepository.saveAllAndFlush(datas);

    }

    @GetMapping("/ex02")
    public void ex02(){
        BoardData data = boardDateRepository.findById(1L).orElse(null); //BoardData 인티티만 조회
        //log.info(data.toString());
        //Member member = data.getMember();
        //log.info(member.toString());

        Member member = data.getMember();
        String userId = member.getUserId(); //쿼리 실행
        log.info(userId);
    }

    @GetMapping("/ex03")
    public void ex03(){
        Member member = memberRepository.findById(1L).orElse(null);
        List<BoardData> boardDatas = member.getBoardData();

        boardDatas.stream().forEach(System.out::println);
    }

    //면접에서 자주 나오는 문제이니 기억해두자.
    //1+N 문제가 발생한다.
    @GetMapping("/ex04")
    public void ex04(){
        List<BoardData> boardDatas = boardDateRepository.findAll(); //쿼리가 날라간다.
        //1번만 조회하는데 10번이 조회된다.
        for(BoardData boardData : boardDatas){
            Member member = boardData.getMember();
            String userId = member.getUserId();
            String userNm = member.getUserNm();
            log.info("userId=" + userId + ", userNm=" + userNm);
        }
    }

    @GetMapping("/ex05")
    public void ex05(){  //패치를 이용한 즉시 로딩 예(BoardDateRepository 인터페이스)
        List<BoardData> boardDatas = boardDateRepository.findBoardDatas();
    } //join 꼭 기억하기★★★

    @GetMapping("/ex06")
    @Transactional
    public void ex06() {
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        QBoardData boardData = QBoardData.boardData;
        JPAQuery<BoardData> query = queryFactory.selectFrom(boardData)
                .leftJoin(boardData.member)
                .orderBy(boardData.regDt.desc())
                .fetchJoin();

        List<BoardData> datas = query.fetch();
        datas.stream().forEach(System.out::println);

    }
    
    @GetMapping("/ex07")
    public void ex07(){
        MemberAddress address = MemberAddress.builder()
                .addr1("주소1")
                .addr2("주소2")
                .zipCode("10000")  //우편번호
                .build();

        address = memberAddressRepository.saveAndFlush(address);

        Member member = Member.builder()
                .userId("user02")
                .userPw("123456")
                .userNm("사용자02")
                .address(address)
                .mobile("01011112222")
                .build();

        memberRepository.save(member);
    }

    @GetMapping("/ex08")
    public void ex08(){
        //회원 -> 주소
        Member member = memberRepository.findById(2L).orElse(null);
        MemberAddress address = member.getAddress();
        log.info(address.toString());
    }

    @GetMapping("/ex09")
    public void ex09(){
        //주소조회 -> 회원
        MemberAddress address = memberAddressRepository.findById(1L).orElse(null);
        Member member = address.getMember();
        //여기까지는 쿼리가 날라가지 않는다.
        log.info(member.toString());  //쿼리가 날라간다.
    }

    @GetMapping("/ex10")
    public void ex10(){ //Member에 cascade = CascadeType.REMOVE 추가
        Member member = memberRepository.findById(1L).orElse(null);
        memberRepository.delete(member);
        memberRepository.flush();
    }

    //쓰다보면 기본키가 여러개 있어야 하는 경우도 있다.
    
}
