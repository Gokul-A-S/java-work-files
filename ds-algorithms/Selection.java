import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int min,temp;
        int[] arr={2,4,1,-2,7,0};
        for(int i=0;i<arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++)
                if(arr[j]<arr[min])
                    min=j;
            if(min!=i)
            {
               temp=arr[i];
               arr[i]=arr[min];
               arr[min]=temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
