package day15;

public class ObjectClass {
	//Overriding the methods
	public String toString() {
		return "This is Darshan";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectClass e=new ObjectClass();
		System.out.println(e);//it is implicitly calls the toString
		System.out.println(e.toString());//explicitly by using this is what happens in the toString() of the Object class
		

	}
}
