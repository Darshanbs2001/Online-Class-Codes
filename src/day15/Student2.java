package day15;

public class Student2 {
	String name;
	Student2(String name){
		this.name=name;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}


	public static void main(String[] args) {
		Student2 s[]= {new Student2("Darshan"),new Student2("Vinay")};
		
		System.out.println(s[0]+" "+s[1]);

	}
}
