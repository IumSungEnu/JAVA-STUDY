package org.koreait.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter @Setter
@MappedSuperclass  //공통기능을 사용할때 추가(상위 클래스) -> getter, setter 추가
@EntityListeners(AuditingEntityListener.class) //상태변환
public abstract class BaseEntity {
    //공통 데이터 기능을 수행(추상클래스) -> @Entity를 사용하지 않는다. abstract 추가

    //엔티티 안에서만 사용이 가능(상태변화가 있을 경우)
    @CreatedDate  //처음 추가된 날짜(한번만 사용된다) -> 추가된 날짜가 수정되면 그 데이터를 신뢰할수 x
    @Column(updatable = false)  //추가할때만.(수정(UPDATE) 불가)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime regDt;

    @LastModifiedDate
    @Column(insertable = false)  //수정할때만(상태변화에 따라 - 추가(INSERT) 불가)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime modDt;
}
