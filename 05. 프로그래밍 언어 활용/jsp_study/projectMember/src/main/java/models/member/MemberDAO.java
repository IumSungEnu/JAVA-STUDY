package models.member;

import java.util.HashMap;
import java.util.Map;

public class MemberDAO { //접근할수 있는 객체
    private static Map<String, Member> members = new HashMap<>();

    /* 회원정보 조회 */
    public Member get(String userId){
        return members.get(userId);
    }

    /* 회원정보 추가 */
    public void  register(Member member){
        members.put(member.getUserId(), member);
    }
    
    /* 회원정보 삭제 */
    public void delete(String userId){
        members.remove(userId);
    }
}
