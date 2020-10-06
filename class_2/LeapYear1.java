package home_work.class_2;

import java.util.Scanner;

public class LeapYear1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year :-");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			
			if(year % 100 == 0) {
//				System.out.println("Not Leap Year");
				
				if(year % 400 == 0) 
					System.out.println("Leap Year");
				
			     else
			    	System.out.println("Not Leap Year");
			}
			else
				System.out.println("Leap year");
		}
		else
			System.out.println("Not Leap Year");
}
}

