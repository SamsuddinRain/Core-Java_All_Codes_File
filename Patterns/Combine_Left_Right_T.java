public class Combine_Left_Right_T {
    public static void main(String[] args) {
        /* This program Will be Given in this pattern
                 * 
                 * *
                 * * *
                 * * * *
                 * * *
                 * *
                 * 
         */
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1; i<=4; i++){
            for(int k=3; k>=i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}