package chatbot;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		String temp="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("I'm chatbot, you can ask me question");
			while(true) {
				System.out.print("你說:");
				temp=sc.nextLine();
				temp = temp.replace("嗎" , "").replace("?" , "!").replace("會不會", "會").replace("能不能", "能").replace("你能", "我能").replace("你會", "我會");
			    if (temp.equals("0")) {
				System.out.println("Quit from chatbot.");
				break;
			    }
			    System.out.println("我說:");
			    System.out.println(temp);
			}
		
		sc.close();
	}
}