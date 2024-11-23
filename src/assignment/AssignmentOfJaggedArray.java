package assignment;

import java.util.Scanner;

public class AssignmentOfJaggedArray {
	public static void main(String[] args) {
		int ages[][][]=new int[2][][];
		ages[0]=new int[3][];
		//3,4,5
		ages[0][0]=new int[3];
		ages[0][1]=new int[4];
		ages[0][2]=new int[5];
		ages[1]=new int[2][];
		//3,4
		ages[1][0]=new int[3];
		ages[1][1]=new int[4];
		Scanner in =new Scanner(System.in);
		for(int i=0;i<ages.length;i++) {
			for(int j=0;j<ages[i].length;j++) {
				for(int k=0;k<ages[i][j].length;k++) {
					
					System.out.println("Enter the school "+i+" classroom "+j+" student "+k);
					ages[i][j][k]=in.nextInt();
					
				}
			}
		}
		for(int i=0;i<ages.length;i++) {
			for(int j=0;j<ages[i].length;j++) {
				for(int k=0;k<ages[i][j].length;k++) {
					
					System.out.println(" school "+i+" classroom "+j+" student "+k+" age is: "+ages[i][j][k]);
					
					
				}
			}
		}

	}
}
