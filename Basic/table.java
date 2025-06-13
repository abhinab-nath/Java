
import java.util.Scanner;
public class table {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int i;

        System.out.println("Enter the Table: ");
        int n = sc.nextInt();

        for(i=0; i<=10; i++){
            System.out.println(i+" X "+n+" = "+i*n);
        }
    }
    
}
