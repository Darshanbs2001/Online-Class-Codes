package day2;

public class LogicalOperators {
public static void main(String[] args) {
	int a1=1;
	int b1=2;
	boolean result=a1==1&&a1>=1;
	System.out.println(result);
	boolean result2=a1>5||a1==1;
	System.out.println(result2);
	System.out.println(!true);
	//Ternarry Operators
	System.out.println(1001&1001);
	System.out.println(((10>12)?10:20));
}
}
