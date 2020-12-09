import java.util.Scanner;

public class AlternateBinaryStringCount {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        String str = s.next();

        System.out.println("No of char to alternate: "+alternateStringCount(str));
    }

    public static int alternateStringCount(String str){
        char[] strArray =  str.toCharArray();
        int count = 0;

        for(int i=0;i<strArray.length-1;i++){
            if(strArray[i]==strArray[i+1]){
                count++;

                if(strArray[i+1]=='0'){
                    strArray[i+1]='1';
                }else{
                    strArray[i+1]='0';
                }
            }
        }
        return count;
    }
}
