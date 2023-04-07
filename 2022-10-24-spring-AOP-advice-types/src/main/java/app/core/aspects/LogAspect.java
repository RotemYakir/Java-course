package app.core.aspects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
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
public class LogAspect {

	@Pointcut("execution(String sellSoup())")
	public void sellSoup() {

	}

	@Before("sellSoup()")
	public void logBefore(JoinPoint jp) {
		System.out
				.println(">>> @before " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ " - " + jp.getSignature().getName());
	}

	@AfterReturning(pointcut = "sellSoup()", returning = "msg")
	public void logAfterReturn(JoinPoint jp, String msg) {
		System.out.println(
				">>> @afterReturning " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ " - " + jp.getSignature().getName() + " returned: " + msg);
	}

	@AfterThrowing(pointcut = "sellSoup()", throwing = "e")
	public void logAfterThrow(JoinPoint jp, Throwable e) {
		String m = jp.getSignature().getName();
		System.out.println(">>>!!! ERROR in method " + m + e.getMessage());
	}

	@After("sellSoup()")
	public void logAfter(JoinPoint jp) {
		System.out
				.println(">>> @after " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
						+ " - " + jp.getSignature().getName());
	}

	// 0-5
	@Around("sellSoup()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("======== @Around Before");
		try {
			Object obj = pjp.proceed();
			System.out.println("======== @Around After");
			return obj;
		} catch (Throwable e) {
			return "xyz";
		}
	}

}
