package assignment1;

import java.util.Scanner;

public class Scenario2 {

	public static void main(String[] args) {
		
		System.out.println("Entre marks");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("Zero");
		}
		else if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
