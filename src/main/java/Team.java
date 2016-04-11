import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class Team {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] arr = new int[n][3];
        int i,j,sol=0;
        for (i=0;i<n;i++) {
            for (j=0; j<3; j++) {
                int x = scan.nextInt();
                if(x==0||x==1){
                    arr[i][j] = x;
                }

            }
        }
       /* for(i=0;i<n;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }*/
        for(i=0;i<n;i++){
            int count = 0;
            for(j=0;j<3;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            if(count>=2){
                sol++;
            }
        }
        System.out.println(sol);
    }
}
