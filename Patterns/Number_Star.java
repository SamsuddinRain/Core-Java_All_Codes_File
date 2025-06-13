public class Number_Star {
    public static void main(String[] args) {

        /* This program Will be Given in this pattern
                  1 
                  12 
                  123 
                  1234 
                  12345 
         */

        for(int i=1; i<=5; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}