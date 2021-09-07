package com.codegym.rent_book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    int count = 0;
    @Pointcut("within(com.codegym.rent_book.controller.RentBookController*)")
    public void allMethodAspect() {
    }

    @After("allMethodAspect()")
    public void afterMethod(JoinPoint joinPoint) {

        count++;
        System.err.println("Name action " + joinPoint.getSignature().getName());
        System.err.println("Amount of people visit " + count);
    }


}
