
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //2
            Scanner scanner = new Scanner(System.in);
            System.out.println("napisz pierwsza cyfre: ");
            int n1 = scanner.nextInt();
            System.out.println("napisz druga cyfre: ");
            int W =0;
            int n2 = scanner.nextInt();
            int sum = n1 + n2;
            int minus = n1 - n2;
            int multiply = n1 * n2;
            int subtract = n1 + n2;
            int divide = n1 / n2;
            int rnums = n1 % n2;
            System.out.printf("add = %d\nsub = %d\nMul = %d\nDiv = %d\n ", sum, minus, multiply, subtract, divide, rnums);
        System.out.println(" metoda absoluteValue: ");
        absoluteValue(W);
        }
    public static void absoluteValue(int a) {
        if (a < 0){
            a = a - (2 * a);
            System.out.println("metoda zmienia  na dodatnia: " + a);
        } else {
            System.out.println("Liczba jest dodatnia = " + a);
        }
    }

}


