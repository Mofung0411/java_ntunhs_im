package hw3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		int num;
		
		System.out.printf("Type your array number:");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.printf("Type your number:");
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		idx = num -1;
		
		while(idx >= 0) {
			System.out.printf("%d ",  arr[idx]);
			idx--;
		}
		sc.close();
	}
}
