import java.util.*;
public class Marriage {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();

        System.out.println("Enter Your Monthly Salary:");
        double Monthly_Salary = sc.nextInt();

        if(age <=30 && age >= 18 && Monthly_Salary >= 50000) {
            System.out.println("You are eligible for marriage:");
            
        }else{
            System.out.println("Your are not eligible for Marriage:");
        }
    }
}