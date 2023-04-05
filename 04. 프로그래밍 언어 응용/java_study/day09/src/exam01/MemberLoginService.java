package exam01;

public class MemberLoginService {
    public void login(String id, String pw) throws IdIncorrectException, PwIncorrectException{
        // id = user01, pw = 123456

        /* id */
        if(id == null || !id.equals("user01")){ //id가 null 또는 user01이 아닌 경우(일치하지 않은 경우)
            throw new IdIncorrectException("아이디가 일치하지 않습니다.");
        }

        /* pw */
        if(pw == null || !pw.equals("123456")){ //pw가 null 이거나 또는 123456이 아닌 경우
            throw new PwIncorrectException("비밀번호가 일치하지 않습니다.");
        }
    }
}
