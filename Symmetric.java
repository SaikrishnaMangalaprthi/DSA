import java.util.*;
class Symmetric{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int arr[][]= new int[n][2];
         for(int i=0;i<arr.length;i++){
                arr[i][0]=sc.nextInt();
                 arr[i][1]=sc.nextInt();
            }
            
            Map<Integer,Integer> set=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                int first=arr[i][0];
                int second=arr[i][1];
                 if(set.containsKey(second) && set.get(second)==first){
                System.out.print("("+first+","+second+")");
                
            }else set.put(first,second);
          
                
            }
            
           
            sc.close();
    }
    
}