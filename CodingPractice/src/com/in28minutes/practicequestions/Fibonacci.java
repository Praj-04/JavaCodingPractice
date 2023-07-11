package com.in28minutes.practicequestions;

import java.util.Scanner;

public class Fibonacci {
//	10 => 0,1,1,2,3,5,8,13,21,34

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();
		int a=0;
		int b=1;
		int c=1;
		
		for(int i=1; i<=input;i++) {
			System.out.println(a + " ");
			a=b;
			b=c;
			c=a+b;
		}
		
		
		
		
	}

}
