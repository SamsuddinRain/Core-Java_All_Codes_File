import java.util.Scanner;
public class Input_Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the Number:");
        int num= sc.nextInt();
        System.out.println("This is the numbers:");
        
        int sum=0;
        for(int i=1; i<=num; i++) {
            sum=sum+i;
        }
        System.out.println("The sum of the numbers is: " + sum);
        sc.close();
    }
}
        
        // Second way to write the code
         // After for loop apply thease lines
//         System.out.println(i +" ");
            
//         }
//         int total_value = 0;
//         for( int i=1; i<=num; i++) {
//             total_value += i;
//         }
//         System.out.println("The sum of the numbers is: " + total_value);
//     }
// }
            