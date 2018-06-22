import java.util.Arrays;
import java.util.Scanner; 
public class FirstOccurance {
     public static void main(String args[]) {
    	 Scanner s=new Scanner(System.in);
    	 int[] array=new int [7];
    	
    	 int i=0;
    	 while(array.length!=i) {
    		 System.out.println("Enter the no:");
    		 array[i]=s.nextInt();
    		 i++;
    	 }
    	 System.out.println(Arrays.toString(array));
    	 int low=0;
    	 int high=array.length-1;
    	 FirstOccurance fo=new FirstOccurance();
    	 System.out.println("Enter the no :");
    	 int x=s.nextInt();
    	 System.out.println("First occurance of "+x+" is at index "+fo.firstOc(x, array.length, array));
    	 System.out.println("Last occurance of "+x+" is at index "+fo.lastOc(x, array.length, array));
     }
     public int firstOc(int x,int n,int [] arr ) {
    	 int low=0;
    	 int high=n-1;
    	 int mid=0;
    	 int result=-1;
    	 while(low<=high) {
    		 mid=(low+high)/2;
    		 if(arr[mid]==x){
    			 result=mid;
    			 high=mid-1;
    		 }else{
    			if(arr[mid]>x){
    				high=mid-1;
    			}else {
    				low=mid+1;
    			} 
    		 }
    	 }
    	 return result;
     }
     public int lastOc(int x,int n,int [] arr ) {
    	 int low=0;
    	 int high=n-1;
    	 int mid=0;
    	 int result=-1;
    	 while(low<=high) {
    		 mid=(low+high)/2;
    		 if(arr[mid]==x){
    			 result=mid;
    			 low=mid+1;
    		 }else{
    			if(arr[mid]>x){
    				high=mid-1;
    			}else {
    				low=mid+1;
    			} 
    		 }
    	 }
    	 return result;
     }
}
