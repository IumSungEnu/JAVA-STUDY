package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
@Transactional  //전체 메서드를 사용하기 위해 클래스에 넣어도 되고 각각의 메서드에 넣어도 된다.
public class MemberDAO {
    private JdbcTemplate jdbcTemplate;
    
    @Autowired  //유효성 자동주입
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    
    //회원정보 추가
    /*
    public boolean insert(Member member){
        String sql = "INSERT INTO MEMBER (userNo, userId, userPw,userNm) " +
                " VALUES (SEQ_MEMBER.nextval, ?, ?, ?)";

        int cnt = jdbcTemplate.update(sql, member.getUserId(), member.getUserPw(), member.getUserNm());
        //cnt가 반영된 레코드의 갯수 -> 0개 이상이 나오면 성공

        return cnt > 0;
    }
    */

    //@Transactional
    public long insert(Member member){
        String sql = "INSERT INTO MEMBER (userNo, userId, userPw, userNm) " +
                " VALUES (SEQ_MEMBER.nextval, ?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        int cnt = jdbcTemplate.update(c -> { //람다식 표현

                PreparedStatement pstmt = c.prepareStatement(sql, new String[]{"userNo"});
                pstmt.setString(1, member.getUserId());
                pstmt.setString(2, member.getUserPw());
                pstmt.setString(3, member.getUserNm());

                return pstmt;

        }, keyHolder);

        Number keyValue = keyHolder.getKey(); //증감 번호 - long, int
        long userNo = keyValue.longValue();

        return userNo;
    }

    //회원정보를 아이디로 조회
    public Member get(String userId) {
        try {
            String sql = "SELECT * FROM MEMBER userId = ?";
            Member member = jdbcTemplate.queryForObject(sql, this::memberMapper);

            return member;
        } catch (Exception e) {
            return null;
        }
    }

    //회원목록 조회
    public List<Member> gets(){
        String sql = "SELECT * FROM MEMBER";
        List<Member> members = jdbcTemplate.query(sql, this::memberMapper);

        return members;
    }

    private Member memberMapper(ResultSet rs, int i) throws SQLException{
        Member member = new Member();
        member.setUserNo(rs.getLong("USERNO"));
        member.setUserId(rs.getString("USERID"));
        member.setUserPw(rs.getString("USERPW"));
        member.setUserNm(rs.getString("USERNM"));
        member.setRegDt(rs.getTimestamp("regDt").toLocalDateTime());

        return member;
    }

    //회원정보 삭제
    public boolean delete(String userId){
        String sql = "DELETE FROM MEMBER WHERE userId = ?";
        int cnt = jdbcTemplate.update(sql, userId);


        return cnt > 0;
    }

    //전체 회원 수
    public long getTotal(){
        long total = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM MEMBER", Long.class);
        return total;
    }
    
}
