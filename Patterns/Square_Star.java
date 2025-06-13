public class Square_Star {
     public static void main(String[] args) {
        /* This program Will be Given in this pattern
                  
                  * * * * *  
                  * * * * *
                  * * * * *
                  * * * * *
                  * * * * * 
         */

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}