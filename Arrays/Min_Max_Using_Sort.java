import java.util.Arrays;

public class Min_Max_Using_Sort {

    public static void main(String... args ) {
        
        int arr[] = {20,55,15,46,66,85,586,524,586,31,88};

        System.out.println("Array Before Shorting:");

        //we printing all arrays values at once
        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
        // We are printing a Minimum and Maximum Values without Using sort method

        System.out.println("After Sorting Array Values:");
        Arrays.sort(arr);
         
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
         
         // This method is not valid for finding min and max in interview:

        System.out.println("The \"Minimum\" Value="+arr[0]);
        System.out.println("The \"Maximum\" value = "+arr[arr.length -1]);
    }
}