/*     Palindronmic Pattern
---------------------------------------------
    1
   212
  32123
 4321234
543212345
---------------------------------------------*/
public class pattern12 {
    public static void main(String[] args){
        int i;
        int n=5;
       
        for(i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //1st half no.s
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            //2nd half no.s
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
