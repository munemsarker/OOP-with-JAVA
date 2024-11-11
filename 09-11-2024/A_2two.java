import java.util.Scanner;

public class A_2two {
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a=scanner.nextDouble();
        System.out.println("Enter value of b: ");
        double b=scanner.nextDouble();
        System.out.println("Enter value of c: ");
        double c=scanner.nextDouble();

        double d =(b*b)-4*a*c; 
        if (d>0) {
            double x1= (-b+ Math.sqrt(d))/(2*a);
            double x2= (-b- Math.sqrt(d))/(2*a);
            System.out.println("Real root but different");
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
            
        } else if (d==0) {
            double root =-b/(2*a);
            System.out.println("Real Root and Same");
            System.out.println("Root: " + root);
            
        } else {
            double real= -b/(2*a);
            double img= Math.sqrt(-d)/(2*a);
            System.out.println("Complex Roots");
            System.out.println("X1: "+real+ "+"+img+"i");
            System.out.println("X2: "+real+"-"+img+"i");
        }
        scanner.close();
    }
}
