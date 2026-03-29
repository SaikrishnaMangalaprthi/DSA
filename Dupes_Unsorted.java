import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                
            }
         LinkedHashSet<Integer,Integer> set= new LinkedHashSet<>();
         for(int i=0;i<arr.length;i++){
             set.add(arr[i]);
         }
            for(int i: set){
                System.out.print(i+ " ");
            }
            sc.close();
    }
    
}