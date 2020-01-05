import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class ninth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int sum = 0;
        while (n>0){
            System.out.println(i);
            sum+=i;
            i+=2;
            n--;
        }
        System.out.printf("Sum: %d",sum);
    }
}
