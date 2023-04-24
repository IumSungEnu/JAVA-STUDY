package org.koreait.models.user;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.users.JoinForm;
import org.koreait.entities.Users;
import org.koreait.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserSaveService {  //회원정보 저장/수정 페이지
    private final UsersRepository repository;

    private final PasswordEncoder passwordEncoder;

    public void save(JoinForm joinForm){

        //Users user = Users.builder()
        //        .userId()
        //양식이 몇개 안되면 사용하지만 여러개면가 있으면 작성하기 너무 번거롭다.
        //그래서 UserForm에 변환 메서드를 추가해 변환해준다.

        Users user = JoinForm.of(joinForm);

        //비밀번호 인코딩
        String hash = passwordEncoder.encode(joinForm.getUserPw());
        user.setUserPw(hash);

        repository.saveAndFlush(user);  //
    }
}
