package day35;

import java.util.Vector;

public class ExampleForVector {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(10);
		v.add(20);
	   for(Integer i: v) {
		   System.out.println(i);
	   }

	}
}
