package com.Dependenobject.in;

public class StudentSan {
	private int id;
	private Mathcode mathcode;
	public void setid(int id) {
		this.id=id;
	}
	public void setMathcode(Mathcode mathcode)
	{
		this.mathcode=mathcode;
	}
	public void cheating() {
		mathcode.mathcode();
		System.out.println("My id is "+id);
	}
	

}
