import java.util.*;
//import Arra
class RotatebyK{
    
	
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];

      
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Array.sort(arr);     
        if(n%2==0){
            int median=(arr[(n/2)-1]+arr[n/2])/2;
            System.out.print(median);
        }else{
            System.out.print(arr[n/2]);
        }
        
        
        
        sc.close();
    }
}