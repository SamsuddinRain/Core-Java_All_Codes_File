// import java.util.*;
// public class Calculator {
// public static void main(String[] args) {
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the operator \n (1 for Addition, 2 for Subtraction):");
//     int operator = sc.nextInt();
//     System.out.println("Enter the A and B Values:");
//     int a= sc.nextInt();
//     int b= sc.nextInt();
    


//         switch(operator) {
//         case 1 : System.out.println(a+b);
//         break;
//         case 2 : System.out.println(a-b);
//         break;
//         default : System.out.println("Invalid Numbers");
   
        

//       }  
//    }

// }

import java.util.*;
public class Calculator {
    
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the operator :");
            // Displaying the options for the user
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            
            // Taking input from the user
       int operator = sc.nextInt();
         
         System.out.println("Enter the A and B Values:");
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       switch (operator) {
           case 1:
               System.out.println("Addition value=" + (a + b));
               break;
           case 2:
               System.out.println("Subtraction value=" + (a - b));
               break;
           case 3:
               System.out.println("Multiplication value=" + (a * b));
               break;
           case 4:
               if (b != 0) {
                   System.out.println("Division value=" + (a / b));
               } else {
                   System.out.println("Cannot divide by zero.");
               }
               break;
           default:
               System.out.println("Invalid operator. Please enter a valid operator (1-4).");
       }
   }
}
