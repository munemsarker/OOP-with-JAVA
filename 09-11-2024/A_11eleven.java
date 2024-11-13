import java.util.Scanner;



public class A_11eleven {
    public static void main(String[]args) {
        int x=1, sum=x;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter yout target: ");
        int target = scanner.nextInt();
        while(x<target){
            System.out.print(x +",");
            x++;
            sum+=x;
        }
        System.out.println(x);
        System.out.println("Sum: "+sum);
        scanner.close();
    }
}