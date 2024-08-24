import java.util.Scanner;

public class SumThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Erste Zahl:");
        int A = scanner.nextInt();

        System.out.println("Zweite Zahl:");
        int B = scanner.nextInt();

        System.out.println("dritte Zahl:");
        int C = scanner.nextInt();

        double SUM = A + B + C;

        System.out.println("Sum: " + SUM);
    }
}
