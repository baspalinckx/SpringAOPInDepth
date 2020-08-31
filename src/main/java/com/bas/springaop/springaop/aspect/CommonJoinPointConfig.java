package com.bas.springaop.springaop.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.bas.springaop.springaop.business.*.*(..))")
    public void dataLayerExecution(){

    }
}
