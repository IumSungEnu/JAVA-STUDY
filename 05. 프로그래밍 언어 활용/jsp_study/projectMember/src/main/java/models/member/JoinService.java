package models.member;

import validators.Validator;

public class JoinService {

    private Validator validator;
    //private Validator validator = new JoinValidator;를 지정하게 되면 통제하기가 어렵다
    //문제가 있다. -> 의존성, 소스를 지정하는 것은 좋지 않다.
    //그렇기에 다형성을 이용해 변수만 지정해준다.

    private MemberDAO memberDAO;

    public JoinService(MemberDAO memberDAO, Validator validator){
        this.memberDAO = memberDAO;  //생성자 매개변수 작성
        this.validator = validator;  //생성자 매개변수 작성
    }

    public void join(Member member){ //통과시키기

        //null값일 경우
        //if(member == null){
        //   throw new BadRequestException("잘못된 접근입니다.");
        //}

        //회원가입 유효성 검사 dataValuidation2() -> BadRequestException
        validator.check(member);

        //회원 가입 처리
        memberDAO.register(member);
    }

    //public void setValidator(Validator validator){
    //    this.validator = validator;
    //}
}
