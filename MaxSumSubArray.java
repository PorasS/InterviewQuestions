import java.util.Scanner;

public class MaxSumSubArray {

    /**
     * line 1: size of array
     * line 2: pass integers
     * ex:
     * 3
     * 3 4 -3
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [] nums = new int [size];
        for(int i=0;i<size;i++){
            nums[i] = s.nextInt();
        }
        System.out.println("Max Sum Sub Array: "+maxSumSubArray(nums));
    }

    private static int  maxSumSubArray(int [] nums){
        int sum = Integer.MIN_VALUE;
        int ans = 0;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                ans = ans+nums[j];
                if(ans>sum){
                    sum=ans;
                }
            }
            ans=0;
        }
        return sum;
    }

}
