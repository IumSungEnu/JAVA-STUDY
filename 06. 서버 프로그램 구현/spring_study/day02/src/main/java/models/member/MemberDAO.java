package models.member;

import config.ManualBean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ManualBean
public class MemberDAO {
    private static Map<String, Member> members = new HashMap<>();

    //회원가입
    public void insert(Member member){
        member.setRegDt(LocalDateTime.now());
        members.put(member.getUserId(), member);
    }

    //회원 데이터 조회
    public Member get(String userId){
        return members.get(userId);
    }

    //회원 전체 조회
    public List<Member> gets(){

        //map에 있는 데이터를 list로 바꿔 출력
        List<Member> list = new ArrayList<>(members.values());
        
        return list;
    }
}

