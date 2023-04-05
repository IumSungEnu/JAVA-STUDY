package models.member;

import validators.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JoinValidator implements Validator<Member>{

    @Override
    public void check(Member member) { //Validator 설계를 추가해서 통일성 있게...
        if (member == null) {
            throw new BadRequestException("잘못된 접근입니다.");
        }

        String userId = member.getUserId();      //객체 생성
        String userPw = member.getUserPw();      //객체 생성
        String userPwRe = member.getUserPwRe();  //객체 생성
        String userNm = member.getUserNm();      //객체 생성

        /* 필수 입력항목 체크 S */
        //System.out.println(member);
        requeiredCheck(userId, new BadRequestException("아이디를 입력하세요."));     //예외발생 메세지
        requeiredCheck(userPw, new BadRequestException("비밀번호를 입력하세요."));   //예외발생 메세지
        requeiredCheck(userPwRe, new BadRequestException("비밀번호를 재입력하세요."));  //예외발생 메세지
        requeiredCheck(userNm, new BadRequestException("회원명을 입력하세요."));    //예외발생 메세지
        /* 필수 입력항목 체크 E */

        /* userId 자리수 체크 - 6자리 이상 */
        strLengthCheck(userId, 6, new BadRequestException("아이디는 6자리 이상 입력하세요."));

        /* userId를 알파벳으로만 한정 */
        //System.out.println(userId.matches("[^a-zA-Z]"));
        Pattern pattern = Pattern.compile("[^a-zA-Z]");
        Matcher matcher = pattern.matcher(userId);
        if (matcher.find()) {
            throw new BadRequestException("아이디는 알파벳으로만 입력하세요.");
        }

        /* userPw 자리수는 8자리 이상 체크 */
        strLengthCheck(userPw, 8, new BadRequestException("비밀번호는 8자리 이상 입력하세요."));

        /* userPw가 알파벳, 숫자, 특수문자 최소 1개 이상 포함 여부 */
        Pattern alphaP = Pattern.compile("[a-zA-Z]");  //대소문자 알파벳 포함 여부
        Pattern numP = Pattern.compile("[0-9]");       //숫자 포함 여부
        Pattern specialCharsP = Pattern.compile("[_!@#\\$%^&\\*\\(\\)]");

        Matcher matcher1 = alphaP.matcher(userPw);
        Matcher matcher2 = numP.matcher(userPw);
        Matcher matcher3 = specialCharsP.matcher(userPw);

        //System.out.println(userPw);
        //System.out.println(matcher1.find());
        //System.out.println(matcher2.find());
        //System.out.println(matcher3.find());

        if(!matcher1.find() || !matcher2.find() || !matcher3.find()){
            throw new BadRequestException("비밀번호는 알파벳, 숫자, 특수문자가 1개 이상 포함되어야 합니다.");
        }

        /* userPw, userPwRe 일치 여부 */
        if(!userPw.equals(userPwRe)){
            throw new BadRequestException("비밀번호가 일치하지 않습니다.");
        }
    }
}
