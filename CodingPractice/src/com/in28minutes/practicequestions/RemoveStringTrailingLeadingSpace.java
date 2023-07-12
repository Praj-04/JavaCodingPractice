package com.in28minutes.practicequestions;

public class RemoveStringTrailingLeadingSpace {

	public static void main(String[] args) {
//use strip()  or trim() to remove spaces . strip() is recommended method.
		String s = "   abc  def\t   "; //Removes only spaces at the start and end..not in between
	String newS = s.strip(); //or s.trim()
	System.out.println(newS);
		
	}

}
