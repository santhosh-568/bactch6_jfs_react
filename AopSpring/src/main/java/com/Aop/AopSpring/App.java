package com.Aop.AopSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/Aop/AopSpring/config.xml");
    	PaymentService pay=context.getBean("payment",PaymentService.class);
    	pay.makePayment();
    }
}
