package day26;
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
	public void mul() {
		int a=2;
		int b=5;
		int c=a*b;
		System.out.println(a*b);
	}


	
}
public class RulesOfInterface {
public static void main(String[] args) {
	MyCal1 c=new MyCal1();
	Calculator c1;
	c1=c;
	((MyCal1)(c1)).mul();//specialised methods cannot be accessed using interface type reference
}
}
