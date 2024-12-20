package com.anpc9531.day18;

import java.util.Scanner;

class Demo1 extends Thread
{
	public void run()
	{
		System.out.println("Addition task started");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
	    int c = a+b;
		System.out.println(c);
		System.out.println("Addition task completed");
	}
}
class Demo2 extends Thread
{
	public void run() 
	{
		System.out.println("Character printing task started");
		for(int i = 65 ; i<=75 ; i++)
		{
			System.out.println((char)i);
			try {
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occured");
			}
		}
		System.out.println("Character printing task completed");
	}
}
class Demo3 extends Thread
{
	public void run() 
	{
		System.out.println("Number printing task started");
		for(int i =1;i<=10;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occurred");
			}
		}
		System.out.println("Number printing task completed");
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
		}
}

/*In the above code, all the three activities that is addition, printing alpahabets and printing
 * numbers are written inside run() and every class is extending Thread class. 
 * Since every class is extending thread class, when an object is created of these thread classes,
 * new stack gets created and now thread scheduler creates new thread for each of these stacks due
 * to which concurrent execution takes place and cpu time is utilised efficiently*/
