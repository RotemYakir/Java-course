package lab10;

import java.util.Arrays;
import java.util.Scanner;

public class Num44 {

	public static void main(String[] args) {

	
		
		int classSum=0,studentAvg=0,studentSum=0,gradesSum=0;
		int mat[][] = new int [20][10];
		for (int i=0;i<mat.length;i++) {  //loop for every student in class (20)
for (int j=0; j<mat [i].length;j++ ) {  //loop for every grade of each student (10)
	mat[i][j] = (int)(Math.random()*41+60); //the grade of the student in the range of 60-100
	studentSum+=mat[i][j];
	gradesSum++;
	}
classSum+=studentSum;
System.out.println("the grades of student are: ");
System.out.println(Arrays.toString(mat[i]));
studentAvg=studentSum/mat[i].length;
System.out.println("the average grade of the student is: " + studentAvg);
studentSum=0;
		}
		int classAvg= classSum/gradesSum;
		System.out.println("the class average is: " +classAvg);
	}

}
