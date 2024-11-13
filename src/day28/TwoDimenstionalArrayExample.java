package day28;

import java.util.Scanner;

public class TwoDimenstionalArrayExample {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int age[][]=new int[2][5];
		for(int i=0;i<age.length;i++) {
			//class rooms
			for(int j=0;j<age[1].length;j++) {
				//students
				System.out.println("Enter the age of class "+i+"Student "+j+": ");
				age[i][j]=in.nextInt();
			}
		}
		System.out.println("Entered ages are:");
		for(int i=0;i<age.length;i++) {
			System.out.println("Class "+i+" student ages are: ");
			for(int j=0;j<age[i].length;j++) {
				System.out.println("student "+j+" age is "+age[i][j]);
			}
		}
		

	}
}
