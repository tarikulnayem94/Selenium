package com.basic;
import java.util.Scanner;
public class DemoClass {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b=sc.nextInt();	
		
		DemoClass obj=new DemoClass();
		obj.sum(a, b);
		obj.sub(a,b);
	}	
	public static void sum(int a, int b)
	{		
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void sub(int a, int b)
	{
		int sub=a-b;
		System.out.println(sub);
	}
}
