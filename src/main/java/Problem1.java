import java.util.Scanner;

/**
 * Created by aitch_nu on 4/10/2016.
 */
public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];
        int i=0;
        do{
            arr[i]=scan.nextInt();
            i++;
        }while(arr[i-1]!=42);

        for(int j=0;j<i-1;j++){
            System.out.println(arr[j]);
        }

    }
}
