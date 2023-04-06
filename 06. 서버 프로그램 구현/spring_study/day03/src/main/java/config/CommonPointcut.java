package config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {

    @Pointcut("execution(* exam02..*(..))") //공통기능을 수행할 범위(전부 프록시 된다)
    public void publicTarget(){}

}
