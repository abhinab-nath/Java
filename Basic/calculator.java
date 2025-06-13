//package Basic;
import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //char op;
        int s=0;
        
        System.out.println("Enter the first no: ");
        int x= sc.nextInt();

        System.out.println("Enter the second no: ");
        int y= sc.nextInt();

        System.out.println("ENTER THE OPERATOR: ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                s= x+y;
                break;

            case '-':
                s= x-y;
                break;
            
            case '/':
                s=x/y;
                break;

            case '*':
                s=x*y;
                break;
        
            default:
                System.out.println("Invalid input.");
                break;
        }
        System.out.println("Result= "+s);

    }
}
