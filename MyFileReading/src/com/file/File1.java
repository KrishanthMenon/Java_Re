package com.file;

import java.io.*;

public class File1 
{
	public static void main(String args[])
	{
		File file=new File("test.txt");
		System.out.println("File Name "+file.getName());
		System.out.println("Path "+file.getPath());
		System.out.println("AbsolutePath "+file.getAbsolutePath());
		System.out.println("Parent "+file.getParent());
		System.out.println("Execute "+file.canExecute());
		System.out.println("Read "+file.canRead());
		System.out.println("Write "+file.canWrite());
	}

}
