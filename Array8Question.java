package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Array8Question {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Entre the array size");
		size = sc.nextInt();
		int[] arr = new int[size];
		int[] rev = new int[size];

		System.out.println("Entre elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			for (int j = size - 1; j < 0; j--) {
				rev[j] = arr[i];
			}
		}
		System.out.println(Arrays.equals(arr, rev));
	}

}
