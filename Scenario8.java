package assignment1;

import java.util.Scanner;

public class Scenario8 {

	public static void main(String[] args) {
		String username, password;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre username and Password");
		username = sc.nextLine();
		password = sc.nextLine();
		if((username == "admin")&&(password == "1234")) {
			System.out.println("Login Successful");
		}
		else {
			System.out.println("Invalid Credentials");
		}
	}

}
