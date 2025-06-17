public class Demo {
    public static void main(String[] args) {
        
        int arr[][] = new int[2][2];
        arr[0][0] = 5;
        arr[0][1] = 10;
        arr[1][0] = 15;
        arr[1][1] = 30;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                System.out.print(arr[i] [j]+" ");
            }
        }
    }
}