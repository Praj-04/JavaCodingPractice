
//The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:
//F(n) = F(1)*F(2)...F(n-1)*F(n) eg: 5 => 1*2*3*4*5 = 160

package com.in28minutes.practicequestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		System.out.println(result);
	}

}
