
package assignment1;

import java.util.Scanner;

public class Scenario5 {

	public static void main(String[] args) {
		double salary, experience;
		System.out.println("Entre the salary and experience");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextInt();
		experience = sc.nextInt();
		if (experience > 10) {
			salary = salary * 0.2;
			System.out.println(salary);
		}
		else if((experience > 5)&&(experience < 10)){
			salary = salary * 0.10;
			System.out.println(salary);
		}
		else if((experience > 1)&&(experience < 4)) {
			salary = salary * 0.05;
			System.out.println(salary);
		}
		else {
			System.out.println(salary);
		}
	}

}
