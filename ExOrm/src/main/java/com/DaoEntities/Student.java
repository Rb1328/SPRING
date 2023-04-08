package com.DaoEntities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
	
   @Id
  @Column(name="student_Id")
	private int studentId;
   
   @Column(name="student_name")
	private String studentName;
   
   @Column(name="student_city")
   private String stdentCity;
   
	public Student() {
	super();
	// TODO Auto-generated constructor stub
}
	public Student(int studentId, String studentName, String stdentCity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.stdentCity = stdentCity;
}
	public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStdentCity() {
	return stdentCity;
}

public void setStdentCity(String stdentCity) {
	this.stdentCity = stdentCity;
}

	

}
