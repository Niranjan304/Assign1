package assignment1;
import java.util.Scanner;

public class Scenario7 {

	public static void main(String[] args) {

		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a,b values");
		a = sc.nextInt();
		b = sc.nextInt();
		char op;
		System.out.println("Entre an Operation");
		op = sc.next().charAt(0);
		switch(op) {
		case('+') : System.out.println(a+b);
		break;
		case('-') : System.out.println(a-b);
		break;
		case('*') : System.out.println(a*b);
		break;
		case('%') : System.out.println(a%b);
		break;
		case('/') : System.out.println(a/b);
		break;
		default :
			System.out.println("Entre a valid operation");
		}
		
		
	}

}
