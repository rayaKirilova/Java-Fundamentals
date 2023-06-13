import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int firstNumber = Integer.parseInt(scan.nextLine()) ;
        int secondNumber = Integer.parseInt(scan.nextLine()) ;

        String printLine = "" ;

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNumber = "" + i;
            int oddSum = 0;
            int evenSum = 0;

            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j)) ;

                if (j % 2 == 0){
                    evenSum += currentDigit ;
                } else {
                    oddSum += currentDigit ;
                }
            }
            if (oddSum == evenSum){
                System.out.print(i + " ");
            }
        }
    }
}
