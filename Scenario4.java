package assignment1;

import java.util.Scanner;

public class Scenario4 {

	public static void main(String[] args) {

		int age;
		System.out.println("Entre age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("Not eligible to vote");
		}
	}
}
