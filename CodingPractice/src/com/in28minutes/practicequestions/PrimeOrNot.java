package com.in28minutes.practicequestions;

public class PrimeOrNot {

	public static void main(String[] args) {
		int number = 21;
		int length = number / 2;
		boolean flag = true;
		for (int i = 2; i <= length; i++) {
			if (number % i != 0) {
				continue;
			} else {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime number");
		}
	}
}
