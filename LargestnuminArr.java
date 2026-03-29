import java.util.*;
class LargestnuminArr
{
        public static int largestElment(int arr[], int n){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
     public static void main(String args[] ){

            Scanner sc= new Scanner(System.in);
            
            int n= sc.nextInt();
             if (n == 0) {
            System.out.println("Array is empty");
            
            }
            int arr1[]= new int[n];
            for(int i=0;i<arr1.length;i++){
                arr1[i]=sc.nextInt();
                
            }
            
            int max=LargestnuminArr.largestElment(arr1,n);
            
             System.out.println("The smallest element in the array is: " + max);
            
    }
}