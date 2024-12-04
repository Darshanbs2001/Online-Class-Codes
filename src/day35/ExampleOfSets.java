package day35;

import java.util.HashSet;

public class ExampleOfSets {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet(2);
		set.add(2);
		set.add(1);
		set.add(null);
		for(Integer i:set) {
			System.out.println(i);
		}
		
	}
}
