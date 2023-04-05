package members;

public class MemberJoinService {

    private MemberValidator validator;

    public void join(Member member){ //회원가입 메서드
        validator.check(member);
    }

    public void setValidator(MemberValidator validator){
        this.validator = validator;
    }
}
