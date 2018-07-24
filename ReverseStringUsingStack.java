import java.util.Arrays;
import java.util.Scanner;
public class ReverseStringUsingStack {
   public static void main(String args[]) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the String");
	   String str=s.nextLine();
	   int i=0;
	   char msg[]=new char[str.length()];
	    while(i!=(str.length())) {
		   msg[i]=str.charAt(i);
		   i++;
	   }
	 //   System.out.println(str.length());
	  // System.out.println("String is converted to char array:");
	   //System.out.println("char Array "+Arrays.toString(msg));
	  // System.out.println("String "+str);
	   ReverseStringUsingStack rs=new ReverseStringUsingStack();
	 //  System.out.println("char array passed to reverse():");
	   rs.reverse(msg);
	   System.out.println("String is reversed:");
	  // System.out.println(Arrays.toString(msg));
	   str=new String(msg);
	   System.out.println(str);
   }
   private void reverse(char[] str) {
	  int top=-1;
	  int i=0;
	  char stack[]=new char[str.length];
	  while(i!=str.length) {
		  top++;
		  stack[top]=str[i];
		  i++;
	  }
	  //stack is filled
	  i=0;
	  while(top!=-1) {
		 str[i]=stack[top];
		  i++;
		  top--;
	  }
	  
   }
}
