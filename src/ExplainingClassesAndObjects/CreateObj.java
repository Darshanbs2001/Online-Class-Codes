package ExplainingClassesAndObjects;
class Some{
	int age;
	void setAge(int age) {
		this.age=age;
	}
	void displayAge() {
		System.out.println(this.age);
	}
}
public class CreateObj {
public static void main(String[] args) {
	Some obj=new Some();
	obj.setAge(22);
	obj.displayAge();
}
}
