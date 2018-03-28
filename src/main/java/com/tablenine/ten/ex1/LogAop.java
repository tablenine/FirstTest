package com.tablenine.ten.ex1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	@Pointcut("within(com.tablenine.ten.ex1.*)")
	private void pointCutMehthod(){}

	@Around("pointCutMehthod()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
		String signaturStr = joinPoint.getSignature().toShortString();
		System.out.println(signaturStr + " is Start");
		long st = System.currentTimeMillis();

		try{
			Object o = joinPoint.proceed();
			return o;
		} finally {
			long et = System.currentTimeMillis();
			System.out.println(signaturStr + " is Finished");
			System.out.println(signaturStr + " 경과시간 " + (et - st) + "ms");
		}
	}
}
