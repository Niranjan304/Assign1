package assignment1;

import java.util.Scanner;

public class Scenario1 {

	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre Marks");
		marks = sc.nextInt();
		if(marks >= 90) {
			System.out.println("A Grade");
		}
		else if((marks >= 75)&&(marks <= 89)){
			System.out.println("B Grade");
		}
		else if((marks <= 74)&&(marks >= 50)) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("12th FAIL");
		}
	}

}
