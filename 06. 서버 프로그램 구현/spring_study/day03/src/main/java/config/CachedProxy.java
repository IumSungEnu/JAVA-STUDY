package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Order(1)  //숫자를 지정하여 먼저 수행할 프록시를 지정한다. order가 없으면 순서가 바뀐다.
@Aspect
public class CachedProxy {

    private Map<Long, Object> cacheData = new HashMap<>();
    @Pointcut("execution(* exam02..*(long))")
    public void cachedTarget(){}

    @Around("cachedTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{
        
        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];
        if(cacheData.containsKey(num)){ //기존 데이터가 있으면 캐시 데이터 사용
            System.out.printf("[%d] 캐시 사용%n", num);
            return cacheData.get(num);
        }
        
        Object result = joinPoint.proceed(); //다음 프록시가 있으면 다음 프록시가 수행 -> factorial 프록시

        //없으면 캐시에 기록
        cacheData.put(num, result);
        System.out.printf("[%d] 캐시 추가%n", num);

        return result;
    }
}
