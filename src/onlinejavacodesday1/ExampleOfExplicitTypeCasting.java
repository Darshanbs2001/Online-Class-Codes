package onlinejavacodesday1;

public class ExampleOfExplicitTypeCasting {
public static void main(String[] args) {
	double a=35.5;
	Byte b;
	//Explicit --> loss of precision 
	//here we are converting from double to byte
	b=(byte)(a);
	System.out.println(b.getClass());
}
}
