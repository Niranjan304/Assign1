package assignment1;
import java.util.Scanner;

public class Scenario9 {

	public static void main(String[] args) {
		int bill,units;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre no.of units");
		units = sc.nextInt();
		if (units <= 100) {
			bill = units*2;
			System.out.println("Bill :" +bill);
		}
		else if((units >100)&&(units <= 300)) {
			bill = units*3;
			System.out.println("Bill :" +bill);
		}
		else if(units > 300) {
			bill = units *5;
			System.out.println("Bill :" +bill);
		}
	}
}
