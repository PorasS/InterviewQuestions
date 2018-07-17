import java.util.Scanner;
public class ArrayInSpiralOrder {
     public static void main(String args[]) {
    	 Scanner s=new Scanner(System.in);
    	 int array[][]=new int[4][4];
    	 for(int i=0;i<array.length;i++) {
    		 for(int j=0;j<array[0].length;j++) {
    			 System.out.println("Enter the no:");
    			 array[i][j]=s.nextInt();
    		 }
    	 }
    	 ArrayInSpiralOrder sp=new ArrayInSpiralOrder();
    	 sp.printInSpiral(array);
    	 
    	 
     }
     private void printInSpiral(int array[][]) {
    	 int t=0;
    	 int b=array.length-1;
    	 int l=0;
    	 int r=array[0].length-1;
    	 int dir=0;
    	 System.out.println(b+" "+r);
    	 while(t<=b&&l<=r) {
    		if(dir==0) {
    			for(int i=t;i<=r;i++) {
    				System.out.print(" "+array[t][i]);
    				}
    			t++;dir++;
    		}else {
    			if(dir==1) {
    				for(int i=t;i<=b;i++) {
        				System.out.print(" "+array[i][r]);
        				}
    				r--;dir++;
    			}else {
    				if(dir==2) {
    					for(int i=r;i>=l;i--) {
    	    				System.out.print(" "+array[b][i]);
    	    				}
    					b--;dir++;
    				}else {
    					if(dir==3) {
    						for(int i=b;i>=t;i--) {
    		    				System.out.print(" "+array[i][l]);
    		    					}
    						l++;dir=0;
    					}
    				}
    			}
    		} 
    	 }
    	 
    	 
     }
}
