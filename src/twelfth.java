import java.util.Scanner;

public class twelfth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }
        i = Math.abs(n);
        System.out.printf("The number is: %d", i);

        //new Line
    }
}
