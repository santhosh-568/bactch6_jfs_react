package com.in.pack.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.in.pack.Calculator;
import com.in.pack.CalculatorService;

public class CalculatorTest1 {
	Calculator c=null;
	CalculatorService service =new CalculatorService() {
		public int add(int i,int j) {
			return 0;
		}
		
	;
	
	@Before
	public void setup()
	{
		c=new Calculator();
	}
    
	@Test
	public void testadd()
	{
		assertEquals(10,c.add(2, 3));
	}

	
	}
