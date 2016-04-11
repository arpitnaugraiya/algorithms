import java.util.Scanner;
/**
 * Created by aitch_nu on 4/11/2016.
 */
public class PrimeGenerator2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[][] arr = new int[t][2];
       /* double s = Math.sqrt(n);*/
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < t; i++) {
            int m = arr[i][0];
            int n = arr[i][1];
            PrimeGenerator2 obj = new PrimeGenerator2();
            for (int j = m; j <= n; j++) {
                if(j==1)
                    continue;
                String str = obj.checkPrime(j);
                if (str.equals("yes"))
                    System.out.println(j);
            }
            System.out.println();
        }


    }

    String checkPrime(int x) {
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            return "no";
        } else
            return "yes";
    }
}
