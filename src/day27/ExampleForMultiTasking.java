package day27;
import java.util.Scanner;
public class ExampleForMultiTasking {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Addition task started");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
	    int c = a+b;
		System.out.println(c);
		System.out.println("Addition task completed");
		
		System.out.println("Character printing task started");
		for(int i = 65 ; i<=75 ; i++)
		{
			System.out.println((char)i);
			Thread.sleep(4000);
		}
		System.out.println("Character printing task completed");
		
		System.out.println("Number printing task started");
		for(int i =1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(4000);
		}
		System.out.println("Number printing task completed");
	}

}
