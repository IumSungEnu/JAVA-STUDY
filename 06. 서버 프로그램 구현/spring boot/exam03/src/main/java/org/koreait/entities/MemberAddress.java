package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class MemberAddress extends BaseEntity{
    //회원과 주소의 일대일 매핑
    @Id @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String zipCode;  //우편번호

    @Column(length = 100, nullable = false)
    private String addr1;   //주소

    @Column(length = 10)
    private String addr2;   //나머지 주소

    @OneToOne(mappedBy = "address", fetch = FetchType.LAZY)
    //@OneToOne은 외래키가 있는 쪽이 주인이기 때문에 Member가 주인이다.
    Member member;
}
