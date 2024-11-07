package day6;

public class RombusPattern {
public static void main(String[] args) {
	//normal triangle
	for (int i=1;i<=4;i++) {
		for(int k=1;k<=3-i+1;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=2*i-1;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	//inverted triangle
	int count=4;
	for(int i=1;i<=4;i++) {
		for(int k=0;k<i-1;k++) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=((2*count)-1);j++) {
			System.out.print("*");
		}
		count--;
		System.out.println();
	}


}
}
