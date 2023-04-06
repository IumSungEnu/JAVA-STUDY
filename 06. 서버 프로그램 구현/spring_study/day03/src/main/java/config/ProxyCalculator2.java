package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator2 { //스프링 관리 객체가 필요하다 -> @Bean
    @Pointcut("execution(* exam02..*(..))") //공통기능을 수행할 범위(전부 프록시 된다)
    public void publicTarget(){}

    @Around("publicTarget()")  //공통기능을 적용한다.
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{
        //모든 객체의 반환값 Object(매개변수 )

        //System.out.println("핵심기능 수행 전");
        long startTime = System.nanoTime(); //공통기능

        Object result = joinPoint.proceed(); //factorial과 동일한 기능 - 핵심기능 수행

        //System.out.println("핵심기능 수행 후");
        long endTime = System.nanoTime();  //공통기능
        System.out.printf("걸린시간 = %d%n", endTime - startTime);

        return result;
    }
}
