package assignment1;

import java.util.Scanner;

public class Scenario10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double year = sc.nextDouble();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

	}

}
