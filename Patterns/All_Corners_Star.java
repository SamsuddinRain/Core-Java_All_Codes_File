class All_Corners_Star {
    public static void main(String[] args) {

        /* this logic will be printed like as 

                    *****
                    *   *
                    *   *
                    *   *
                    *****
        */ 


        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i>=2 && j>=2 && i<=4 && j<=4 ) {

                System.out.print(" ");
                }else{
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}