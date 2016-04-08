import java.util.Scanner;

/**
 * Created by aitch_nu on 4/7/2016.
 */
public class StringTask {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        String text = scan.next();
        char arr[]= text.toCharArray();
        for(int i = 0;i<arr.length;i++){
            if(arr[i]=='A'||arr[i]=='a'||arr[i]=='E'||arr[i]=='e'||arr[i]=='I'||arr[i]=='i'||arr[i]=='O'||arr[i]=='o'||arr[i]=='U'||arr[i]=='u'||arr[i]=='Y'||arr[i]=='y'){

            }else
            if(Character.isUpperCase(arr[i]))
            {
                System.out.print("."+ Character.toLowerCase(arr[i]));
            }else
                System.out.print("."+ arr[i]);
        }
    }
}
