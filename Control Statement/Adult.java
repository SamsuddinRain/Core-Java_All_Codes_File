import java.util.Scanner;
public class Adult{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your name :\n");
        String name = sc.nextLine();
        System.out.println(" enter your age :");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(name +" You are an Adult.");
        } else{
            System.out.println(name +" You are not an Adult.");
        }
        sc.close();
    }
}