package org.koreait.repositories;

import org.koreait.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UsersRepository extends JpaRepository<Users, Long>, QuerydslPredicateExecutor {
    //인터페이스에 완성된 인스턴스를 추가한다.

    Users findByUserId(String userId);  //구현체 생성(회원정보 조회 - userInfoService)

    //가입된 회원여부 체크
    default boolean userExists(String userId) {
        QUsers users = QUsers.users;

        boolean exists = exists(users.userId.eq(userId));

        return exists;
    }
}
