package day30;

import java.util.Scanner;

public class Searching {
	static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
	static int binarySearch(int arr[],int key) {
		int high=arr.length-1;
		int low=0,mid;
		while(low<=high) {
			mid=high-low/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
			      low=mid+1;
			else if(key<arr[mid])
				high=mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the search key: ");
		int key=in.nextInt();
	    int pos=binarySearch
	    		(arr,key);
	    if(pos!=-1) {
	    	System.out.println("The element is found at "+pos+" location");
	    
	    }

	}
}
