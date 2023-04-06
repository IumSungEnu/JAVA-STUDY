package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {
    private MemberDAO memberDAO;

    @Autowired
    //@Autowired : 의존성을 해결해 준다.(객체를 대신 꺼내고 주입해준다) - 자동주입
    public void setMemberDAO(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    public void join(Member member){
        memberDAO.insert(member);
    }
}
