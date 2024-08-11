import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int key;
        int[] arr = {2, 4, 1, -2, 7, 0};
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            key=arr[i];
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
}
