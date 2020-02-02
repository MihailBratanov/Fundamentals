import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        boolean Money = true;
        double sum = 0.0;
        double coins = 0;
        double cost = 0.0;
        boolean rich = true;
        boolean product = true;
        while(!command.equals("Start")) {
            switch (command) {
                case "0.1":
                case "0.2":
                case "0.5":
                case "1":
                case "2":
                    Money = true;
                    break;
                default:
                    Money = false;
                    break;
            }
            coins = Double.parseDouble(command);
            if (!Money) {
                System.out.printf("Cannot accept %.2f.", coins);
                System.out.println();
            } else {
                sum += coins;
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
            if(product){
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

