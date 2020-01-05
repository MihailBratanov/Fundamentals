import java.util.Scanner;

public class eleventh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
                int n = Integer.parseInt(scanner.nextLine());
                int i = Integer.parseInt(scanner.nextLine());
                int sum = 0;
                int sum2=0;
                if(i>10){
                    sum2=n*i;
                    System.out.printf("%d X %d = %d",n,i,sum2);
                    return;
                }
                for(int a=i; a<=10;a++){
                    sum = a*n;
                    System.out.printf("%d X %d = %d",n,a,sum);
                    System.out.println();
                }
            }
        }
