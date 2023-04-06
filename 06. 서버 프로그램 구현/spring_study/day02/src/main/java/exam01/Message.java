package exam01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    public void send(String msg){
        System.out.printf("전송 메시지 : %s%n", msg);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AfterPropertiesSet");
        //afterPropertiesSet() :
    }

    @Override
    public void destroy() throws Exception { //자원 확립
        System.out.println("Destroy");
        //ctx.close();가 있어야지 호출이 가능하다 - ctx.close();가 없으면 호출x
    }
}
