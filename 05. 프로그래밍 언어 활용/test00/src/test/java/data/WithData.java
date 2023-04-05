package data;

import models.member.Member;

public interface WithData {
    default void dataCheck(String value, RuntimeException e){
        if(value == null || value.isBlank()){
            throw e;
        }
    }

    void dataCheck(Member member);
}
