import java.util.Scanner;

public class A_3three{
public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    double a = scanner.nextDouble();
    System.out.println("Enter your seconf number: ");
    double b = scanner.nextDouble();
    System.out.println("Enter the third Number: ");
    double c = scanner.nextDouble();

    if (a>b && a>c){
        System.out.println(a+" is the largest number");
    } else if (b>c && b>a){
        System.out.println(b+" is the largest number");
    } else {
        System.out.println(c+" is the largest number");
    }
    scanner.close();
}
}