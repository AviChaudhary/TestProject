package com.test.banker;

import java.util.Scanner;

public class Bankerzzz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		new Bankerzzz();
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the account holders name");
		String s1 = s.nextLine();
		System.out.println("Enter the account number");
		String s2 = s.nextLine();*/
		Bankaccount obj1 = new Bankaccount( "rohan" , "vr474739");
		obj1.showMenu();
   
	}
	class Bankaccount
	{
		int balance ;
		int previousTransaction;
		String customerName;
		String customerID;
		
		Bankaccount(String cname, String cid){
			customerName = cname;
			customerID = cid;
		}
		void deposit(int amount) {
			if(amount != 0 ) {
				balance = balance + amount;
				previousTransaction = amount;
			}
		}
		void withdraw(int amount) {
			if(amount != 0) { 
				balance = balance - amount;
				previousTransaction = -amount;
			}
		}
		void getPreviousTransaction()
		{
			if(previousTransaction>0) {
				System.out.println("Deposited: "+previousTransaction);
			}
			else if(previousTransaction < 0){
				System.out.println("Withdrawn: "+Math.abs(previousTransaction));
			}
			else {
				System.out.println("No Transaction has occured");
			}
		}
		void showMenu() {
			char option = '0';
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Welcome "+customerName);
			 System.out.println("Your ID is "+customerID);
			 System.out.println("\n");
			 System.out.println("A. Check Balance");
			 System.out.println("B. Deposit");
			 System.out.println("C. Withdraw");
			 System.out.println("D. Previous Transaction");
			 System.out.println("E. Exit");
			 
			 
			 do {
				 System.out.println("=================================================================================================================");
				 System.out.println("Enter an option");
				 System.out.println("==================================================================================================================");
				 option = sc.next().charAt(0);
				 System.out.println("\n");
				 
				 
				 switch(option) {
				 case 'A':
					 System.out.println("--------------------------------------------------------------------------------------------------------------");
					 System.out.println(" Balance "+balance);
					 System.out.println("----------------------------------------------------------------------------------------------------------------");
					 System.out.println("\n");
					 break;
					 
				 case 'B':
					 System.out.println("--------------------------------------------------------------------------------------------------------------");
					 System.out.println(" Enter an amount to deposit ");
					 System.out.println("----------------------------------------------------------------------------------------------------------------");
					 int amount = sc.nextInt();
					 deposit(amount); 	
					 System.out.println("\n");
					 break;
					 
				 case 'C':
					 System.out.println("--------------------------------------------------------------------------------------------------------------");
					 System.out.println(" Enter amount to withdraw ");
					 System.out.println("----------------------------------------------------------------------------------------------------------------");
					int amount2 = sc.nextInt();
					withdraw(amount2);
	                 System.out.println("\n");
					 break;
					 
				 case'D' :
					 System.out.println("--------------------------------------------------------------------------------------------------------------");
					getPreviousTransaction();
					 System.out.println("----------------------------------------------------------------------------------------------------------------");
					 System.out.println("\n");
					 break;
					 
				 case 'E' :
					 System.out.println("*************************************************************************************************");
					 break;
					 
				 
				 default :
					 System.out.println("Invalid option! Please enter again");
					 break;
				 
				 }
			 }while(option != 'E');
			 System.out.println("Thank you for using our services");
		}
		
	} 

	

}
