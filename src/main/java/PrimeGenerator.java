import java.util.Scanner;

/**
 * Created by aitch_nu on 4/11/2016.
 */
public class PrimeGenerator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double s = Math.sqrt(n);
        int count = 0;
        PrimeGenerator obj = new PrimeGenerator();
        for(int i=2;i<s;i++){
            String str = obj.checkPrime(i);
            if(str.equals("yes")){
                count++;
                System.out.println(i);
            }


        }

        System.out.println("Total no. of Primes " + count);
    }

    String checkPrime(int x){
        int flag=0;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return "no";
        }else
            return "yes";
    }
}
