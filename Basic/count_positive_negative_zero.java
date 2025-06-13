
import java.util.Scanner;

public class count_positive_negative_zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total numbers: ");
        int n=sc.nextInt();
        int countp=0;
        int countn=0;
        int countz=0;
        
        for(int i=1; i<=n; i++){
            int num=sc.nextInt();
            
            if(num==0){
                countz += 1;
            }
            else if(num<=0){
                countn += 1;
            }
            else{
                countp += 1;
            }
        }

        System.out.println("positive no= "+countp);
        System.out.println("negative no= "+countn);
        System.out.println("zero= "+countz);
    }
}
