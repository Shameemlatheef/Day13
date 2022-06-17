package com.day13;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("start of main..");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1");
	int num1 = sc.nextInt();
	System.out.println("Enter num2");
	int num2 = sc.nextInt();
	try {
		
		String message = null;
		int num3 = num1 / num2;
		
		
		if(num3 > 10){
			message = "Welcome to Exception Handling ";
			}
			System.out.println("Message is :"+message.toUpperCase());
	}
	catch(ArithmeticException ae){
		System.out.println("number 2 is null");
		
	}
	catch(NullPointerException n) {
		System.out.println("strimg value is null");
	}
	catch(NumberFormatException m) {
		System.out.println("please enter val;id number ");
	}
		System.out.println("end of main");
}
}
