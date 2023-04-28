package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass  //추상메서드
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {  //이제 활성화를 시켜야 한다 -> config폴더에 mvcConfig 생성

    @CreatedDate
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime regDt;  //가입 날짜

    @LastModifiedDate
    @Column(insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modDt;  //수정 날짜
}
