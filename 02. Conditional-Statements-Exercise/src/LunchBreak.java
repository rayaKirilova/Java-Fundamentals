import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        String filmName = scan.nextLine() ;
        double episodeLength = Double.parseDouble(scan.nextLine()) ; // 48
        double breakLength = Double.parseDouble(scan.nextLine()) ; // 60

        double lunchLength = breakLength / 8 ; // 7.5
        double restLength = breakLength / 4 ; // 15

        double timeLeft = breakLength - lunchLength - restLength ; // 37.5

        if (timeLeft >= episodeLength) {
            double diff = Math.ceil(timeLeft - episodeLength) ;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", filmName, diff);
        } else {
            double diff = Math.ceil(episodeLength - timeLeft) ; // 10.5
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", filmName,
                    diff);
        }
    }
}
