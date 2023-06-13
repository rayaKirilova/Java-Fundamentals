import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int number = Integer.parseInt(scan.nextLine()) ;

        double bonusPoints = 0 ;

        if (number <= 100) {
            bonusPoints = 5 ;
        } else if (number > 100 && number < 1000) {
            bonusPoints = 0.2 * number ;
        } else if (number > 1000) {
            bonusPoints = number * 0.1 ;
        }

        if (number % 2 == 0) {
            bonusPoints ++ ;
        }

        if (number % 10 == 5) {
            bonusPoints = bonusPoints + 2 ;
        }

        System.out.println(bonusPoints) ;
        System.out.println(number + bonusPoints) ;
    }
}
