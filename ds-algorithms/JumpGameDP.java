import java.util.Arrays;

public class JumpGameDP {

    private static int jump(int[] nums,int low,int high,int[] memo){
        if(low==high)
            return 0;
        if (memo[low]!=-1)
            return memo[low];

        int min_jumps=Integer.MAX_VALUE;

        for(int j=nums[low];j>=1;j--){
            if(j+low<=high)
                min_jumps=Math.min(min_jumps,1+jump(nums,low+j,high,memo));
        }
        memo[low]=min_jumps;
        return min_jumps;
    }

    private static int minJumps(int[] nums){
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return jump(nums,0,nums.length-1,memo);

    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
}
