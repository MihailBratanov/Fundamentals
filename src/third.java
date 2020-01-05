import java.util.Scanner;

public class third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());
        int after = mins +30;
        if(after>=60){
            after = after-60;
            hours = hours+1;
        }
        if(hours>=24){
            hours=hours-24;
        }
        if(after<10){
            System.out.printf("%d:0%d",hours,after);
        } else {
            System.out.printf("%d:%d",hours,after);
        }

    }
}
