package dk.sdu.cbs.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Advice that executes before the add method
    @Before("execution(*  dk.sdu.cbs.demo.service.ArithmeticCalculator.add(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before method: " + joinPoint.getSignature().getName());
    }

    // Advice that executes after the add method
    @After("execution(* dk.sdu.cbs.demo.service.ArithmeticCalculator.add(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("After method: " + joinPoint.getSignature().getName());
    }

//
//    // Around advice for the divide method to measure execution time and log before and after the method call
//    @Around("execution(* dk.sdu.cbs.demo.service.ArithmeticCalculator.divide(..))")
//    public Object aroundDivide(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Around advice (before) for divide: " + joinPoint.getSignature().getName());
//        long startTime = System.currentTimeMillis();
//        try {
//            Object result = joinPoint.proceed();
//            long endTime = System.currentTimeMillis();
//            System.out.println("Divide executed in " + (endTime - startTime) + " ms");
//            return result;
//        } catch(Exception ex) {
//            long endTime = System.currentTimeMillis();
//            System.out.println("Divide threw an exception after " + (endTime - startTime) + " ms");
//            throw ex;
//        }
//    }
//
//    // After returning advice for the divide method
//    @AfterReturning(pointcut = "execution(* dk.sdu.cbs.demo.service.ArithmeticCalculator.divide(..))", returning = "result")
//    public void afterReturningDivide(JoinPoint joinPoint, Object result) {
//        System.out.println("After Returning from divide: result = " + result);
//    }
//
//    // After throwing advice for the divide method
//    @AfterThrowing(pointcut = "execution(* dk.sdu.cbs.demo.service.ArithmeticCalculator.divide(..))", throwing = "ex")
//    public void afterThrowingDivide(JoinPoint joinPoint, Throwable ex) {
//        System.out.println("After Throwing from divide: exception = " + ex.getMessage());
//    }
//

}