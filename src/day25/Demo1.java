package day25;
abstract class Bird{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle flys at great heights");
	}
}
class SerpentEagle extends Eagle{

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eagel eats a snake");
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		SerpentEagle s=new SerpentEagle();
		s.eat();
		s.fly();
		

	}
}
