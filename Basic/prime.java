
// Prime Number

import java.util.Scanner;
public class prime {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n= sc.nextInt();
        int i,count=0;
        for(i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number.");
        }
        else{
            System.out.println("Not a Prime Number.");
        }
    }
}
