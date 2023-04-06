package exam02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Message message = ctx.getBean(Message.class); //컨테이너 안에 객체를 꺼내서 조회
        message.send("메세지");

        Message message2 = ctx.getBean(Message.class);
        System.out.println(message == message2);

        ctx.close();
    }
}
