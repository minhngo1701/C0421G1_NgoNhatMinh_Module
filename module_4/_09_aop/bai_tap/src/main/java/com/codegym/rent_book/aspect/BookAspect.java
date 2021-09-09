package com.codegym.rent_book.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
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

    @Pointcut("execution(* com.codegym.rent_book.controller.RentBookController.createRentBook(..))")
    public void rentBookAction() {
    }

    @AfterReturning("rentBookAction()")
    public void rentBook(JoinPoint joinPoint) {
        System.err.println("Rent book " + joinPoint.getSignature().getName());
    }

    @Pointcut("execution(* com.codegym.rent_book.controller.RentBookController.giveBackBook(..))")
    public void giveBack(JoinPoint joinPoint) {
        System.err.println("Give back book: " + joinPoint.getSignature().getName());
    }
}
