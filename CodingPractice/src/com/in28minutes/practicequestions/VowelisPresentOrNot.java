package com.in28minutes.practicequestions;

import java.util.Scanner;

public class VowelisPresentOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");
		String s = sc.next();

		if (s.toLowerCase().matches(".*[aeiou]*.")) {
			System.out.println("The string has an vowel");
		} else {
			System.out.println("The string doesnot has an vowel");
		}
	}

}
