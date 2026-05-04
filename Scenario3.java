package assignment1;

import java.util.Scanner;

public class Scenario3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre 3 numbers");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		if(n1 > n2) {
			if(n2 > n3) {
				System.out.println("Greater number is " +n2);
			}else {
				System.out.println("Greater number is " +n3);
			}
		}
		else {
			if(n2 > n3) {
				System.out.println("Greater number is " +n2);
			}
			else {
				System.out.println("Greater number is " +n1);
			}
		}
	}

}
