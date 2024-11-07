package day4;

public class ExampleForNestedIf {
public static void main(String[] args) {
	int a=11;
	if(a<=10) {
		System.out.println("Inside the outer if");
		if(a==5) {
			System.out.println("a is equal to 5");
			
		}
		else {
			System.out.println("a is not equal to 5");
			
		}
	}
	else {
		System.out.println("a is greater than 10");
	}
}
}
