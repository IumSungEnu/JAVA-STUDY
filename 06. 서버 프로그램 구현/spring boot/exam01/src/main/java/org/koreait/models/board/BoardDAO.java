package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

@Component
@RequiredArgsConstructor
public class BoardDAO {
    
    private final JdbcTemplate jdbcTemplate;
    
    //게시글 추가
    public boolean insert(Board board){

        String sql = "INSERT INTO BOARD (ID, SUBJECT, CONTENT) " +
                " VALUES (SEQ_BOARD.nextval, ?, ?)";
        int cnt = jdbcTemplate.update(sql, board.getSubject(), board.getContent());

        return cnt > 0;
    }
    
    //게시글 조회
    public Board get(Long id){

        try {
            String sql = "SELECT * FROM BOARD WHERE ID =?";

            //람다식으로 바꾸기
            Board board = jdbcTemplate.queryForObject(sql, this::boardMapper, id);
            return board;

        }catch (Exception e){
            e.printStackTrace();
            return null; //임시
        }
    }

    private Board boardMapper(ResultSet rs, int i) throws SQLException {
        Board board = new Board();
        board.setId(rs.getLong("ID"));
        board.setSubject(rs.getString("Subject"));
        board.setContent(rs.getString("Content"));
        board.setRegDt(rs.getTimestamp("RegDt").toLocalDateTime());
        Timestamp modDt = rs.getTimestamp("MODDT");

        if(modDt != null){
            board.setModDt(modDt.toLocalDateTime());
        }
        return board;
    }
}
