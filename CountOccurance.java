import java.util.Arrays;
import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
	     int[] array=new int[12];
	     Scanner s=new Scanner(System.in);
	     int i=0;
	     while(i!=array.length) {
	    	 System.out.println("Enter the no:");
	    	 array[i]=s.nextInt();
	    	 i++;
	     }
	     System.out.println(Arrays.toString(array));
	     CountOccurance co=new CountOccurance();
	     System.out.println("Enter the no , to find occurances :");
	     int  x=s.nextInt();
	     int first=co.firstOccurance(array,array.length,x);
	     int last=co.lastOccurance(array,array.length,x);  
	     System.out.println("First Occurance of "+x+" is at index "+first);
	     System.out.println("Last Occurance of "+x+" is at index "+last);
	     int n=last-first+1;
	     System.out.println("No "+x+" occured in the sorted array "+n+" times");
	}
    public int firstOccurance(int[] arr,int n,int x) {
    	int low=0;
    	int high=n-1;
    	int result=-1;
    	int mid=0;
    	while(low<=high) {
           mid=(low+high)/2;
           if(arr[mid]==x) {
        	   result=mid;
        	   high=mid-1;
               }else {
            	   if(arr[mid]<x) {
            		   low=mid+1;
            	   }else {
            		   high=mid-1;
            	   }
               }
           }
    	
    	return result;
    	
    }
    public int lastOccurance(int[] arr,int n,int x) {
    	int low=0;
    	int high=n-1;
    	int result=-1;
    	int mid=0;
    	while(low<=high) {
           mid=(low+high)/2;
           if(arr[mid]==x) {
        	   result=mid;
        	   low=mid+1;
               }else {
            	   if(arr[mid]<x) {
            		   low=mid+1;
            	   }else {
            		   high=mid-1;
            	   }
               }
        	
           }
    	return result;
      }
}
