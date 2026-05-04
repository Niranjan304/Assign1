package assignment1;

import java.util.Scanner;

public class Scenario11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double bill = sc.nextDouble();
		if (bill > 5000.00) {
			bill = bill * 0.30;
			System.out.println(bill);
		} else if ((bill >= 3000.00) && (bill < 5000.00)) {
			bill = bill * 0.20;
			System.out.println(bill);
		} else if ((bill >= 1000.00) && (bill < 3000.00)) {
			bill = bill * 0.10;
			System.out.println(bill);
		} else {
			System.out.println("No Discount");
		}
	}

}
