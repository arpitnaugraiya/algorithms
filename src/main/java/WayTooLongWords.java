import java.util.Scanner;

/**
 * Created by aitch_nu on 4/7/2016.
 */
public class WayTooLongWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i;

        String longwords[] = new String[n];
        for (i=0;i<n;i++){
            longwords[i] = scan.next();
        }

        for(i=0;i<n;i++){
            int l = longwords[i].length();
            if(l<=10){
                System.out.println(longwords[i]);
            }else
                System.out.println(longwords[i].charAt(0)+Integer.toString(l-2)+longwords[i].charAt(l-1));
        }
    }
}
