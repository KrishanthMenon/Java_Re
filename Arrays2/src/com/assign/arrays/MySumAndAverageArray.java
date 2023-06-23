package com.assign.arrays;

public class MySumAndAverageArray 
{
	public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        int sum = 0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        int average=sum/(arr.length);
        System.out.println("Sum of all the elements of an array: " + sum);
        System.out.println("Average of all the elements of an array: " + average);
    }  
}
