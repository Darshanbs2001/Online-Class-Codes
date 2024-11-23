package day30;

public class Student1 {

	int rollno;
	String name;
	int marks;
	public static void main(String[] args) {
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		s1.name="abcd";
		s1.rollno=1;
		s1.marks=70;
		s2.name="xyz";
		s2.rollno=2;
		s2.marks=80;
		//this is created to hold the references of student object
		Student1 students[]= {s1,s2};
		for(Student1 s: students) {
			System.out.println(s.name+" : "+s.marks);
		}
	}
}
