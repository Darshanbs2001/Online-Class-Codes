package day30;

public class BubbleSorting {
	static void bubbleSort(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	//real bubble sort
	static void bubbleSort1(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
				     arr[j]=arr[j+1];
				     arr[j+1]=temp;
				}
			}
		}
	}
	static void BubbleSort(int arr[]) {
		int min,temp;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					min=j;
				}
			}
			//swap
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,2,7,5,3,1};
		bubbleSort1(arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}
}
