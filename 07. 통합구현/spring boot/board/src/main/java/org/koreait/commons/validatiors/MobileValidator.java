package org.koreait.commons.validatiors;

public interface MobileValidator { //전화번호 공통기능으로 추가하기 위해 클래스 생성
    default boolean mobileCheck(String mobile){
        //1. 형식을 통일화(숫자만 남긴다)
        //2. 형식을 체크
        mobile = mobile.replaceAll("\\D", "");
        
        //패턴
        String pattern = "^01[016]\\d{3,4}\\d{4}$";
                        //010,011,016  \\d{숫자} - 숫자는 전화번호 숫자의 개수
        return mobile.matches(pattern); //패턴이 맞으면 참, 아니면 거짓으로 판단
    }
}
