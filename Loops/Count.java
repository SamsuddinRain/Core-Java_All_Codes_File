import java.util.Scanner;
public class Count {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Number:");
        int num = sc.nextInt();

        int counter = 1;
        while(counter <= num) {
            System.out.println(counter);
            counter++;
        }
    }}