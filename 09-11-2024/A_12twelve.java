import java.util.Scanner;

public class A_12twelve {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);
        int sum=0;
        int max=5;
        System.out.println("Please enter 5 numbers Below with enter::: ");
        for (int i=0; i<max; i++) {
            System.out.print("Number " + (i+1)+": ");
            int number=scanner.nextInt();
            sum+=number;
        }
        double average = (double)sum/max;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        scanner.close();
    }
}