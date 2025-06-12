import java.util.*;
public class IsPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int Num = sc.nextInt();

        boolean isPrime= true;

        if(Num <= 1) {
           isPrime = false;
            

        } else{
            for(int i=2; i <= Num / 2; i++) {
                if(Num % i == 0) {
                   isPrime = false;
                   break;
                }
            }
        }
        if(isPrime) {
            System.out.println(Num +" This is a Prime Number:");

        }else{
            System.out.println(Num + " This is not a Prime Number:");
        }
    }
}