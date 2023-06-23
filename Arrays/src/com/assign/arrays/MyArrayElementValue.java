package com.assign.arrays;

import java.util.Scanner;

public class MyArrayElementValue 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int value=s.nextInt();
		int a[]=new int[value];
		
		System.out.println("Enter "+value+" elements: ");
		
		for(int i=0;i<value;i++)
		{
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the number to identify the value: ");
		int num=s.nextInt();
		for(int i=0;i<value;i++) {
			if (num == a[i])
			{
				System.out.println("Yes "+ num +" is here");
			}
			else
			{
				System.out.println("No");
			}
		}
		
		}
}
