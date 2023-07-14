//Code is correct but because of the way the array integer is enetered i am getting incorrect result,
//its working fine in hacker rank website.


//Week1 - question 1(3 month preparation kit)
package com.HackerRank.twomonthprep.practicequestions.week1;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class RatioOfPosNegZeroElementsInArray1 {

	
	
	public static void main(String[] args) {
		List<Integer>  arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the positive negartive zero digits");
		arr.add(Integer.valueOf(sc.next())); //its not taking negative values,check hackerrank for correct code
		
		plusMinus(arr);
	}

	private static void plusMinus(List<Integer> arr) {
		List<Integer> numbers = arr;
		List<Integer> negativeNum = new ArrayList<>();
		List<Integer> positiveNum = new ArrayList<>();
		List<Integer> zeroNum = new ArrayList<>();
		int length = numbers.size();


		for(int number:numbers){
		    
		    if(number<0){
		        negativeNum.add(number);
		        }
		        else if(number==0){
		            zeroNum.add(number);
		        }
		        else {
		            positiveNum.add(number);
		        }
		}

		System.out.println(positiveNum);
		System.out.println(negativeNum);
		System.out.println();
		double positive=(double)positiveNum.size()/length;
		double negative=(double) negativeNum.size()/length;
		double zero= (double)zeroNum.size()/length;

		System.out.println(String.format("%.6f",positive ));
		System.out.println(String.format("%.6f",negative ));
		System.out.println(String.format("%.6f",zero ));


		    }


		
	}


