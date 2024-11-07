package day23;



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
class Airport{
	void permit(Plane ref) {
		//code reduction by passing parent type reference as parameter
		//and calling the same function
		
		ref.takeOff();
		ref.fly();
		ref.land();
		
	}
}
public class ExampleForPolyMorphism {
static void permit(Plane p) {
	p.takeOff();
	p.fly();
	p.land();
}
public static void main(String[] args) {
	Cargo cp=new Cargo();
	PassengerPlane pp=new PassengerPlane();
	FighterPlane fp=new FighterPlane();
	Plane ref;
	Airport a=new Airport();
	a.permit(cp);//code flexibility is achived by making use of one 
	//function call for all the child type reference
	a.permit(fp);
	a.permit(pp);
	//or
	permit(pp);
	permit(cp);
	permit(fp);
}
}
