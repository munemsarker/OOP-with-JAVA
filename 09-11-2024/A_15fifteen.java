import java.util.Scanner;

public class A_15fifteen {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter yout target: ");
        int n= scanner.nextInt();
        int sum= 0;
        for (int i=1, count=0; count<n; i+=2) {
            sum+=i;
            count++;
        }
        System.out.println("Sum of the first " + n + " odd numbers is:  " + sum);
        scanner.close();
    }
}