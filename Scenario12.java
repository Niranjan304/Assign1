package assignment1;

import java.util.Scanner;

public class Scenario12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		if (Character.isLetter(ch)) {
		    System.out.println(ch + " is a Letter");
		} else if (Character.isDigit(ch)) {
		    System.out.println(ch + " is a Digit");
		} else {
		    System.out.println(ch + " is a Special Character");
		}

	}

}
