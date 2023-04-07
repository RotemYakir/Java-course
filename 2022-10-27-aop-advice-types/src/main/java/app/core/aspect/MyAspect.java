package app.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
//annotated class:
// @Before("@target(app.core.annotations.MyAopAnnotation)")
public class MyAspect {
	
	//annotated method:
	@Before("@annotation(app.core.annotations.MyAopAnnotation)")
	public void m() {
		System.out.println(">>> annotated method");
	}

	// advices - intercept target method calls and add the advice algorithm
	// 1. before
	@Before(TRAFFIC)
	public void before() {
		System.out.println(">>> before");
	}
	// 2. after returning
	@AfterReturning(pointcut = TRAFFIC, returning = "msg")
	public void  afterReturning(String msg) {
		System.out.println(">>> after returning: " + msg);
	}
	// 3. after throwing
	@AfterThrowing(pointcut = TRAFFIC, throwing =  "err")
	public void afterThrowing(Exception err) {
		System.out.println(">>> after throwing: " + err);
	}
	// 4. after
	@After("traffic()")
	public void after() {
		System.out.println(">>> after");
	}
	// 5. around
	@Around(TRAFFIC)
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println(">>> around before");
		try {
			Object obj = pjp.proceed();
			return obj+ " - (@around)";
		} catch (Throwable e) {
//			.printStackTrace();
			return "just keep going (around proxy)" +e.getMessage();
			//throw e;
		}finally {
			System.out.println(">>> around after");	
		}
		
	}
	
	// pointcut can be declared as a String - maps an advice to target methods
	public static final String TRAFFIC = "execution(* *Traffic*(..))";
	// pointcut can be declared as a pointcut method - maps an advice to target methods
	@Pointcut("execution(* *Traffic*(..))")
	public void traffic() {};
	
	
	
}
