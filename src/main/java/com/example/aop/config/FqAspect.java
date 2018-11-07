package com.example.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FqAspect {

    @Pointcut("execution(* com.example.aop.dao.Dao.*(..))")
    public void pointCutExecution(){

    }

    @Pointcut("args(java.lang.String)")
    public void pointCutArgs(){

    }

    @Pointcut("within(com.example.aop.dao.IndexDao)")
    public void pointCutWithin(){

    }

    @Pointcut("@within(com.example.aop.anno.Fuqiang)")
    public void pointCutWithinAnno(){

    }


    @Pointcut("target(com.example.aop.dao.IndexDao)")
    public void pointCutTarget(){

    }

    @Pointcut("this(com.example.aop.dao.IndexDao)")
    public void pointCutThis(){

    }

    @Pointcut("@annotation(com.example.aop.dao.FuqiangTest)")
    public void pointCutAnno(){

    }

    @Around("pointCutExecution()&&pointCutAnno()")
    public Object pointCutAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("start around");
        String tempArgs="";
        Object[] args =pjp.getArgs();
        for (Object arg:args){

            if(arg.getClass().getSimpleName().equals("String")){
                tempArgs=arg+"around";

            }
        }
        Object retVal = pjp.proceed(new Object[]{tempArgs});
        System.out.println("start end");
        return retVal;
    }







//    @After("within(@com.example.aop.anno.Fuqiang *)")
//    public void after(){
//        System.out.println("after-e");
//    }



//    @Before("com.example.aop.config.TlAspect.pointCutWithin()")
//    public  void before(){
//        System.out.println("before-w");
//    }

    @Before("pointCutExecution()&&!pointCutAnno()")
    public  void before(JoinPoint joinPoint){
        //joinPoint.getThis();
       // System.out.println(str);
        for(int i=0;i<joinPoint.getArgs().length;i++){
            System.out.println(joinPoint.getArgs()[i]);
        }
       System.out.println("proxy-before");
    }




//    @AfterThrowing("com.example.aop.config.TlAspect.pointCut()")
//    public void doRecoveryActions() {
//        //todo
//        System.out.println("AfterThrowing");
//    }








}
