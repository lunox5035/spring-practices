package com.bitacademy.aoptesr.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("excution(public vo.ProductVo service.ProductService.find(String))")
	public void befoeradvice() {
		System.out.println("---Before Advice");
	}
	
	@After("excution(* *..*.ProductService.find(..))")
	public void afteradvice() {
		System.out.println("---Aftre Advice");
	}
	
	@AfterReturning("excution(* *..*.ProductService.*(..))")
	public void afterReturningAdvice() {
		System.out.println("---Aftre Returning Advice");
	}
	
	@AfterThrowing(value = "excution(* *..*.*.*.*(..))", throwing = "ex")
	public void afterThrowingAdvice(Throwable ex) {
		System.out.println("---Aftre Throwing Advice"+ex+"-----");
	}
	
	@Around("execution(* *..*.ProductService.*(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		/* before */
		System.out.println("--- Around(Before) Advice ---");

		/* PointCut Method 실행 */
		Object result = pjp.proceed();
		
		// 파라미터 가로채기
		// Object[] params = {"Camera"};
		// Object result = pjp.proceed(params);
		
		/* after */
		System.out.println("--- Around(After) Advice ---");
		
		return result;
	}
}
		