import java.util.*;
class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[]= new int[n];
         for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
                
            }
            
            Map<Integer,Integer> set=new HashMap<>();
            for(int i: arr){
                set.put(i,set.getOrDefault(i,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: set.entrySet()){
                if(entry.getValue()>1){
                    System.out.print(entry.getKey()+ " ");
                }
            }
          
            sc.close();
    }
    
}