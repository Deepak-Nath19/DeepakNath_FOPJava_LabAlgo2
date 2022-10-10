package com.greatlearning.test;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.sorting.MergeSort;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
			
		int size = sc.nextInt();
		
		if(size>0) {
		int[] denominationsValue = new int[size];
		
		System.out.println("Enter the Currency denominations value");
		
		for(int i=0; i<size; i++) {
			denominationsValue[i] = sc.nextInt();
		}
		
		MergeSort obj = new MergeSort();
		obj.mergeSort(denominationsValue, 0,denominationsValue.length-1);
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		int total = amount;
		
		int []count = new int[size];
		
		Arrays.fill(count, 0);
		boolean flag = false;
		
		try {
		
		for(int i=0; i<size; i++) {
			if(total/denominationsValue[i]>0) {
				count[i]=total/denominationsValue[i];
				total = total - denominationsValue[i]*count[i];
			}
			
		
			if(total==0) {
				flag= true;
				break;
			}
		} 
		
		if(flag==false) {
			System.out.println("Not possible to pay in these denominations value");
		}
		else {
			System.out.println("your payment approach in order to give "
					+ "min no of notes will be ");
			for(int i=0; i<size; i++) {
				if(count[i]!=0) {
					System.out.println(" "+denominationsValue[i]+" : "+count[i]);
				}
	 		}
			
		}
		
		}catch(ArithmeticException e) {
			System.out.println(e+" notes of denomination 0 is invalid");
		}
		}else {
			System.out.println("Currency denominations are not available");
		}
		
		sc.close();
		
	}
}
