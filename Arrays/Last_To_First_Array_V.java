public class Last_To_First_Array_V {
    public static void main(String[] args) {

        int arr[] = {9,8,7,6,5,4,3,2,1};

        //Here we will Printing the array values last index to first index  :
        // Note:- Here, this is not a reverse process. remember this thinks

        System.out.println("Last index to First index array value = ");
         for(int i=arr.length - 1; i>=0; i--) {
            System.out.print(arr[i]+" ");

         }
    }
}