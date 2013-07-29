package com.mbrindam.samples.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitectureAspect {

	@Pointcut("within(com.mbrindam.samples..*)")
	public void inSamples(){}
}
