import java.util.Scanner;

/**
 * Created by aitch_nu on 4/7/2016.
 */
public class NextRound {
    public static void main(String[] args) {
        int i, count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Integer[] score = new Integer[n];
        for (i = 0; i < n; i++) {
            score[i] = scan.nextInt();
        }

        for (i = 0; i < n; i++) {
            if (score[i] > 0) {
                if (score[i] >= score[k-1]) {
                    count++;
                }
            }




        }
        System.out.println(count);
    }
}