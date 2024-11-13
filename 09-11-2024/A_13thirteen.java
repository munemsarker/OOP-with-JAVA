import java.util.Scanner;

public class A_13thirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its cube: ");
        int x= scanner.nextInt();
        int cube = x*x*x;

        System.out.println("Cube: "+ cube);
        scanner.close();
    }
}
