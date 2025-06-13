public class Min_Max_Using_Func {
    public static void main(String[] args) {
        int arr[] = {20,55,46,36,25,49,52,36,61,48};

        int min = arr[0];
        int max = arr[0];

        
        // We are printing a Minimum and Maximum Values without Using sort method
         
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {        // The max value will be compared from zero index to last index
                max = arr[i];
       
            }

            if(arr[i] < min) { // Here, // The min value will be compared from zero index to last index
                min = arr[i];
            }
            
            
        }
        System.out.println("Maximum Value = "+max);
        System.out.println("Minimum Value = "+min);
    }
}