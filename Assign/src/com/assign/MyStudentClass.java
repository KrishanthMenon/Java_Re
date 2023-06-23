package com.assign;

import java.util.*;


class Student
{
	public Student(int rollno,int attendancepercentage, int averagemarks, String overallperformance,String name) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.attendancepercentage = attendancepercentage;
		this.averagemarks=averagemarks;
		this.overallperformance=overallperformance;
		// TODO Auto-generated constructor stub
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", attendancepercentage=" + attendancepercentage
				+ ", averagemarks=" + averagemarks + ", overallperformance=" + overallperformance + ", getRollno()="
				+ getRollno() + ", getName()=" + getName() + ", getAttendancepercentage()=" + getAttendancepercentage()
				+ ", getAveragemarks()=" + getAveragemarks() + ", getOverallperformance()=" + getOverallperformance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttendancepercentage() {
		return attendancepercentage;
	}
	public void setAttendancepercentage(int attendancepercentage) {
		this.attendancepercentage = attendancepercentage;
	}
	public int getAveragemarks() {
		return averagemarks;
	}
	public void setAveragemarks(int averagemarks) {
		this.averagemarks = averagemarks;
	}
	public String getOverallperformance() {
		return overallperformance;
	}
	public void setOverallperformance(String overallperformance) {
		this.overallperformance = overallperformance;
	}
	private int rollno;
	private String name;
	private int attendancepercentage;
	private int averagemarks;
	private String overallperformance;
}

public class MyStudentClass 
{
	public static void main(String args[])
	{

	Scanner sc = new Scanner(System.in);
	Student[] student= {};

	while (true) {

		System.out.println("Enter 1 to insert Student: ");
		System.out.println("Enter 2 to Delete Student: ");
		System.out.println("Enter 3 to Update Student: ");
		System.out.println("Enter 4 to Sort Student (ASC): ");
		System.out.println("Enter 5 to Sort Student (DSC): ");
		System.out.println("Enter 6 to Identify Size: ");
		System.out.println("Enter 7 to exit: ");
		
		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("How many students would you like to enter?");
			int size = sc.nextInt();
			student=new Student[size];
			for (int i = 0; i < size; i++) {
				
				System.out.println("Enter the name of Student: "+i);
				String name=sc.next();
				System.out.println("Enter the rollno of Student: "+i);
				int rollno=sc.nextInt();
				System.out.println("Enter the attendance percentage of Student: "+i);
				int attendancepercentage=sc.nextInt();
				System.out.println("Enter the average marks of Student: "+i);
				int averagemarks=sc.nextInt();
				System.out.println("Enter the overall performance of Student: "+i);
				String overallperformance=sc.next();
             student[i]=new Student(); 
			}
						
			if(choice==2)
			{
								
				boolean deletestared=true;
				for(int i=0;i<student.length;i++)
				{
					System.out.println(student[i]);
				}
				System.out.println("Enter the id for which you want to delete the student");
				int rollno=sc.nextInt();
				for(int i=0;i<student.length;i++)
				{
					if(student[i].getRollno()==rollno)
					{
						System.out.println("Deleting record "+student[i].toString());
						student[i]=new Student();
						deletestared=false;
						break;
						
					}
				}
				if(deletestared)
				{
					System.out.println("No Matching RollNo found");
				}
				
			}			
			
			if(choice==3)
			{
				for(int i=0;i<student.length;i++)
				{
					if(student[i].getRollno()!=0)
					{
					System.out.println(student[i]);
					}
				}
			}
	
	//Set<Student> studset=new HashSet<Student>();
		}
		}
}
}
