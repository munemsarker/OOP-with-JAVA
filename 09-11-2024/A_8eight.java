import java.util.Scanner;

public class A_8eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Letter: ");
            String str = scanner.nextLine();
            if (str.length()!=1 || !Character.isLetter(str.charAt(0))) {
                System.out.println("error");
            } else {
                char ch = str.charAt(0);
                if ("AEIOUaeiou".indexOf(ch)!=-1) {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
                break;
            }
        }
    }
}
