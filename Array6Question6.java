package assignment1;

import java.util.Scanner;

public class Array6Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of arrays:");
		int size = sc.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value " +i+ "in arr1:");
			arr1[i] = sc.nextInt();
			System.out.println("Enter value " +i+ " in arr2:");
			arr2[i] = sc.nextInt();
		}

		System.out.println("Common elements:");
		int flag = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					flag++;
				}
			}
		}
		if(flag == 0) {
			System.out.println("No Common elements");
		}
	}
}
