package models.member;

import data.WithData;

public class MemberJoinService {

    private WithData withData;

    public void JoinSv(Member member){
        withData.dataCheck(member);
    }

    public void setWithData(WithData withData){
        this.withData = withData;
    }

    public void idcheck(){}
}
