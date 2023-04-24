package org.koreait.models.user;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.Users;
import org.koreait.repositories.UsersRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInfoService implements UserDetailsService {

    private final UsersRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //세션에서 항상 넘겨준다.
        //현재조회에서 회원정보를 볼수 있다.

        //UsersRepository 인터페이스
        Users user = repository.findByUserId(username);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }

        return UserInfo.builder()
                .userNm(user.getUserNm())
                .userId(user.getUserId())
                .userPw(user.getUserPw())
                .email(user.getEmail())
                .mobile(user.getMobile())
                .build();
    }
}
