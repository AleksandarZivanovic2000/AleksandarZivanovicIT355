package com.sun.mail;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Interceptor {

    @Before("execution(public double *.izracunajObim(..))")
    public void beforeObim() {
        System.out.println("Savet tipa Before, metoda vraca obim");
    }

    @Before("execution(public double *.izracunajPovrsinu(..))")
    public void beforePovrsina() {
        System.out.println("Savet tipa Before, metoda vraca povrsinu");
    }

    @After("execution(public double *.izracunajObim(..))")
    public void afterObim(JoinPoint joinPoint) {
        System.out.println("Poziv metode: " + joinPoint.getSignature().getName() + ", Savet tipa After");
    }

    @After("execution(public double *.izracunajPovrsinu(..))")
    public void afterPovrsina(JoinPoint joinPoint) {
        System.out.println("Poziv metode: " + joinPoint.getSignature().getName() + ", Savet tipa After");
    }

    @AfterReturning("execution(public double *.izracunajObim(..))")
    public void afterReturningObim(JoinPoint joinPoint) {
        System.out.println("Poziv metode: " + joinPoint.getSignature().getName() + ", Savet tipa AfterReturning");
    }

    @AfterReturning("execution(public double *.izracunajPovrsinu(..))")
    public void afterReturningPovrsina(JoinPoint joinPoint) {
        System.out.println("Poziv metode: " + joinPoint.getSignature().getName() + ", Savet tipa AfterReturning");
    }


    @AfterThrowing("within(org.example.*)")
    public void logException(JoinPoint joinPoint){
        System.out.println("Greska bacena u metodi: = "+joinPoint.toString());
        System.exit(0);
    }


    @Around("execution(* org.example..*set*(double))")
    public Object aroundSet(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Poziv metode: " + joinPoint.getSignature().getName() + ", Savet tipa Around (pre poziva metode)");
        Object result = joinPoint.proceed();
        System.out.println("Savet tipa Around (posle poziva metode)");
        return result;
    }

}

