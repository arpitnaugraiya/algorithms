import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class DominoPiling {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        if(m<=n)
        {
            int domino;
        domino = (m*n)/2;
        System.out.println(domino);
        }
        else
            System.out.println("Wrong Input");

    }
}

