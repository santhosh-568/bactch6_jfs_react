package com.Dependences.in;

public class Student {
	
	private String StudentName;
	private int id;
	
	public Student(String studentName, int id) {
		StudentName = studentName;
		this.id = id;
	}

	/*public void setId(int id) {
		this.id=id;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	

}*/
	public void displayStudentinfo()
	{
		System.out.println("Student name is:"+ StudentName +  " and id is" +id);
	}
}
