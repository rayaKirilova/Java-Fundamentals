import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;

        int sumOfFirstPairNumbers = 0 ;
        int sumOfSecondPairNumbers = 0 ;

        for (int i = 0 ; i < n ; i++){
            int number = Integer.parseInt(scan.nextLine()) ;
            sumOfFirstPairNumbers += number ;
        }
        for (int z = 0 ; z < n ; z++){
            int number = Integer.parseInt(scan.nextLine()) ;
            sumOfSecondPairNumbers += number ;
        }

        if (sumOfFirstPairNumbers == sumOfSecondPairNumbers){
            System.out.printf("Yes, sum = %d", sumOfFirstPairNumbers);
        } else {
            int diff = Math.abs((sumOfFirstPairNumbers - sumOfSecondPairNumbers));
            System.out.printf("No, diff = %d",diff );
        }
    }
}
