package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity { //공통적인 엔티티 설정
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false)  //수정불가 - 신회성
    @CreatedDate //엔티티의 상태변화에 따라(이벤트성)
    private LocalDateTime regDt;  //등록한 날짜

    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false)  //추가불가
    @LastModifiedDate //엔티티의 상태변화에 따라(이벤트성)
    private LocalDateTime modDt;  //수정한 날짜
}
