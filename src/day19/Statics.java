package day19;

class StaticExample {
	static int a, b;
	static {
		System.out.println("Inside the static block");
		System.out.println(a+b);
		a=10;
		b=20;
	}
	static void function() {
		System.out.println("Inside static method");
	}
	int x,y;
	{
		System.out.println("Inside instance block");
		
	}
	void function1() {
		System.out.println("Inside the instance method");
	}
	StaticExample(){
		System.out.println("Inside the constructor");
		x=30;
		y=70;
	}
}

public class Statics {
	/*public static void main(String args[]) {
		StaticExample e=new StaticExample();
		StaticExample.function();
	}*/
	static int a, b;
	static {
		System.out.println("Inside the static block");
		System.out.println(a+" "+b);
		a=10;
		b=20;
		System.out.println(a+" "+b);
	}
	static void function() {
		System.out.println("Inside static method");
	}
	int x,y;
	{
		System.out.println("Inside instance block");
		
	}
	void function1() {
		System.out.println("Inside the instance method");
	}
	public static void main(String[] args) {
		
	}
}
