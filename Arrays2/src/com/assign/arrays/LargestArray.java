package com.assign.arrays;

import java.util.Scanner;

public class LargestArray 
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
		int large = a[0];
		int small = a[0];
		
		for(int i=0;i<value;i++)
		{
			if(a[i]>a[0])
			{
				large = a[i];
			}
			if(a[i]<a[0])
			{
				small=a[i];
			}
		}
		
		System.out.println("Largest: "+large+"      \nSmallest: "+small);
	}
}
