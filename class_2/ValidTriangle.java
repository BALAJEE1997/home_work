package home_work.class_2;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		
		System.out.println("Enter three angles of triangle :-");
		
		Scanner tri = new Scanner(System.in);
		
		int angle1 = tri.nextInt();
		
		int angle2 = tri.nextInt();
		
		int angle3 = tri.nextInt();
		
		int sumOfAngle = angle1+angle2+angle3;
		
		if(sumOfAngle == 180)
			System.out.println("Valid");
		
		else
			System.out.println("Not valid");
		// TODO Auto-generated method stub

	}

}
