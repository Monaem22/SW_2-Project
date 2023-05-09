package com.pharmcy.meds.aspect;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.util.StringUtils;    //don't has join method

import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Aspect
public class GeneralAspect {

	Logger log = LoggerFactory.getLogger(GeneralAspect.class);

	@Pointcut(value = "execution(* com.pharmcy.demo.controller.*.*(..))")
	public void forRepositoryLog() {
	}

	@Pointcut(value = "execution(* com.pharmcy.demo.service.*.*(..))")
	public void forServiceLog() {
	}

	@Pointcut(value = "execution(* com.pharmcy.demo.repository.*.*(..))")
	public void forControllerLog() {
	}

	@Pointcut(value = "forRepositoryLog() || forServiceLog() || forControllerLog()")
	public void forAllApp() {
	}

//    @Pointcut("execution(* com.pharmcy.demo.controller.*.*(..))")
//     public void loggingPointCut(){}
//	
	@Before("forAllApp()")
	public void before(JoinPoint joinPoint) {
		log.info("Before method invoked::" + joinPoint.getSignature().getName());
	}

	@AfterThrowing(value = "forAllApp()", throwing = "e")
	public void after(JoinPoint joinPoint, Exception e) {
		log.info("After method invoked::" + e.getMessage());
	}

	@Around(value = "execution(* com.pharmcy.demo.controller.*.*(..))")
	public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable {

		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("KPI:");
		sb.append("[").append(joinPoint.getKind()).append("]\tfor: ").append(joinPoint.getSignature())
				.append("AtwithArgs: ").append("(").append(StringUtils.join(joinPoint.getArgs(), ",")).append(")");
		sb.append("Ittook: ");
		Object returnValue = joinPoint.proceed();

		log.info(sb.append(System.currentTimeMillis() - startTime).append(" ms. ").toString());

		return returnValue;

	}

}
