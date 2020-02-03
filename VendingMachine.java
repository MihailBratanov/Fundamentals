import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        //name variables using camelCase  - https://en.wikipedia.org/wiki/Camel_case
        boolean money = true;
        double sum = 0.0;
        double coins = 0;
        double cost = 0.0;
        boolean rich = true;
        boolean product = true;
        boolean shouldPrintMoneyAccept = true;



        while (!command.equals("Start")) {
            switch (command) {
                //comment out to see what's printing if you need to debug
                case "0.1":
                    //System.out.println("0.1");
                case "0.2":
                    // System.out.println("0.2");
                case "0.5":
                    // System.out.println("0.5");
                case "1":
                    // System.out.println("1.0");
                case "2":
                    money = true;
                    break;
                default:
                    money = false;
                    break;
            }
            try {

                coins = Double.parseDouble(command);
                shouldPrintMoneyAccept = true;
            } catch (NumberFormatException e) {
                System.out.println("please enter a valid command.");
                shouldPrintMoneyAccept = false;
            }

            if (!money && shouldPrintMoneyAccept) {

                System.out.printf("Cannot accept %.2f.", coins);
                System.out.println();
            } else {
                sum += coins;
                // System.out.println(sum);
            }
            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {

            switch (command) {
                case "Nuts":
                    sum = sum - 2.0;
                    break;
                case "Water":
                    sum = sum - 0.7;
                    break;
                case "Crisps":
                    sum = sum - 1.5;
                    break;
                case "Soda":
                    sum = sum - 0.8;
                    break;
                case "Coke":
                    sum = sum - 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    product = false;
                    break;
            }
            if (product) {
                if (sum < 0) {
                    System.out.println("Sorry, not enough money");
                    rich = false;
                } else {
                    System.out.println(String.format("Purchased %s.", command));
                }
                command = scanner.nextLine();
            }
        }
        System.out.println(String.format("Change: %.2f.", sum));
    }


}
