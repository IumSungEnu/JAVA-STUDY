package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity @Data
public class Member extends BaseEntity{
    @Id
    @GeneratedValue  //기본키 - 반드시 있어야 한다.
    private Long userNo;

    @Column(length = 40, unique = true, nullable = false) //nullable = false(중복불가)
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 40, nullable = false)
    private String userNm;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)  //연관관계의 주인을 명시 - 여기서는 BoardData에 있는 member
    private List<BoardData> boardData = new ArrayList<>();

    /*
    @ManyToOne
    @JoinColumn(name = "managerNo")
    private Member manager; //매니저
    */

    @OneToOne
    @JoinColumn(name = "addressId")
    @ToString.Exclude
    private Address address;
}
