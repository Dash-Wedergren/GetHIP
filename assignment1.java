import java.util.Scanner;
public class assignment1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double money = 0.00;
		int exit = 0;
		int pin = 0;	
		//pin loop until pin = 1234
		while(pin != 1234){
			System.out.println("Please enter your PIN: ");
			pin = input.nextInt();
			if(pin != 1234){
				System.out.println("Incorrect pin");
			}
		}
		System.out.println("\nWelcome to Huge Bank Inc.\n");
		//deposit withdrawl loop
		while(exit == 0){
			System.out.printf("Your balance: $%.2f\n",money);
			System.out.println("-1. Make a Deposit");
			System.out.println("-2. Make a Withdrawl");
			System.out.println("-3. Exit\n");
			System.out.print("Your Selection: ");
			int choice = input.nextInt();
			System.out.print("\n");
			switch(choice){
				//Deposit
				case 1:
					System.out.print("Deposit amount: $");
					int deposit = input.nextInt();
					//Add to money
					money += deposit;
					System.out.println("\nDeposit Successful.\n");
					break;
				//Withdrawl
				case 2:
					System.out.print("Withdrawl amount: $");
					int withdrawl = input.nextInt();
					System.out.print("\n");
					if(withdrawl > money){
						System.out.println("\nError. Not enough funds.\n");
					}else{
						money -= withdrawl;
						System.out.println("Withdrawl Successful.\n");
					}
					break;
				case 3:
					exit = 1;
					break;
				default:
					System.out.println("Not a valid choice\n");
					break;
			}
		}
		System.out.println("\nThank you for your business!");
	}
}
