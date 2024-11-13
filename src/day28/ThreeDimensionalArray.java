package day28;

import java.util.Scanner;

public class ThreeDimensionalArray {
public static void main(String[] args) {
	int age[][][]=new int[2][3][5];
	Scanner in =new Scanner(System.in);
	for(int i=0;i<age.length;i++) {
		for(int j=0;j<age[i].length;j++)
		{
			for(int k=0;k<age[i][j].length;k++) {
				System.out.println("Enter the age of the student from school "+i+" class room "+j+" student "+k);
				age[i][j][k]=in.nextInt();
			}
		}
	}
	for(int i=0;i<age.length;i++) {
		for(int j=0;j<age[i].length;j++)
		{
			for(int k=0;k<age[i][j].length;k++) {
				System.out.println("the age of the student from school "+i+" class room "+j+" student "+k+" is "+age[i][j][k]);
				
			}
		}
	}
	
}
}
