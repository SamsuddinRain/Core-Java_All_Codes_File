public class Ascending_Order {
    public static void main(String... args) {

        // Here, we are printing array in ascending order:

        int arr[] = {5,8,2,6,9,3};

        int temp=0;

        for(int i=0; i< arr.length; i++) { 
            for(int j= i+1; j< arr.length; j++) {

        if(arr[i] > arr[j]) {   // here, if  we change the condition (greater > to Less then <) the array will be printed in descending order: 
             temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

        }
        
        }
        }
        System.out.println("The Ascending Order Array:");
        for(int n : arr) {
            System.out.print(n + " ");

    }
    }
}
