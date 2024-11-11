import java.util.Scanner;

public class A_5five {

   public static void main (String[]args) {
        String[] Days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter values from 1 to 7: ");
        try{
        int x = scanner.nextInt();
        if(x>0 && x<8) {
            System.out.println(Days[x-1]);
        }
    } catch (Exception e){
        System.out.println("Enter numbers between 1 to 7");
    }
    scanner.close();
        }
    }