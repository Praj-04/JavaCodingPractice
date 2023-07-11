package com.in28minutes.practicequestions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		int length = ch.length - 1;
		for (int i = length; i >= 0; i--) {

			sb.append(ch[i]);
		}
		System.out.println(sb);

	}

}
