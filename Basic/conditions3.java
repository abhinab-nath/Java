
import java.util.Scanner;
public class conditions3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        //c=sc.nextInt();

        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(a==b){
            System.out.println(a+" is equal to "+b);
        }
        else{
            System.out.println(a+" is lesser than "+b);
        }
    }
    
}
