package com.in28minutes.practicequestions;

import java.util.Scanner;

public class SwapWithoutUsing3rdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first num");
		int a = sc.nextInt();

		System.out.println("Enter Second num");
		int b = sc.nextInt();
		System.out.println("a is " + a + "b is " + b);
		a = a + b; // 30
		b = a - b; // 30-20
		a = a - b;
		System.out.println("a is " + a + " b is " + b);

	}

}
