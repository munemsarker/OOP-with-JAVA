import java.util.Scanner;

public class A_17seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Target: ");
        int rows = scanner.nextInt();
        for (int i= 1; i<= rows; i++) {
            for (int j= 1; j<= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
