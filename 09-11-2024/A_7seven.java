import java.util.Scanner;

public class A_7seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
            while (true) {
            System.out.println("Enter month number (1-12): ");
            n = scanner.nextInt();
            if (n>=1 && n<=12) {
                break;
            }
        }
        if (n<8 && n%2==1) {
            System.out.println("31");
        } else if (n==2) {
            System.out.print("Enter the year: ");
            int year=scanner.nextInt();
            if (year%4==0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else if (n<8 && n%2==0) {
            System.out.println("30");
        } else if (n%2==1) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
        scanner.close();
    }
}
