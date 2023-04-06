package exam03.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration  
public class AppCtx { //설정 클래스
    @Bean
    public DataSource dataSource(){ //127.0.0.1
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        DataSource ds = new DataSource();
        //데이터베이스 연결 설정
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl(url);
        ds.setUsername("scott");
        ds.setPassword("tiger");
        //연결의 유효성
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(3000); //3초마다 유휴 객체 연결 확인(체크 주기)
        ds.setMinEvictableIdleTimeMillis(60000);   //60초 이후 연결 객체 다시 생성


        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        //dataSource()의 의존 객체 - 생성자 매개변수
        JdbcTemplate jdbcTemplate = new JdbcTemplate();  //dataSource()가 생성자 매개변수가 될수 있다.
        jdbcTemplate.setDataSource(dataSource());

        return jdbcTemplate;

    }

    @Bean
    public TestDAO testDAO(){
        return new TestDAO();
    }
}
