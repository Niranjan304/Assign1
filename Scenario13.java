package assignment1;

import java.util.Scanner;

public class Scenario13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		if (temp > 35) {
			System.out.println("Very Hot");
		} else if ((temp < 35) && (temp > 25)) {
			System.out.println("Warm");
		} else if ((temp > 15) && (temp < 25)) {
			System.out.println("Cool");
		} else {
			System.out.println("Cold");
		}
	}

}
