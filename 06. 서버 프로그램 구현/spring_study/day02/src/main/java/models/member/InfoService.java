package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service  //기능에 대한 부분들 모두 Service로 정의
public class InfoService { //관리 객체일때만 가능 -> AppCtx에 객체 설정해야 한다.@Bean
    @Autowired
    private Optional<MemberDAO> opt;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public void print(String userId){
        MemberDAO memberDAO = opt.get();
        Member member = memberDAO.get(userId);

        if(formatter != null) {//formatter가 null값일 경우에만 호출
            String dateStr = formatter.format(member.getRegDt());
            member.setRegDtStr(dateStr);
        }

        System.out.println(member);
    }

    //@Autowired(required = false) -> 의존성이 없으면 아래 코드는 호출되지 x
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter){
        this.formatter = formatter;
    }

}
