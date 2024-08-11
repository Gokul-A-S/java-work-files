public class BinarySqrt {

    public static double squareRoot(int num,int p){
        double ans=0;
        int start=0,end=num;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(mid*mid==num){
                ans=mid;
                return ans;
            }
            if(mid*mid<num){
                start=mid+1;
                ans=mid;
            }
            else{
                end=mid-1;
            }
        }
        double increment=0.1;
        for(int i=0;i<p;i++){
            while(ans*ans<num){
                ans+=increment;
            }
            ans=ans-increment;
            increment=increment/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num=53;
        System.out.println(squareRoot(num,3));
    }
}
