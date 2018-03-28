package com.tablenine.nine.ex1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
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
