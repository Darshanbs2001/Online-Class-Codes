package day33;

import java.util.LinkedList;
import java.util.List;

public class ExampleOfLinkedList {
	public static void main(String[] args) {
		List ll=new LinkedList();
		ll.add(10);
		ll.add(10.345);
		ll.add("darshan");
		String text="";
		int arr[]= {1,2,3};
		
		ll.forEach(ele->System.out.println(ele));
		

	}
}
