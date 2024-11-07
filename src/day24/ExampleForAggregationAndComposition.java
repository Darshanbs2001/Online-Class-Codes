package day24;
class Os{
	private String name;
	private int size;
	public Os(String name, int size) {
		super();
		this.name = name;
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public int getSize() {
		return size;
	}
	
}
class Charger{
	private String brand;
	private int voltage;
	public Charger(String brand, int voltage) {
		super();
		this.brand = brand;
		this.voltage = voltage;
	}
	public String getBrand() {
		return brand;
	}
	public int getVoltage() {
		return voltage;
	}
	
}
class Mobile{
	public Os os=new Os("Android",10);
	public void hasACharger(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}
}
public class ExampleForAggregationAndComposition {
	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger("Nokia",5);
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasACharger(c);

	}
}
