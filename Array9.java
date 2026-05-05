package Arrays;

import java.util.Scanner;

public class Array9 {
	public static void main(String[] args) {

		System.out.println("Entre the size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array in Reverse order");
		for (int j = size - 1; j >= 0; --j) {
			System.out.println(a[j]);
		}

	}

}
