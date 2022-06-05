import java.util.Scanner;

public class Calculator {
    public static void calculate (int x, int y, int z) {
        System.out.println(x / 5);
        System.out.println(y / 5);
        System.out.println(z / 5);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть три цілих числа, які будуть поділені на 5: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        calculate(x,y,z);

    }
}
