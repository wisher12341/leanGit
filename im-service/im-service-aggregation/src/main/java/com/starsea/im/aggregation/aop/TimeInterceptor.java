package com.starsea.im.aggregation.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by beigua on 2015/8/12.
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
