package com.yufengyuanx.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


/**
 * 设计切面方法
 */

@Aspect
@Component
public class LogAspect {

  @Pointcut("@annotation(com.yufengyuanx.highlight_spring4.ch1.aop.Action)") // 选在在哪个包里找Beam
  public void annotationPointCut(){}

  @After("annotationPointCut()") // 通过@After注解声明一个建言，并使用@PointCut定义的切点。
  public void after(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature)joinPoint.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("注解式拦截: " + action.name()); // 通过反射可以获得注解上的属性
    System.out.println("running DemoAnnotationService function, write log to database");
  }

  @Before("execution(* com.yufengyuanx.highlight_spring4.ch1.aop.DemoMethodService.*(..))") // 此建言直接使用拦截规则作为参数。
  public void before(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature)joinPoint.getSignature();
    Method method = signature.getMethod();
    System.out.println("方法式拦截, " + method.getName());  // 这里可以获得方法的属性
  }
}
