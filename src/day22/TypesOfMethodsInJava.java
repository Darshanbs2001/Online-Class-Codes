package day22;
class Plane{
	void takeOff() {
		System.out.println("Plane is taking off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plane is landing");
	}
}
class Cargo extends Plane{
	//over ridden methods
	@Override
	void fly() {
		System.out.println("Cargo Plane is flying at low heights");
	}
	//specialized method
	void carryCargo() {
		System.out.println("Cargo carries the cargo");
	}
}
class FighterPlane extends Plane{

	@Override
	void fly() {
		System.out.println("Fighter Plane is flying at higher heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carries weapons");
	}
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println("Plane is flying at medium heights");
	}
	void carryPassenger() {
		System.out.println("Plane carries the people");
	}
}
public class TypesOfMethodsInJava {
	public static void main(String[] args) {
		Cargo cp=new Cargo();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carryCargo();
		pp.takeOff();
		pp.fly();
		pp.carryPassenger();
		pp.land();
		fp.takeOff();
		fp.fly();
		fp.carryWeapons();
		fp.land();
	}
}
