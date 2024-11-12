package day28;

public class Test {
	static void display() throws InterruptedException {

		for(int i=1;i<=5;i++){
			System.out.println(i);
			Thread.sleep(2000);
		}
		
	}
	public static void main(String[] args) {
		try {
			display();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
