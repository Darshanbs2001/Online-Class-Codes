package day25;
import java.util.Scanner;
abstract class Shape{
	float area;
	abstract void acceptInput();
	abstract void calArea();
	void dispArea() {
		System.out.println("Area : "+area);
	}
}
class Circle extends Shape{

	private float radius;
	
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
	System.out.println("Enter the radius: "); 
	Scanner in =new Scanner(System.in);
	 this.radius= in.nextFloat();
	 
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		this.area=(float)(Math.PI*radius*radius);
	}
	
}
class Square extends Shape{
   float side;
	@Override
	void acceptInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter the side length:");
		Scanner in =new Scanner(System.in);
		side=in.nextFloat();
		in.close();
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		this.area=side*side;
	}
	
}
class Geometry{
	void permit(Shape p) {
		p.acceptInput();
		p.calArea();
		p.dispArea();
	}
}
public class Demo {
	public static void main(String[] args) {
		Circle c=new Circle();
		Square s=new Square();
		Geometry g=new Geometry();
		g.permit(c);
		g.permit(s);

	}
}
