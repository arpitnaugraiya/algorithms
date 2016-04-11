import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class Taxi {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int i,t=0;
        for(i=0;i<n;i++){
            int s = scan.nextInt();
            if(s>=1&&s<=4){
                arr[i] = s;
            }
        }

        for(i=0;i<n;i++){
             t = arr[i]+t;
        }
        if(t%4==0){
            System.out.println(t/4);
        }else
            System.out.println(t/4+1);
    }
}
