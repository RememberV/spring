package com.ths.Proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.security.auth.spi.LoginModule;

/**
 * @Author JiangYu
 * @Description service层增强
 * @Date 2022-08-23 08:55
 * @Version 1.0
 */
@Component
@Aspect
@Order(1)
public class ServiceProxy {
    private static final Logger log = LoggerFactory.getLogger(ServiceProxy.class);
    @Pointcut(value = "execution(* com.ths.service.impl.*.*(..))")
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint) {
        log.info("执行："+joinPoint.getSignature().getName() + "  方法");
    }
//
//    @AfterReturning(value = "pointCut()")
//    public void afterReturning() {
//        System.out.println("后置通知");
//    }
//
//    @After(value = "pointCut()")
//    public void after() {
//        System.out.println("最终通知");
//    }

//    @Around(value = "pointCut()")
//    public User around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("环绕通知：方法执行之前执行");
//        User user = (User) proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
//        System.out.println("环绕通知：方法执行之后执行");
//        return user;
//    }

//    @AfterThrowing(value = "pointCut()")
//    public void afterThrowing() {
//        System.out.println("异常通知");
//    }

}
