import java.util.Scanner;

/**
 * Created by aitch_nu on 4/11/2016.
 */
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       /* int fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }*/
        Factorial obj = new Factorial();
        int val = obj.fact(n);
        System.out.println(val);
    }
    int fact(int x){
        if(x==1)
            return 1;
        return x*fact(x-1);
    }
}
