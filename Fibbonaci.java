import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan berapa deret Fibonacci? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah deret harus lebih dari 0.");
        }

        System.out.print(n + " deret Fibonacci = ");

        int a = 1, b = 1;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(a);
            } else if (i == 1) {
                System.out.print(" " + b);
            } else {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(" " + c);
            }
        }

        System.out.println();
        scanner.close();
    }
}
