public class Array_Demo {
    public static void main(String[] args) {
        // Two ways to create Array. Example:---

        // Examle: 1
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1]= 101;
        arr[2]= 102;
        arr[3]= 103;
        arr[4]= 104;
        arr[1]= 201;  // Here it will update 1th index value


        System.out.println("This is the array first Value = "+arr[0]);
        System.out.println("Array Size is = "+arr.length);
        System.out.println("Updated 1th index value is = "+arr[1]);
        
        // printing all Array elements together using Loop:
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
            
        }

    }
}