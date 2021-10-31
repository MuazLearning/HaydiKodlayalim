package com.haydikodlayalim.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.haydikodlayalim.aop.service.MessageService.mesajVer(..))")
    //@Before("execution(* com.haydikodlayalim.aop.*.*.mesajVer(..))")
//    @Before("execution(* com.haydikodlayalim.aop.*.*.*(..))")
    public void mesajVerMetodundanOnce(JoinPoint joinPoint) {
        System.out.println("=============");
        System.out.println("mesaj Ver Metodundan Önce param yakalandı param : "
                + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("*****************");
    }

    @After("execution(* com.haydikodlayalim.aop.service.MessageService.mesajVer(..))")
    public void mesajVerMetodundanSonra(JoinPoint joinPoint) {
        System.out.println("=============");
        System.out.println("mesaj Ver Metodundan Sonra param yakalandı param : "
                + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
        System.out.println("*****************");
    }
}
