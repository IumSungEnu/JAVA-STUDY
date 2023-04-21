package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor //기본생성자가 꼭 필요할 경우 편법으로 사용 가능하다.
                                       // (@Builder을 쓰고 싶을때) - 기본생성자 생성
public class Member extends BaseEntity{
    @Id @GeneratedValue
    private Long userNo;

    @Column(length = 45, nullable = false, unique = true)
    private String userId;

    @Column(length = 65, nullable = false)
    private String userPw;

    @Column(length = 45, nullable = false)
    private String userNm;

    @Column(length = 100)
    private String email;

    @Column(length = 11)
    private String mobile;

    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    //fetch = FetchType.EAGER은 자주 사용하지는 않지만 알아만 두자.
    //BoardData쪽의 member라고하는 변수명을 지정
    //데이터 수정을 할수 없다.
    private List<BoardData> boardData = new ArrayList<>();

    @ToString.Exclude
    @OneToOne(fetch = FetchType.LAZY)
    //@OneToOne - 한개의 테이블만 가지고 있다. (한명의 회원이 하나의 주소를 가지고 있다)
    @JoinColumn(name = "addressId") //주소 매핑
    private MemberAddress address;

}
