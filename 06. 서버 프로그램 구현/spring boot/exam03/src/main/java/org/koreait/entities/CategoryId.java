package org.koreait.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor  //생성자
@AllArgsConstructor //생성자
@EqualsAndHashCode
public class CategoryId implements Serializable { //과거 방식
    private String cateCd;
    private String subCateCd;
    //중복제거 기능으로 추가 - 입셉터, 해시

}
