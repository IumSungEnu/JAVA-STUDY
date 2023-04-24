package org.koreait.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity @Builder
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity{

    @Id @GeneratedValue  //@GeneratedValue - 증감번호
    private Long id;  //게시글 번호

    @Column(nullable = false)
    private String subject; //제목

    @Lob
    @Column(nullable = false)
    private String content; //내용


    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY) //FetchType.EAGER : 즉시 로딩(처음부터 join 생성) - 문제점: 로딩지연(성능저하)
                                        //FetchType.LAZY : 지연 로딩(기본적으로 사용)
    //many쪽이 주인이다 - 외래키를 가지고 있기 때문에.(외래키를 바꾸면 관례가 바뀌기 때문에)
    @JoinColumn(name="userNo")
    private Member member;  //id_userNo

}
