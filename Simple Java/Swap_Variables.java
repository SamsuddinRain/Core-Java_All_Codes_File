class Swap_Variables {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("\"A\" Value is: " + a);
        System.out.println("\"B\" Value is: " + b);

        // Here we will be Swap these Values:

        int temp = 0;
        temp = a;
        a=b;
        b =temp;
        
         
         System.out.println("After Swaping:");
         System.out.println("\"A\" Value is: " + a);
         System.out.println("\"B\" Value is: " + b);
    }
}