public class Break {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++) {
            for(int j=1; j<= 5; j++) {
                if(j >=2) {
                    break;
                }
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}