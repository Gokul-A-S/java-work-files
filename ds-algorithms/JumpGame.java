public class JumpGame {

    static int minJumps(int[] arr,int low,int high){
        if(low==high)
            return 0;
        if(arr[low]==0)
            return Integer.MAX_VALUE;

        int min=Integer.MAX_VALUE;

        for(int i=low+1;i<=high;i++){
            if(i<=low+arr[low]) {
                int jumps=minJumps(arr,i,high);
                if(jumps!=Integer.MAX_VALUE&&jumps+1<min)
                    min=jumps+1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=arr.length;
        int res=minJumps(arr,0,n-1);
        System.out.println(res);

    }
}
