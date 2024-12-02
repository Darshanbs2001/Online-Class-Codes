package day33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		System.out.println("the list is :"+al);
		//sorting using Collections.sort(collection);
		Collections.sort(al);
		
		System.out.println("The list is :"+al);
		for(int i:al) {
			System.out.println(i);
		}

	}
}
