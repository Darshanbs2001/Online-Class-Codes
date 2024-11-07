package day16;

class CarDetails {
	private String name;
	private int milage;
	private int cost;
    //shadowing problem -> jvm doesn't know which one is which in between local and instance variables when they have same name 
	//this keyword is used to overcome the above problem
	public void setData(String name, int mileage, int cost) {
		this.name = name;
		this.milage = mileage;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public int getMilage() {
		return milage;
	}

	public int getCost() {
		return cost;
	}

}

class Car {
	private String name;
    private int mileage;
    private int cost;
    
	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

public class Encapsulation {
public static void main(String[] args) {
	CarDetails c1=new CarDetails();
	c1.setData("BMW", 10, 10000000);
	//using only getter and setters
	Car c=new Car();
	c.setName("BMW");
	c.setMileage(10);
	c.setCost(100000);
	System.out.println("Name:"+c.getName()+"\nMileage: "+c.getMileage()+"\nCost: "+c.getCost());
}
}
