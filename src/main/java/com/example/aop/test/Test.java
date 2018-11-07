package com.example.aop.test;

import com.example.aop.config.Appconfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        annotationConfigApplicationContext.start();
        Log log = LogFactory.getLog("XX");
        //        Dao dao  = annotationConfigApplicationContext.getBean(Dao.class);
//        dao.query();
        //dao.query1("args");
//
//        dao.query();

//        byte[] bytes = ProxyGenerator.generateProxyClass("$ProxyTl",new Class[]{Dao.class});
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("c:/env/$ProxyTl.class");
//            fileOutputStream.write(bytes);
//            fileOutputStream.flush();
//            fileOutputStream.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        Dao dao = (Dao) Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{Dao.class},new TestInvocationHandler(new IndexDao()));
//        dao.query();
    }
}
