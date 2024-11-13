import java.util.Scanner;

public class A_14fourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target number: ");
        int num= scanner.nextInt();
        int res,i;
        for(i=1; i<11; i++){
            res= i*num;
            System.out.println(num+"*"+i+"=   "+res);
        }
        scanner.close();
    }
}