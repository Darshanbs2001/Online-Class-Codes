package day28;

public class CheckedException {
	public static void main(String[] args) {

		for(int i=1;i<5;i++) {
			System.out.println(i);
			Thread.sleep(2000);//compiler checked exception// we need to handled immediately
		}
	}
}
