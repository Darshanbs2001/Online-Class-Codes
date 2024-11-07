package day26;
interface Calculator{
	void add();
	void sub();
}
abstract class MyCal1 implements Calculator{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
	}
	
}
public class Rule5 {

}
