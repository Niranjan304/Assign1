package assignment1;

import java.util.Scanner;

public class Scenario14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre marks and attendence");
		int marks = sc.nextInt();
		int attendence = sc.nextInt();
		if ((marks > 50) && (attendence > 70)) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}

}
