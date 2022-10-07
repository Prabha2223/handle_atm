package spiral;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		int balance = 10000, withdraw, deposit,money;
		int atm_b=20000;
		String ac_no;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Handle ATM Process");
			System.out.println("Press:1 for Check Balance");
			System.out.println("Press:2 for Withdraw");
			System.out.println("Press:3 for Transfer Money");
			System.out.println("Press:4 for Check ATM Balance");
			System.out.println("Press:5 for EXIT");
			System.out.print("Choose the operation you want to perform:\n");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Balance :Rs." + balance);
				System.out.println("");
				break;
			case 2:
				System.out.print("Enter money to be withdrawn:\n");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balance!.....................");
				}
				System.out.println("");
				break;
			case 3:
				System.out.println("Enter account number to transfer money:\n");
				ac_no = sc.next();
				System.out.println("Enter Transfer Money:\n");
			    money = sc.nextInt();
				if (balance >= money) {
					balance = balance - money;
					System.out.println("Your Transection successfully!.............");
				} else {
					System.out.println("Insufficient Balance!...."+"Your Balance:"+balance+"\n");
				}
				break;
			case 4:
				int moneyValue=22560;
				System.out.println("Total Money in ATM:"+moneyValue);
			      int[] noteValues= {500,100,50,20,10,1};
			      if(moneyValue>35000)
			      {
			          System.out.println("ATM Cash Limit exceeds.");
			      }
			      else
			      {
			         for(int i=0;i<6;i++){
			             if(moneyValue>=noteValues[i])
			                 System.out.println("No of "+noteValues[i]+"'s"+" :"+moneyValue/noteValues[i]+"\n");
			             moneyValue=moneyValue%noteValues[i];
			         }
			      }
				break;
			case 5:
				System.exit(0);
			}
		}
	}

}
