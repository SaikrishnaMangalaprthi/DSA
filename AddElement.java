import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static int[] insert_at_end(int arr[], int endelement){
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        newarr[arr.length+1]=endelement;
        return newarr;
    }    
    public static int[] insert_at_start(int arr[], int beginelement){
        int newarr[]=new int[arr.length+1];
        for(int i=1;i<arr.length;i++){
            newarr[i]=arr[i];
        }
        newarr[0]=beginelement;
         return newarr;
    }    
    public static int[] insert_at_pos(int arr[], int element,int pos){
        int newarr[]=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            newarr[i]=arr[i];
        }
        newarr[pos]=element;
        for(int i=pos;i<arr.length;i++){
            newarr[i+1]=arr[i];
        }
         return newarr;
        
    }    
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc= new Scanner(System.in);
        int n=sc,nextInt();
    
        int[] arr=new int arr[n];
        for(int i=o;i<arr.length;int++){
            arr[i]=sc.nextInt();
        }
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                Codechef.insert_at_end(arr)
            
        }
        

	}
}
ee