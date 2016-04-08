import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class TheatreSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        long row, col,flagstones;
        if(n%a!=0){
            row = (n/a)+1;
        }else
            row = n/a;
        if(m%a!=0){
            col = (m/a)+1;
        }else
            col = m/a;

        flagstones = row*col;

        System.out.println(flagstones);
    }

}
