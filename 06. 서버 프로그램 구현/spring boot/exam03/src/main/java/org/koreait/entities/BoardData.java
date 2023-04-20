package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class BoardData extends BaseEntity{

    @Id @GeneratedValue  //@GeneratedValue - 증감번호
    private Long id;  //게시글 번호

    @Column(nullable = false)
    private String subject; //제목

    @Lob
    @Column(nullable = false)
    private String content; //내용


    @ManyToOne
    @JoinColumn(name="userNo")
    private Member member;  //id_userNo

}
