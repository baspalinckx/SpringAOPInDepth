package com.bas.springaop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    //execution(* PACKAGE.*.*(..))
    @Before("execution(* com.bas.springaop.springaop.aspect.CommonJoinPointConfig.dataLayerExecution())")
    public void before(JoinPoint joinPoint) {
        logger.info("Intercepted Method Calls {}", joinPoint);
    }
}
