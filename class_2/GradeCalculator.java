package home_work.class_2;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int marks_1 = sc.nextInt();
		
		int marks_2 = sc.nextInt();
		
		int marks_3  = sc.nextInt();
		
		int averageMarks = (marks_1 + marks_2 + marks_3)/3;
		
		if(averageMarks < 60)
			System.out.println("F");
		
		else if( averageMarks >= 60 && averageMarks < 70)
			System.out.println("D");
		
		else if( averageMarks >= 70 && averageMarks < 80)
			System.out.println("C");
		
		else if( averageMarks >= 80 && averageMarks < 90)
			System.out.println("B");
		
		else if( averageMarks >= 90 && averageMarks < 100)
			System.out.println("A");
		// TODO Auto-generated method stub

	}

}
