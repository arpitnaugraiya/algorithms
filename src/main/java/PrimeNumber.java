import java.util.Scanner;

/**
 * Created by aitch_nu on 4/11/2016.
 */
public class PrimeNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag=0;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Number is not prime");
        }else
            System.out.println("Number is Prime");
    }

}
