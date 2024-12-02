package day33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		//ArrayList al=new ArrayList();
		l.add(2);//add used to add an object
		//into the collection 
		l.add(20);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		//size is used get the number elements 
		//present in the array
		System.out.println(l.size());
		//get is used to return the object based on
		//the index position
		System.out.println(l.get(2));
		l.forEach(ele->System.out.println(ele));
		LinkedList ll=new LinkedList();
		//linkedlist has no initial 
		//capacity
		ll.add(1);
		ll.add(3);
		ll.addAll(l);
		ll.add(0, 1);
		//adds the element to the list and 
		
		ll.set(0, 23);
		System.out.println("The new list is : ");
		ll.forEach(ele->System.out.println(ele));

		
	}
}
