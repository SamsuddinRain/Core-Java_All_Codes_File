import java.util.*;
public class Pf_Salary {
    public static void main(String... args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Per Annum Salary amount:");
        double Basic_Salary = sc.nextInt();

        double PF_amount = Basic_Salary * 12 /100;
        double Total_Salary = Basic_Salary - PF_amount;
        double Monthly_amount = Total_Salary /12;

        System.out.println("The PF Deducted Salary = "+ PF_amount); 
        System.out.println("Now, The Total Salary is ="+ Total_Salary);
        System.out.println("The Per Month Salary is ="+ Monthly_amount);

    }
}