package assignment1;

import java.util.Scanner;

public class Array9Question {

	public static void main(String[] args) {
		
		System.out.println("Entre the size");
		Scanner sc  =  new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Array in Reverse order");
        for ( int j = a.length-1;j<0 ;j--){
            System.out.println(a[j]);
        }

	}

}
