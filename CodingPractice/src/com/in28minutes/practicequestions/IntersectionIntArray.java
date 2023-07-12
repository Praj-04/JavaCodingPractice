package com.in28minutes.practicequestions;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionIntArray {

	public static ArrayList<Integer> intersectArray(int[] arr1,int[] arr2) {
//		int[] ans= {};
		ArrayList<Integer> ans= new ArrayList<Integer>();
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
//				System.out.println(arr2[j]);
				ans.add(arr2[j]);
			}
		}
	}
	return ans;
	
	}
 	
	
	public static void main(String[] args) {
int[] arr1 = {10,4,19,2,9};
int[] arr2 = {2,8,10,7};
//System.out.println(Arrays.toString(result));
ArrayList<Integer> intersectArray = intersectArray(arr1,arr2);
System.out.println(intersectArray.toString());
		
	}

}
