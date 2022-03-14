package com.in.pack;

public class CodeCoverage {
	public static void main(String args[])
	{
		System.out.println("hello this one");
		Start();
	}
    public static  String Start() {
    	System.out.println("In start");
    	return "start";
    	
    	
    } 
    public static String Stop() {
    	System.out.println("At stop");
    	return "stop";
    }
}
