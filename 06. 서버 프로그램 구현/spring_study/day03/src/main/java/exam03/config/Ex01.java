package exam03.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        TestDAO dao = ctx.getBean(TestDAO.class);
        dao.insert();

        ctx.close();
    }
}
