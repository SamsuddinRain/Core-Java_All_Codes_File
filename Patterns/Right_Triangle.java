public class Right_Triangle {
    public static void main(String[] args) {

        /* This program Will be Given in this pattern
                  
                   *
                  **
                 ***
                ****
               ***** 
         */

        for(int i=1; i<=5; i++) {
            for(int k= 5-i; k>=1; k-- ) {   //This line of code uses for giving Space
                System.out.print(" ");      

            }
            for(int j=1; j<=i; j++){
                System.out.print("*");     //This line of code uses for printing Star

            }
            
            System.out.println("");
        }
            
    }
}