public class Left_Triangle {
    public static void main(String[] args) {
        /*
        This program will be given in this pattern
               *  
               * *  
               * * *  
               * * * *  
               * * * * *
         */

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++ ) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }



}