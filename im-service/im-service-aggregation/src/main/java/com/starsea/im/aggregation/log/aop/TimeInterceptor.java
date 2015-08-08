package com.starsea.im.aggregation.log.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Marker;
import org.springframework.stereotype.Component;

/**
 * @author xujin.wang@dianping.com
 */
@Aspect
@Component
@Slf4j
public class TimeInterceptor {

    @Pointcut("execution(* com.starsea.im.aggregation.service.impl.*.*(..))")
    private void actionMethod() {
    }

    @Around("actionMethod()")
    public Object interceptor(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = pjp.proceed();

        log.info("class:{}\tmethod:{}\ttake {} ms",
                new Object[]{pjp.getSignature().getDeclaringType().getSimpleName(),
                pjp.getSignature().getName(),
                System.currentTimeMillis() - startTime});
        return proceed;
    }
}
