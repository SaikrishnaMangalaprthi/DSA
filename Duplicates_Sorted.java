import java.util.*;
class Duplicate_Sorted{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                
            }
            int j=0;
            for(int i=1;i<arr.length;i++){
                if(arr[i]!= arr[j]){
                    j++;
                    arr[j]=arr[i];
                }
            }
            for(int a: arr){
                System.out.print(a);
            }
            sc.close();
    }
    
}