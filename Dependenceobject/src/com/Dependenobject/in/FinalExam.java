package com.Dependenobject.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FinalExam {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("the context is running fine");
        StudentSan s1=context.getBean("San",StudentSan.class);
        s1.cheating();
        StudentVam v1=context.getBean("vam",StudentVam.class);
        v1.cheat();
        
	}

}
