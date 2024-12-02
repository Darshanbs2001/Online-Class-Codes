package day32;

class Family implements Runnable {
	String resource1 = "Tv";
	String resource2 = "PlayStation";

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if (name.equals("Rohit")) {
			rohitAccquiredResource();
		} else {
			vijayAcquiredResource();
		}
	}

	void rohitAccquiredResource() {
		synchronized (resource2) {
			try{
				System.out.println("Rohit acquired playstation ");
				Thread.sleep(1000);
				synchronized (resource1) {
					System.out.println("Rohit acquired Tv");
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println("Rohit failed");
			}
		}

	}

	void vijayAcquiredResource() {
		synchronized (resource1) {
			try {
				System.out.println("Vijay acquired Tv ");
				Thread.sleep(1000);
				synchronized (resource2) {
					System.out.println("Vijay acquired PlayStation");
					Thread.sleep(1000);
				}
			} 
			catch (Exception e) {
				System.out.println("Vijay failed");
			}
		}

	}
}
public class ExampleOfDeadLock {
	public static void main(String[] args) {
		Family f=new Family();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		t1.setName("Rohit");
		t2.setName("Vijay");
		t1.start();
		t2.start();
	}
}
