public class Kadane {
    public static void main(String[] args) {
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
        int g_max=Integer.MIN_VALUE;
        int c_max=0;
        for(int i=0;i<arr.length;i++){
            c_max+=arr[i];
            if(c_max>g_max)
                g_max=c_max;
            if(c_max<0)
                c_max=0;
        }
        System.out.println(g_max);
    }
}
