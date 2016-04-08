import java.util.Scanner;

/**
 * Created by aitch_nu on 4/7/2016.
 */
public class WaterMelon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        if(w>=1&&w<=100){
                if(w!=2&&w%2==0){
                    System.out.println("YES");
                } else
                    System.out.println("NO");
        }else
            System.out.println("wrong input");

    }
}
