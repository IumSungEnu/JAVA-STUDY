package models.member;

import data.WithData;

public class ServiceManager { //회원정보 수정/관리를 위한 매니저

        public WithData MemberJoinData(){
            return  new MemberJoinData();
        }

        public MemberJoinService getMemberJoinService(){
            MemberJoinService service = new MemberJoinService();
            service.setWithData(MemberJoinData());

            return service;
    }
}
