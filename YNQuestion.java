package HW2;

import java.util.Scanner;

public class YNQuestion {
	public static void main(String[] args) {
		String ans;
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Health System.");
		System.out.println("Do you have a fever?(use y/n)");
		ans = sc.nextLine();
		if (ans.equals("y")) {
			System.out.println("Do you cough?");
			ans = sc.nextLine();
			if (ans.equals("y")) {
				System.out.println("Are you tired?");
				ans = sc.nextLine();
				if (ans.equals("y")) {
					System.out.println("You caught a cold.");
				}else {
					System.out.println("You have other reason.");
				}
			}else{
				System.out.println("Do you have hypertension?");
				ans = sc.nextLine();
				if (ans.equals("y")) {
					System.out.println("Are you thristy?");
					ans = sc.nextLine();
					if (ans.equals("y")) {
						System.out.println("You have liver disease.");
					}else {
						System.out.println("You have other reason.");
					}
				}else {
					System.out.println("Are you sweat?");
					ans = sc.nextLine();
					if (ans.equals("y")) {
						System.out.println("You have lung disease.");
					}else {
						System.out.println("You have other reason.");
					}
				}
			}
		}else{
			System.out.println("You are healthy.");
		}
		sc.close();
	}
}
