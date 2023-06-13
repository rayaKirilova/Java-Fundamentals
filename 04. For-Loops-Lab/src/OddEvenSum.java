import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;

        int sumOddNumbers = 0 ;
        int sumEvenNumbers = 0 ;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scan.nextLine()) ;

            if (i % 2 == 0){
                sumEvenNumbers += number ;
            } else {
                sumOddNumbers += number ;
            }
        }
        if (sumEvenNumbers == sumOddNumbers){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEvenNumbers);
        } else {
            int diff = Math.abs((sumEvenNumbers - sumOddNumbers));
            System.out.println("No");
            System.out.printf("Diff = %d",diff );
        }
    }
}
