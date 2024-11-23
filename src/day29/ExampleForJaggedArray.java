package day29;

import java.util.Scanner;

//create array to store the ages of 
//student's belonging to 2 classrooms where
//the first classroom has 2 students and second 
//classroom has 5 students 
public class ExampleForJaggedArray {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int ages[][]=new int[2][];
		//when not sure how many students are in each class ,just leave it bland 
		//and specify separatly
		ages[0]=new int[2];
		ages[1]=new int[5];
		System.out.println();
		for(int i=0;i<ages.length;i++) {
			for(int j=0;j<ages[i].length;j++) {
				System.out.println("Enter the age of class "+i+" student "+j);
				ages[i][j]=in.nextInt();
			}
			
		}
		System.out.println("Ages of students are: ");
		for(int i=0;i<ages.length;i++) {
			for(int j=0;j<ages[i].length;j++) {
		}

	}
}
