import java.util.Scanner;

public class A_4four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your floating point number");

        double f= scanner.nextDouble();
        if(f==0){
            System.out.println("zero");
        } else if (f<0) {
            System.out.println("negative");
        } else if (f>0 && f<1) {
            System.out.println("small Positive");
        } else if (f>0 && f>1000000) {
            System.out.println("large Positive");
        } else {
            System.out.println("Positive");
        }
        scanner.close();
    }
}