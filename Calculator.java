import java.util.Scanner;

class calculator {
    public static void main(string args[]) {
        Scanner scan = new scanner(System.in);

        System.out.println("Choose your operation");
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");

        int Choose = scan.nxtint();

        System.out.println("Enter two numbers");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (choose == 1) {
            System.out.println("The answer is: " + add(x, y));
        } else if (choose == 2) {
            System.out.println("The answer is: " + sub(x, y));
        } else if (choose == 3) {
            System.out.println("The answer is: " + mul(x, y));
        } else if (choose == 4) {
            System.out.println("The answer is: " + div(x, y));
        } else {
            System.out.println("Error");
        }

    }

    public static int add(int x, int y) {
        int n;
        n = x + y;
        return n;

    }

    public static int sub(int x, int y) {
        int n;
        n = x - y;
        return n;

    }

    public static int mul(int x, int y) {
        int n;
        n = x * y;
        return n;

    }

    public static int div(int x, int y) {
        int n;
        n = x / y;
        return n;

    }
}