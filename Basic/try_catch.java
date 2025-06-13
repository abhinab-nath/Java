import java.io.*;
public class try_catch{
    public static void main(String [] args){
        try{
            int data = 50/0;
        }
        catch(ArithmeticException e){
            System.out.println("can't be divided by zero");
        }
        System.out.println("REST OF THE CODE.");
    }
}