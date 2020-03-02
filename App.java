package com.spring.test.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {	
        System.out.println( "Hello World!" );
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        A a = context.getBean(A.class);
        a.doSomething();
        
        
    }
}
