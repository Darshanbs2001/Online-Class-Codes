package day5;

import java.util.Scanner;

public class ForLoopExample {
public static void main(String[] args) {
   Scanner in =new Scanner(System.in);
   System.out.println("Enter the number");
   int n=in.nextInt();
   int sum=0;
   for(int i=1;i<n;i++)
   {
	   sum+=i;
   }
   System.out.println("Sum of "+n+" numbers is :"+sum);
}
}
