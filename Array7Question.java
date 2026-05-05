package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Array7Question {

	public static void main(String[] args) {

		int avg = 0, sum = 0;
		int high = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Entre total no of students");
		int total = sc.nextInt();
		System.out.println("Entre marks of students");
		for (int i = 0; i < total; i++) {
			arr[i] = sc.nextInt();
		}
		String[] a = Arrays.sort(arr);
		System.out.println("The highest marks are" + a[total - 1]);
		int max = 0;
		for (int i = 0; i < total; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int j = 0; j < total; j++) {
			sum = sum + arr[j];
		}
		System.out.println(sum);
		System.out.println(max);
		System.out.println(sum / total);

	}

}
