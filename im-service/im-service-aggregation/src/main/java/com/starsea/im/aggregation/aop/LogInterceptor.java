package com.starsea.im.aggregation.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by beigua on 2015/8/12.
 * print method logs
 */
@Component
@Aspect
@Slf4j
public class LogInterceptor {


    @Before("@annotation(com.starsea.im.aggregation.aop.LogParams)")
    public void before(JoinPoint joinPoint) {
        String msg = toString(joinPoint);
        log.info(msg);
    }

    @AfterThrowing(value = "@annotation(com.starsea.im.aggregation.aop.LogParams)",
            throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Throwable ex) {
        String msg = toString(joinPoint);
        log.error(msg, ex);
    }

    private String toString(JoinPoint joinPoint) {
        String className = joinPoint.getSignature().getDeclaringType().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        StringBuilder buf = new StringBuilder();
        buf.append(className)
                .append(".")
                .append(methodName)
                .append("(");
        try {
            buf.append(JSON.toJSONString(joinPoint.getArgs()));
        } catch (Exception e) {
            log.error("Log error: to json fail!", e);
        }
        buf.append(")");
        return buf.toString();
    }

}


