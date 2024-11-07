package day25;

abstract class Plane {
	abstract void takeOff();

	abstract void fly();

	abstract void land();
}

class CargoPlane extends Plane {

	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Cargo plane is taking off");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Cargo plane is flying");
	}

	@Override
	void land() {
		// TODO Auto-generated method stub

		System.out.println("Cargo plane is landing");
	}

}
class PassengerPlane extends Plane{

	@Override
	void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane is taking off");
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Passenger plane is flying ");
	}

	@Override
	void land() {
		// TODO Auto-generated method stub
		System.out.println("Passenger palne is landing");
	}
	
}
class Airport{
	void permit(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
		
	}
}
public class ExampleForAbstraction {
	public static void main(String[] args) {

		CargoPlane p1=new CargoPlane();
		PassengerPlane p2=new PassengerPlane();
		Airport a=new Airport();
		a.permit(p1);
		a.permit(p2);
	}
}
