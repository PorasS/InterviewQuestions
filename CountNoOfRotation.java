import java.util.Arrays;
import java.util.Scanner;
public class CountNoOfRotation {
  public static void main(String args[]) {
	  //Count the no of rotations of circularly sorted list with no duplicates.....
	  Scanner s=new Scanner(System.in);
	  int[] arr=new int[8];
	  int i=0;
	  while(i<arr.length) {
		System.out.println("Enter th no:");
		arr[i]=s.nextInt();
		i++;
	  }
	  CountNoOfRotation cn=new CountNoOfRotation();
	  System.out.println(Arrays.toString(arr));
	  System.out.println("The sorted list of no is Rotated "+cn.countRotation(arr)+" times:");
	  
  }
  public int countRotation(int[] arr) {
	  int low=0;
	  int high=arr.length-1;
	  int mid=0;
	  int res=0;
	  while(low<=high) {
		  mid=(low+high)/2;
		  if(arr[low]<arr[high]){
			  res= low;
			  break;
		  }else {
			  if(arr[mid]<arr[high]) {
				  if(arr[mid-1]>arr[mid]&&arr[mid+1]>arr[mid]) {
					  res= mid;
					  break;
				  }else {
					  high=mid-1;
				  }
				  
			  }else {
				  if(arr[mid]>arr[high]) {
					  low=mid+1;
				  }
			  }
			  
		  }
		 
	  }
	  return res;
  }
}
