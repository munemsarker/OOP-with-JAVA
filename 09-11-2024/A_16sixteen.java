import java.util.Scanner;

public class A_16sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter target: ");
        int row = scanner.nextInt();
        for (int i= 1; i<= row; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(1 +" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}