package org.koreait.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @Builder
@NoArgsConstructor @AllArgsConstructor
//@IdClass(Category.class)  //추가
public class Category {
    @Id
    private String cateCd;
    @Id
    private String subCateCd;

    private String cateNm;
} //@Id만 있을경우 오류가 발생한다. -> @IdClass(Category.class) 추가해야 한다.(과거방식)
