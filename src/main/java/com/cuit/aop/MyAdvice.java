package com.cuit.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
	@Pointcut("execution(* com.cuit.service.Impl..*ServiceImpl.*(..))")
	public void pc(){}

	@Before("MyAdvice.pc()")
	public void save(){
		System.out.println(System.currentTimeMillis());
	}
	@After("MyAdvice.pc()")
	public void after(){
		System.out.println(System.currentTimeMillis());
	}
}
