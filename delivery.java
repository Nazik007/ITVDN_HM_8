import java.util.Scanner;

public class Delivery {
    public static int factorial (int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть кількість клієнтів, яким треба доставити товар: ");
        System.out.println("Кількість маршрутів буде: " + factorial(scan.nextInt()));
    }
}
