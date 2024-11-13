package day28;

import java.util.Scanner;

//create an array to store the ages of 5 students
public class OneDimensionalArrayExample {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int ages[]=new int[5];
		System.out.println("Enter the 5 students ages: ");
		for(int i=0;i<ages.length;i++)
			ages[i]=in.nextInt();
		System.out.println("Ages of five students are: ");
		for(int i=0;i<5;i++)
			System.out.print(ages[i]+" ");
		

	}
}
