/*     Diamond Pattern
-----------------------------------------
   *
  ***
 *****
*******
*******
 *****
  ***
   *
----------------------------------------- */
public class pattern13 {
    public static void main(String[]args){
        int n=4,i;

        // upper half
        for(i=1; i<=n; i++){
            
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        // lower half
        for(i=n; i>=1; i--){
    
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
