package com.in.pack;

public class Calculator {
	CalculatorService service;
	public Calculator() {
		this.service=service;
	}
	public int add(int i,int j)
	{
		return service.add(i,j)*i;
	}

}
