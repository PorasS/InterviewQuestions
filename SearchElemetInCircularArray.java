import java.util.Scanner;
public class SearchElemetInCircularArray {
	public static void main(String args[]) {
		int array[]=new int[7];
		SearchElemetInCircularArray el=new SearchElemetInCircularArray();
		Scanner s=new Scanner(System.in);
		int i=0;
		System.out.println("Enter the circularly sorted nos:");
		while(i<array.length) {
			System.out.println("Enter a no:");
			array[i]=s.nextInt();
			i++;
		}
		System.out.println("Enter the no you whose position you want to find:");
		int x=s.nextInt();
		System.out.println("no "+x+" is present at index "+el.searchElement(array, x));
		}
  private int searchElement(int array[],int x) {
		int low=0 , res=0 , mid=0;
		int high=array.length-1;
	//modification of binary search
		while(low<=high) {
			mid=(low+high)/2;
			if(x==array[mid]) {
				res=mid;
				break;
			}else {
				if(x>array[mid]) {
					if(x>array[high]) {
						high=mid-1;
					}else {
						low=mid+1;
					}
				}else {
					if(x<array[mid]) {
						if(x<array[high]) {
							high=mid-1;
						}else {
							low=mid+1;
						}
					}
				}
			}
		}
	return res;	
  }
}
