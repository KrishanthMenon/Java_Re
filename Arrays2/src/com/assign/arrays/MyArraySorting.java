package com.assign.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MyArraySorting 
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
		Arrays.sort(a);
		System.out.println("Sorted ones: "+Arrays.toString(a));
	}
}
