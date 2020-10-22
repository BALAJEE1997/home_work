package home_work.class_3;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int EvenSum = 0;
		int OddSum = 0;
		
		while( i < n) {
			
			int input = sc.nextInt();
			
			if(input%2==0)
				EvenSum = EvenSum+input;
			else
				OddSum = OddSum+input;
			
			i++;
		}
		
		System.out.print(EvenSum );
		System.out.print(" "+OddSum);
		
		 
		// TODO Auto-generated method stub

	}

}
