package com.in28minutes.practicequestions;

public class Palindrome {

	public static void main(String[] args) {

		String s = "madam";
		boolean flag = false;
		char[] ch = s.toLowerCase().toCharArray();
		System.out.println(ch);
		int length = ch.length / 2;
		int lengths=ch.length;
		for (int i = 0; i <= length; i++) {
			if (ch[i] == ch[lengths-1-i]) {
				flag = true;
			} else {
				flag = false;
			}
		}
		
		if (flag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}
