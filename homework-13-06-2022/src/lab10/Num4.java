package lab10;

import java.util.Scanner;

public class Num4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int classSum=0,studentAvg=0,studentSum=0;
		int mat[][] = new int [20][2];
		for (int i=0;i<mat.length;i++) {  //loop for every student in class (20)
for (int j=0; j<mat [i].length;j++ ) {  //loop for every grade of one student (10)
	System.out.println( "Hello student, please insert your grade (80-100): ");
	int grade= sc.nextInt();
	classSum+=grade;
	studentSum+=grade;
	}
studentAvg=studentSum/mat[i].length;
System.out.println("the average grade of the student is: " + studentAvg);
studentSum=0;
		}
		sc.close();
		int classAvg= classSum/mat.length;
		System.out.println("the class average is: " +classAvg);
	}

}
