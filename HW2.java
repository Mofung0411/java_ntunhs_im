package HW2;

import java.util.Random;
import java.util.Scanner;

public class HW2 {
	public static void main(String[] args)
    {
        int big = 100;
        int small = 1;
		Random rand = new Random();
        int ans= rand.nextInt(100);
        int guess = 0;
        Scanner sc=new Scanner (System.in);
        while(true) {
        	System.out.print("Guess a number(number in " + small + "-" + big + "):");
            guess=sc.nextInt();
            if (guess < small || guess > big) {
            	System.out.println("You're kidding me right?");
            //System.out.println("The answer is:"+ans);
            }else {
                int validate_num=ans-guess;
            	if(validate_num>0) {
                    System.out.println("Too small");
                    small = guess;
                }else if (validate_num<0) {
                    System.out.println("Too big");
                    big = guess;
                }else {
                    System.out.println("Bingo");
                    break;
                }
            }
        }
        sc.close();
    }
}