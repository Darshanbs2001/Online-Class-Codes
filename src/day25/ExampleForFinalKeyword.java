package day25;

final class Test{
	//final int a=100;
	final void func() {
		System.out.println("Inside the parent class method");
	}
}
class Test1 extends Test{
	void func() {
		System.out.println("Inside the child class Overridden method");
	}
}


public class ExampleForFinalKeyword {
	public static void main(String[] args) {

		Test1 t=new Test1();
		t.func();
		//System.out.println(t.a);
		//t.a=101;//this is not possible
		//System.out.println(t.a);
	}
}
