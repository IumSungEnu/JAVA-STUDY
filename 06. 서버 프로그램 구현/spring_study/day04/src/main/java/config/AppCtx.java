package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan("models") //알아서 검색해서 알려준다.
public class AppCtx {

    @Bean(destroyMethod = "close")  //스프링 컨테이너가 소멸할때 아래 dataSource도 함께 소멸한다.
    public DataSource dataSource(){
        DataSource ds = new DataSource();
        //연결설정
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        ds.setUsername("springdb");
        ds.setPassword("aA123456");
        //커넥션 풀
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setTimeBetweenEvictionRunsMillis(3000);
        ds.setMinEvictableIdleTimeMillis(60000);   //60초

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        return tm;
    }
}
