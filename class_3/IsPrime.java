package home_work.class_3;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		boolean isPrime = true;
		
		int i;
		
		for(i =2; i*i<=n; i++) {
			
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true)
			System.out.println("yes");
		
		else
			System.out.println("no");
		// TODO Auto-generated method stub

	}

}
