package com.spring.cg;

public class Airtel implements Sim{
 
	 public Airtel()
	 {
		 System.out.println("its calling airtel");
	 }

	@Override
	public void calling() {
		System.out.println("calling from Airtel");
	}

	@Override
	public void data() {
		System.out.println("browsing data  from Airtel sim");
	}
	
	}

