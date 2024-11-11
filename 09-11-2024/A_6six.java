import java.util.Scanner;

public class A_6six {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first floating point: ");
        float x1= scanner.nextFloat();
        System.out.println("Enter second floating point: ");
        float x2= scanner.nextFloat();
        if (Math.abs(x1-x2)<0.001) {
            System.out.println("Same Same");
        } else {
            System.out.println("Different");
        }
        scanner.close();
    }
}