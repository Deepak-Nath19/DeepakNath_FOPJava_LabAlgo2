package com.greatlearning.transaction;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		
			int size = sc.nextInt();
		
		if(size>0) {
			
			int[] money = new int[size];
		
			System.out.println("Enter the values of array");
		
			for(int i=0; i<size; i++) {
				money[i]= sc.nextInt();
			}
		
			System.out.println("enter the total no of targets that needs to be achieved");
		
			int targets = sc.nextInt();
        
			while(targets!=0) {
        
				System.out.println("Enter the value of target");
				long targetValue = sc.nextInt();
        
				long sum = 0;
				boolean achived=false;
        
				for(int i=0; i<size; i++) {
					sum += money[i];
        	
					if(sum >= targetValue) {
						System.out.println("Target achieved after "+(i+1)+" transactions");
						achived = true;
						break;
					}
				}
        
				if(achived == false) {
					System.out.println(" Given target is not achieved ");
				}
				targets--;
			}  
		}
		else if (size==0){
			System.out.println("No transaction done !");
		}
		else {
			System.out.println("Invalid number of transactions");
			sc.nextLine();	
		}
		
		sc.close();
		
	}
}
