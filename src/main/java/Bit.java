import java.util.Scanner;

/**
 * Created by aitch_nu on 4/8/2016.
 */
public class Bit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr=new String[n];
        int x=0,i;
        for( i=0; i<n; i++){
            String exp = scan.next();
            if(exp.equals("++x")||exp.equals("x++")||exp.equals("--x")||exp.equals("x--")){
                arr[i]=exp;
            }

        }

        for(i=0;i<n;i++){
            String str = arr[i];
            x = Integer.parseInt(str);
        }

        System.out.println(x);

        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
