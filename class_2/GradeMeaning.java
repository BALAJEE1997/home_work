package home_work.class_2;

import java.util.Scanner;

public class GradeMeaning {

	public static void main(String[] args) {
		
		System.out.println("Enter grade :-");
		
		Scanner sc = new Scanner(System.in);
		
		char grade = sc.next().charAt(0);
		
		if(grade == 'A')
			System.out.println("Excellent");
		
		else if(grade == 'B')
			System.out.println("Good");
		
		else if(grade == 'C')
			System.out.println("Average");
		
		else if(grade == 'D')
			System.out.println("Deficient");
		
		else if(grade == 'F')
			System.out.println("Failing");
		
		else
			System.out.println("Invalid Grade");
		
//		else if(grade == 'F')
//			System.out.println("A");
		// TODO Auto-generated method stub

	}

}
