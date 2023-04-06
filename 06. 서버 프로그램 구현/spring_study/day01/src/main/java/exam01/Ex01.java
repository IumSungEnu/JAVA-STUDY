package exam01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Hello hello = ctx.getBean("hello", Hello.class); //객체를 찾는다.
        hello.greet("이이름");

        Hello hello2 = ctx.getBean("hello", Hello.class);
        hello2.greet("김이름");

        System.out.println(hello == hello2);  //싱글턴 패턴으로 관리

        ctx.close();  //싹 비우고 제거
    }
}
