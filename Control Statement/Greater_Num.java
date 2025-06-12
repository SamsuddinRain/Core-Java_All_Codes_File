import java.util.Scanner;
public class Greater_Num {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the a,b and c numbers:");
int a= sc.nextInt();
int b= sc.nextInt();
int c= sc.nextInt();

if(a>b){
System.out.println(a + " is the greatest Number");
}
else if(b>c){
System.out.println(b + " is the greatest Number");
}else{
System.out.println(c + " is the greatest Number");

}
}
}