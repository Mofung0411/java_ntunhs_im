package Main;

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StoreValueCard card = new StoreValueCard("ntunhs001", 1000, 0);
        
        int choice = -1;
        while(choice != 0) {

            System.out.print("Please enter the following command 1.In 2.Out 3.Exchange Bouns 4.Card Deatils 0.Shut down:");
            choice = sc.nextInt();
            if (choice == 1 ) {
                System.out.println("Type your amount to add your EasyCard.");
                card.addValue(sc);
            } else if (choice == 2) {
                System.out.println("Type your amount to minus your EasyCard..");
                card.charge(sc);
            } else if (choice == 3) {
                System.out.println("You have chosen to exchange your EasyCard points for bonuses.");
                card.exchangeBonus(sc);
            } else if (choice == 4) {
                System.out.println("You have chosen to view your EasyCard details.");
                System.out.printf("(EasyCard ID: %s , Balance: %d , Bonus Points: %d)\n", card.getCardID(), card.getBalance(), card.getBonus());
            } else if (choice == 0) {
                System.out.println("Thank you for using EasyCard. Goodbye!");
                System.exit(0);
            } 
            else {
                System.out.println("Invalid choice. Please enter a valid command from the list.");
            }
        }
        sc.close();
    }
}

class StoreValueCard {
	
	static int totalCardNum=0;
    private String cardID;
    private int balance;
    private int bonus;

    public StoreValueCard(String cardID, int balance, int bonus) {
        this.cardID = cardID;
        this.balance = balance;
        this.bonus = bonus;
        totalCardNum++;
    }

    public Scanner getScanner() { // Not recommended (explained below)
        return new Scanner(System.in);
    }

    public void addValue(Scanner sc) {
        System.out.print("Type your top up amount:");
        int amount = sc.nextInt();
        if (amount < 0) {
        	System.out.println("Wrong typing");
        }else {
        	this.balance += amount;
            System.out.printf("Your new balance is: %d\n", this.balance);
            if (amount >= 1000) {
            	this.bonus++;
            }
        }
    }

    public void charge(Scanner sc) {
        System.out.print("Type your charge amount:");
        int amount = sc.nextInt();
        if (amount > this.balance) {
            System.out.println("You don't have enough balance");
        } else {
            this.balance -= amount;
        }
    }

    public void exchangeBonus(Scanner sc) {
    	System.out.print("Type your excharge bonus amount:");
        int amount = sc.nextInt();
        if (amount > this.bonus) {
            System.out.println("You don't have enough bonus");
        } else if(amount < 0){
            	System.out.printf("Amount can't be minus.");
        }else {
        	System.out.printf("Successful change.");
        	this.bonus -= amount;
        }
    }

    public String getCardID() {
        return cardID;
    }

    public int getBalance() {
        return balance;
    }

    public int getBonus() {
        return bonus;
    }
}