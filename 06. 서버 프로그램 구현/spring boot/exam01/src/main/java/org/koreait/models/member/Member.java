package org.koreait.models.member;

public class Member {
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;

    private Member(){} //이렇게하면 객체를 절대 못만든다.

    @Override
    public String toString() {
        return "Member{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userNm='" + userNm + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    protected static class Builder{
        //여기서 객체를 만든다.

        private Member member = new Member();
        public  Builder userNo(Long userNo){
            member.userNo = userNo;
            return this;
        }

        public Builder userId(String userId){
            member.userId = userId;
            return this;
        }

        public Builder userPw(String userPw){
            member.userPw = userPw;
            return this;
        }

        public Builder userNm(String userNm){
            member.userNm = userNm;
            return this;
        }

        public Member build(){
            return member;
        }
    }


}
