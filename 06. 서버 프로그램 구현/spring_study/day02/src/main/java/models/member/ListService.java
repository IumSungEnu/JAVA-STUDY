package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService { //회원 목록
    @Autowired
    private MemberDAO memberDAO;

    public ListService(){}
    public ListService(MemberDAO memberDAO){
        this.memberDAO = memberDAO;
    }

    public void print(){
        List<Member> members = memberDAO.gets();
        members.stream().forEach(System.out::println);
    }
}
