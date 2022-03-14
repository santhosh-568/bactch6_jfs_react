package com.withoutbeanXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FinalExam {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("the context is running fine");
		College college=context.getBean("collgeBean",College.class);
		System.out.println("the college created by using spring:"+ college);
		
		college.Test();
              
	}

}
