package day24;
class Plane{
	
}
class CargoPlane extends Plane{
	
}
class Parent{
	public Plane func() {
		Plane p=new Plane();
		System.out.println("Parent class method");
	   return p;
	}
}
class Child extends Parent{
	public CargoPlane func() {
		CargoPlane cp=new CargoPlane();
		System.out.println("Child Class");
		return cp;
	}
}
public class ExampleForThePolymorphism {
	public static void main(String[] args) {
		Parent p=new Parent();
		Parent c=new Child();  
		p.func();
		c.func();

	}
}
