package org.koreait.config;

import org.koreait.models.user.UserInfo;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> { //초기에 작업하는게 좋다.(수정자)
    //아이디를 가지고... -> String 정의

    @Override
    public Optional<String> getCurrentAuditor() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        /*
        principal는 null값이 아니다
        principal -> String : 비회원 (Anonymous)
                  -> UserDatails 구현체이면 인스턴스오브를 사용한다.
        */
        String userId = null;
        if (principal instanceof UserInfo) {
            UserInfo user = (UserInfo)principal;
            userId = user.getUserId();
        }

        return Optional.ofNullable(userId);
    }

}
