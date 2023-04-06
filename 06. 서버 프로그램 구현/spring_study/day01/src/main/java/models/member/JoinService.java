package models.member;

public class JoinService {
    private MemberDAO memberDAO;

    public JoinService(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    public void join(Member member){
        memberDAO.insert(member);
    }
}
