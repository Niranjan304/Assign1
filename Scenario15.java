package assignment1;

import java.util.Scanner;

public class Scenario15 {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age <= 12) {
			System.out.println("Children" + 100);
		} else if ((age > 12) && (age <= 60)) {
			System.out.println("Adults " + 200);
		} else if (age > 60) {
			System.out.println("Senior Citizen " + 120);
		}
	}

}
