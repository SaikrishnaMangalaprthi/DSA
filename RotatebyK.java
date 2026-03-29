import java.util.*;
class RotatebyK{
    public static void reverse(int arr[], int l, int r) {
	 while(l<r){
	     int temp=arr[l];
	     arr[l]=arr[r];
	     arr[r]=temp;
	     l++;
	     r--;
	 }
	}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[]= new int[n];
         int k=sc.nextInt();
         k=k%n;
         reverse(arr,o,n-1);
         reverse(arr, 0,k-1);
         reverse(arr,k,n-1);
        for(int a: arr){System.out.print(a+" ");}
        
        
        sc.close();
    }
}