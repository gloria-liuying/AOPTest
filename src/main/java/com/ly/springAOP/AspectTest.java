package com.ly.springAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AspectTest {

    @Pointcut("execution(* *.test(..))")
    public void test(){
    };

    @Before("test()")
    public void beforeTest(){
        System.out.println("beforeTest");
    };

    @After("test()")
    public void afterTest(){
        System.out.println("afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p){
        System.out.println("before1");
        Object obj = null;
        try{
            obj = p.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }return obj;
    }
}
