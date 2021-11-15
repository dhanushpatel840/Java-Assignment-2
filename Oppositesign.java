import java.util.Scanner;

public class Oppositesign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Frist Number");
        int a = sc.nextInt();

        System.out.println("Enter second Number");
        int b = sc.nextInt();

        if (a * b > 0) {
            System.out.println("Both numbers have same sign");

        } else {
            System.out.println("Both numbers have opposite sign");
        }

    }
}