import java.util.Scanner;

/**
 * Created by aitch_nu on 4/10/2016.
 */
public class Problem2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;
        int[][] arr = new int[n][2];
        for(i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=scan.nextInt();
            }
        }


        for(i=0;i<n;i++){
            for (int j =0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }


    }
}
