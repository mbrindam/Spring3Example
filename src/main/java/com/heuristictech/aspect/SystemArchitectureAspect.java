package com.heuristictech.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitectureAspect {

	@Pointcut("within(com.heuristictech.core..*)")
	public void inHeuristicCore(){}
}
