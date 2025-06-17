public class Swap_Reverse {
    public static void main(String[] args) {

        // This logic is correct for Intervie 
        // this logic not have any types of complexcity:

        int arr[] = {5,10,15,20,30,20,10};

        int temp = arr[0];

        for(int i=0; i<=arr.length-1-i; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp; 
        }
        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}