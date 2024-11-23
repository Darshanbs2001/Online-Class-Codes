package day30;

class Car {
 String name;
 float mileage;
 int cost;
}

public class Demo2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car c=new Car();
		c.name="BMW";
		c.mileage=5.5f;
		c.cost=75;
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		Car c1;
		c1=c;
		System.out.println("=========================");
		System.out.println(c1.name);
		System.out.println(c1.mileage);
		System.out.println(c1.cost);
		c1.name="Tata";
		c1.mileage=15.5f;
		c1.cost=23;
		System.out.println("==========================");
		System.out.println(c.name);
		System.out.println(c.mileage);
		System.out.println(c.cost);
		

	}
}
