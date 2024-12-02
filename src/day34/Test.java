package day34;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(1,"ABC");
		Student s2=new Student(2,"XYZ");
		Student s3=new Student(3,"PQR");
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		for(Student s: al) {
			System.out.println("Student details: ");
			System.out.println("Name: "+s.getName()+" Age: "+s.getAge());
		}

	}
}
