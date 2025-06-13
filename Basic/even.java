
// Print all even numbers till n

import java.util.Scanner;
public class even {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int i;

        for(i=2; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
    
}
