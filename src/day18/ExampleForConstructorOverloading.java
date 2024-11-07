package day18;
class Car{
	private String name;
	private int  mileage;
	private int cost;
	//parametrised constructor
	public Car(String name, int mileage, int cost) {
		super();
		this.name = name;
		this.mileage = mileage;
		this.cost = cost;
	}
	
	//default constructor
	public Car() {
		super();
		name="BMW";
		mileage=10;
		cost=700000;
	}

	public String getName() {
		return name;
	}
	public int getMileage() {
		return mileage;
	}
	public int getCost() {
		return cost;
	}
	
}
public class ExampleForConstructorOverloading {
	public static void main(String[] args) 
	{
		Car c=new Car();
		Car c1=new Car("Audi",25,50000);
		System.out.println("\nName: "+c1.getName()+"\nMileage: "+c1.getMileage()+"\nCost: "+c1.getCost());
		System.out.println("\nName: "+c.getName()+"\nMileage: "+c.getMileage()+"\nCost: "+c.getCost());
	    
		
	}
}
