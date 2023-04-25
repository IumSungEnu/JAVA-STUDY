package org.koreait.models.user;

import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@Builder
public class UserInfo implements UserDetails {//시큐리티가 제공하는 회원정보 기본 틀
    
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private Collection<GrantedAuthority> authorities;  //관리
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { //권한(관리자/구관리자인지)
        return authorities;
    }

    @Override
    public String getPassword() {

        return userPw;
    }

    @Override
    public String getUsername() {

        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {

         return true;  //true로 바꿔준다.(이후 기능을 구현하면 바꿔준다.)
    }

    @Override
    public boolean isAccountNonLocked() { //잠근다

        return true;  //true로 바꿔준다.(이후 기능을 구현하면 바꿔준다.)
    }

    @Override
    public boolean isCredentialsNonExpired() {  //비밀번호 갱신

        return true;  //true로 바꿔준다.(이후 기능을 구현하면 바꿔준다.)
    }

    @Override
    public boolean isEnabled() { //비활성화(탈퇴)

        return true;  //true로 바꿔준다.(이후 기능을 구현하면 바꿔준다.)
    } 
}
