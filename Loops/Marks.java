import java.util.*;

public class Marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers (1 for start and 0 for stop:)");
        int choice;

        do {
            System.out.print("Enter a number: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter your marks:");
                int marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is good marks:");
                } else if (marks >= 60) {
                    System.out.println("This is also good marks:");
                } else if (marks >= 0 && marks < 60) {
                    System.out.println("This is good as well:");
                    System.out.println("Because marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
            }

        } while (choice != 0);

        System.out.println("Program ended:");
    }
}
