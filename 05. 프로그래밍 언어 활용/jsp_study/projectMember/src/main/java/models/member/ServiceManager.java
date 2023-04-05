package models.member;

import models.member.JoinService;
import models.member.JoinValidator;
import models.member.MemberDAO;
import validators.Validator;

public class ServiceManager { //별도의 서비스 매니저를 지정
    //service = new JoinService();
    //service.setValidator(new JoinValidator());
    //         ↓  MemberJoinTest에 있는...
    public Validator joinValidator(){
        return  new JoinValidator();
    }

    public Validator loginValidator(){
        LoginVaildator vaildator = new LoginVaildator();
        vaildator.setMemberDAO(memberDAO());

        return vaildator;
    }

    public MemberDAO memberDAO(){
        return new MemberDAO();
    }

    public JoinService getJoinService(){
        return new JoinService(memberDAO(), joinValidator());
        //service.setValidator(joinValidator());
        //return service;
    }

    public LoginService getLoingService(){
        return new LoginService(memberDAO(), loginValidator());
    }
}

