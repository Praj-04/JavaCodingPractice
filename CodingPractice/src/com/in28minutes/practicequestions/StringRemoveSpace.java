package com.in28minutes.practicequestions;

public class StringRemoveSpace {

	public static void main(String[] args) {
		String s = "My name is ";
//StringBuilder sb = new StringBuilder();

//	char[] ch = s.toCharArray();
//	for(char c : ch) {
//		if(!Character.isWhitespace(c)) {
//			sb.append(c);
//		}
//		
//	}

//		System.out.println(sb);

		System.out.println(s.replace(" ", ""));

	}

}

//String related code
//Remove a character from a string in Java
//		System.out.println("String after removing all the 'a's = "+str.replace("a", ""));
//
//		// Remove spaces from a string in Java
//		System.out.println("String after removing all the spaces = "+str.replace(" ", ""));
//
//		// Remove a substring from a string in Java	
//		System.out.println("String after removing the first 'ab' substring = "+str.replaceFirst("ab", ""));
//
//		// Remove all the lowercase letters from a string in Java
//		System.out.println("String after removing all the lowercase letters = "+str.replaceAll("([a-z])", ""));
//
//		// Remove the last character from a string in Java
//		System.out.println("String after removing the last character = "+str.substring(0, str.length()-1));
//	}
