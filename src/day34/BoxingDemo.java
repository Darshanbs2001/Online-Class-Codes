package day34;

public class BoxingDemo {
	public static void main(String[] args) {
		//primitive way of representing 10
		int number =10;
		//non primitive way of representing 10
		Integer num=new Integer(10);
		System.out.println(number+" "+num);
		char x='A';
		Character y=new Character('A');
		//Auto boxing
		int i=5;
		Integer j=new Integer(i);
		//Auto unboxing
		Integer k=new Integer(5);
		int l=k;
		
		
		

	}
}
