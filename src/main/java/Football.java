import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class Football {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str2 = "1111111";
        String str3 = "0000000";
        if(str.length()<=100){
            if(str.contains(str2)||str.contains(str3)){
                System.out.println("YES");
            }else
                System.out.println("NO");

        }else
            System.out.println("Wrong Input");
    }
}
