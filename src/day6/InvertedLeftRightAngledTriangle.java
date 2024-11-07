package day6;

public class InvertedLeftRightAngledTriangle {
public static void main(String[] args) {
//to keep track of the rows
	for(int i=0;i<5;i++) {
		//to print the stars in the columns
		for(int j=0;j<5-i;j++) {
			System.out.print("*");//print the star
		}
		//for placing the cursor to next line 
		System.out.println();
	}
}
}
