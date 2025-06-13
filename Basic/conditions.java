// ADULT OR NOT

import java.util.Scanner;

public class conditions {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= sc.nextInt();

        if(age > 18){
            System.out.println("ADULT.");
        }
        else{
            System.out.println("Not ADULT.");
        }

    }
    
}
