import java.util.Scanner;

public class A_9nine {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year = scanner.nextInt();
        if(year%4==0 || year%400==0){
        System.out.println("Leap year");
        }else System.out.println("Not Leap year");
    }
}