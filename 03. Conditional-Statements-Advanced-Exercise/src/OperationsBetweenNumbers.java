import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1 = Integer.parseInt(scan.nextLine());
        int n2 = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        if (operator.equals("+")) {
            int result = n1 + n2;
            if (result % 2 == 0) {
                System.out.printf("%d + %d = %d - even", n1, n2, result);
            } else {
                System.out.printf("%d + %d = %d - odd", n1, n2, result);
            }

        } else if (operator.equals("-")) {
            int result = n1 - n2;
            if (result % 2 == 0) {
                System.out.printf("%d - %d = %d - even", n1, n2, result);
            } else {
                System.out.printf("%d - %d = %d - odd", n1, n2, result);
            }

        } else if (operator.equals("*")) {
            int result = n1 * n2;
            if (result % 2 == 0) {
                System.out.printf("%d * %d = %d - even", n1, n2, result);
            } else {
                System.out.printf("%d * %d = %d - odd", n1, n2, result);
            }

        } else if (operator.equals("/")) {
            if (n2 == 0){
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double firstNum = n1 ;
                double secondNum = n2 ;
                double result = firstNum / secondNum ;
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            }

        } else if (operator.equals("%")) {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                int result = n1 % n2 ;
                System.out.printf("%d %% %d = %d", n1, n2, result);
            }
        }
    }
}
