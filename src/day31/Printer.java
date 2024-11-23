package day31;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Print implements Runnable{

	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
	
		
		String name=Thread.currentThread().getName();
		System.out.println(name+" started printing");
		for(int i=1;i<=3;i++) {
			System.out.println(name +"is printing");
			try {
				Thread.sleep(4000);
			}
			catch(Exception e) {
				System.out.println("Some problem occured");
			}
		}
		System.out.println(name+" Completed printing");
		
	}
	
}
public class Printer {
	public static void main(String args[])throws InterruptedException {
		Print p=new Print();
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(p);
		t1.setName("Vanisha");
		t2.setName("Tejas");
		t3.setName("Darshan");
		t1.start();
		t2.start();
		t3.start();
	}

}
