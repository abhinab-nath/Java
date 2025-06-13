
// Sum of n numbers

import java.util.Scanner;
public class loops {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n= sc.nextInt();
        int i,sum=0;
        for(i=1; i<=n; i++){
            sum= sum+i;
        }
        System.out.println(sum);

    }
}
