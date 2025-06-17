import java.util.Arrays;
class Using_Single_Line {
    public static void main(String[] args) {

        int arr[][] = {{1,2,3}, {4,5,6}};

        for(int[] ar:arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}