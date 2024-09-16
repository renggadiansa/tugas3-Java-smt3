import java.util.Scanner;

public class Faktorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void printFaktorial(int n) {
        System.out.printf("%-5s %s%n", "n", "n!");
        System.out.println("-------------");

        for (int i = 1; i <= n; i++) {
            long fact = factorial(i);
            System.out.printf("%-5d %d%n", i, fact);
        }

        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan faktorial: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Bilangan harus lebih besar dari 0.");
        } else {
            printFaktorial(number);
        }

        scanner.close();
    }
}