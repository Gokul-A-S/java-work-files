import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Infosys_S1 {
    public static void main(String[] args) {
        int n,init;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        init=sc.nextInt();
        Integer[][] monster=new Integer[n][2];
        for(int i=0;i<n;i++)
            monster[i][0]= sc.nextInt();
        for(int i=0;i<n;i++)
            monster[i][1]= sc.nextInt();

        Arrays.sort(monster,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++)
            System.out.println(Arrays.toString(monster[i]));

        int i, max=0;
        int curr=init;
        for(i=0;i<n;i++)
        {
            if(monster[i][0]<=curr)
                curr+=monster[i][1];
            else
                break;
        }

        System.out.println(i+1);

    }


}
