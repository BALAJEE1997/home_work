package home_work.class_3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int factorial = 1;
		
		while(n>0) {
			factorial = factorial*n;
			n--;
		}
		
		System.out.println(factorial);
		// TODO Auto-generated method stub

	}

}
