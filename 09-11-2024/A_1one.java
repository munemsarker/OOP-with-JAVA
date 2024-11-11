import java.util.Scanner;
public class A_1one {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number: ");
        try {
            int num=scanner.nextInt();
            if (num>0) {
                System.out.println("POSITIVE!.....");
            } else if (num<0) {
                System.out.println("NEGATIVE...");
            } else {
                System.out.println("ZERO....");
            } 
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number!!!");
        }
        scanner.close();
    }
}