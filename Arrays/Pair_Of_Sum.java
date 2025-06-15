public class Pair_Of_Sum {
    public static void main(String[] args) {

        /* Here we are printing array element pairs whose sum of equal to given number:
            like if sum = 8 then it will find two element pairs like 5+3=8 ) 
         */
        
        int arr[] = {3,5,1,6,2,7,9};
        
        int sum = 8;
        int temp= 0;

        for(int i=0; i<arr.length; i++) {

            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == sum) {

                    System.out.println(arr[i] + " + " + arr[j] + " = " + sum );
                }
            }
        }


    }
}