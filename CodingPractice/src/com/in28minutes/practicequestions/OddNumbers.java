package com.in28minutes.practicequestions;

import java.util.List;

public class OddNumbers {

	public static boolean findIfOdd(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
//		boolean flag = true;
//		List<Integer> numbers = List.of(1,3,5,8);
//		for (int i = 0; i < numbers.size(); i++) {
//			if (numbers.get(i) % 2 == 0) {
//				flag = false;
//				break;
//
//			}
//		}
//
//		if (!flag) {
//			System.out.println("List contains even integers");
//		} else {
//			System.out.println("List contains odd");
//		}

		List<Integer> numbers = List.of(1, 3, 5);
		boolean flag = findIfOdd(numbers);
		if(flag) {
			System.out.println("List contains only odd integers");
		}else {
			System.out.println("List contains even integers also");
		}

	}

}
