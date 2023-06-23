package com.assign;

import java.util.Arrays;

//Employee Management System

//Add the List of Employee
//Find the Employee By name
//Sort the Employee List
//Add New Employee to List
//Find the min and max salary of employee
import java.util.Scanner;

class Student {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getattendance() {
		return attendance;
	}

	public void setSalary(int attendance) {
		this.attendance = attendance;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", iD=" + iD + ", salary=" + salary + "]";
	}

	
	public Student(String name, int rollno, int attendance) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.attendance = attendance;
	}
	private String name;
	private int iD;
	private int salary;

}

public class MySMS {

	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		Student[] emp= {};

		while (true) {

			System.out.println("Enter 1 to create the List of employee");
			System.out.println("Enter 2 to Display a List of employee");
			System.out.println("Enter 3 to search employee");
			System.out.println("Enter 4 to delete a employee");
			System.out.println("Enter 5 to Sort the Employee BY NAME");
			System.out.println("Enter 6 to Sort the Employee BY SALARY");
			System.out.println("Enter 7 to view the Minimun paid salary employee");
			System.out.println("Enter 8 to view the maximum salary of employee");
			System.out.println("Enter 9 to view the Avg of employee Salary");
			System.out.println("Enter 10 to view the Sum of employee Salary");
			
			System.out.println("enter 5 to exit");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("How many employees would you like to enter?");
				int size = sc.nextInt();
				emp=new EmployeeM[size];
				for (int i = 0; i < size; i++) {
					
					System.out.println("Enter the name of Employee: "+i);
					String name=sc.next();
					System.out.println("Enter the Id of Employee: "+i);
					int id=sc.nextInt();
					System.out.println("Enter the Salary of Employee: "+i);
					int salary=sc.nextInt();
                 emp[i]=new EmployeeM(name,id,salary); 
				}

			}
			if(choice==2)
			{
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getiD()!=0)
					{
					System.out.println(emp[i]);
					}
				}
			}
			if(choice==3)
			{
				System.out.println("Enter the name that you would like to search: ");
				String name=sc.next();
				boolean flag=true;
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getName().equalsIgnoreCase(name))
					{
						System.out.println("Employee Found "+emp[i].toString());
						flag=false;
						break;
						
					}
				}
				if(flag)
				{
					System.out.println("Record not Found");
				}
				
			}
			if(choice==4)
			{
				boolean deleteFlag=true;
				for(int i=0;i<emp.length;i++)
				{
					System.out.println(emp[i]);
				}
				System.out.println("Enter the id for which you want to delete the employee");
				int id=sc.nextInt();
				for(int i=0;i<emp.length;i++)
				{
					if(emp[i].getiD()==id)
					{
						System.out.println("Deleting record "+emp[i].toString());
						emp[i]=new EmployeeM();
						deleteFlag=false;
						break;
						
					}
				}
				if(deleteFlag)
				{
					System.out.println("No Matching Id found");
				}
				
			}
			if (choice == 5) {
				for(int i=0;i<emp.length;i++)
				{
					Arrays.sort(emp);
					System.out.println("Sorted ones: "+Arrays.toString(emp));
				}
			}

		}
	}
}