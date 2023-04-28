package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address extends BaseEntity{ //회원한명이 하나의 주소를 가지고 있다(일대일 - OneToOne)

    @Id @GeneratedValue
    private Long id;

    private String zipcode;

    private String addr1;

    private String addr2;

    @OneToOne(mappedBy = "address")  //Member에 정의된 address
    private Member member;
}
