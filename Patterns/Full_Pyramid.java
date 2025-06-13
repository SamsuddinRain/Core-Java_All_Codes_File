public class Full_Pyramid {
    public static void main(String[] args) {

           /*   This program will be given in this pattern :
                    *
                   ***
                  *****
                 ******* 
            */

        for(int i=1; i<=4; i++) {
            for(int j=3; j>=i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("*");
            }
            for(int l=2; l<=i; l++) {
                System.out.print("*");
            }
            System.out.println("");
           
        }

    }
}