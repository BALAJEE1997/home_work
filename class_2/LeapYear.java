package home_work.class_2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter year :-");
		
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
			System.out.println("Leap Year");
		
		else
			System.out.println("Not Leap Year");
}
}
