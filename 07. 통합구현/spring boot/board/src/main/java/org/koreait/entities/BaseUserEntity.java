package org.koreait.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter @Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseUserEntity extends BaseEntity{
    //회원아이디와 수정자, 추가된

    @CreatedBy       //최초로 추가한 아이디(생성한 아이디)
    @Column(length = 40, updatable = false)
    private String createdBy;

    @LastModifiedBy  //수정한 아이디
    @Column(length = 40, insertable = false)
    private String modifiedBy;
}
