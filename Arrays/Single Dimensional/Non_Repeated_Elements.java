public class Non_Repeated_Elements {
    public static void main(String[] args) {

        // Here, we are printing Non-Repeated Elements from given array::
        // Means whose elements have not pair, then which elements will be printed::

        int arr[] = {2,3,2,1,3,3,4,5};
    
        for(int i=0; i<arr.length; i++) {
             int count=0;

            for(int j=0; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++; 
                }
            }
            if(count == 1) {
                System.out.println(arr[i] + " ");
            }
            
            
        }
       
    }
}