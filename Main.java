import java.util.*;
class Main {
	public static int smallelment(int arr[], int n) {
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
            	min=arr[i];
			}
		}
		return min;
	}
	public static void main(String args[] ) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if (n == 0) {
			System.out.println("Array is empty");

		}
		int arr1[]= new int[n];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=sc.nextInt();

		}

		int min=Main.smallelment(arr1,n);

		System.out.println("The smallest element in the array is: " + min);

	}
}