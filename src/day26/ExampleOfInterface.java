package day26;
import java.util.Scanner;
interface Calculator{
	void add();
	void sub();
}
class MyCal1 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}


	
}
class MyCal2 implements Calculator{

	@Override
	public void add() {

		Scanner in =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=in.nextInt();
		System.out.println("Enter the second number:");
		int b=in.nextInt();
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=in.nextInt();
		System.out.println("Enter the second number:");
		int b=in.nextInt();
		int c=a-b;
		System.out.println(c);
	}
	
}
class MyCal3 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
;		System.out.println("Enter the first number:");
		int a=in.nextInt();
		System.out.println("Enter the second number:");
		int b=in.nextInt();
		if(b==0) {
			System.out.println("b is zero ");
			
		}
		else {
			int c=a+b;
			System.out.println(c);
		}
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}
	
}
class Permission{
	void permit(Calculator c) {
		c.add();
		c.sub();
	}
}
public class ExampleOfInterface {
	public static void main(String[] args) {
		Permission p=new Permission();
		MyCal1 m1=new MyCal1();
		MyCal2 m2=new MyCal2();
		MyCal3 m3=new MyCal3();
		p.permit(m1);
		p.permit(m2);
		p.permit(m3);
		

	}
}
