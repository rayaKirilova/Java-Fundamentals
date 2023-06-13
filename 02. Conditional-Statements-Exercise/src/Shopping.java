import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double budget = Double.parseDouble(scan.nextLine()) ;
        int videoCardsCount = Integer.parseInt(scan.nextLine()) ;
        int processorsCount = Integer.parseInt(scan.nextLine()) ;
        int ramCount = Integer.parseInt(scan.nextLine()) ;

        double videoCardsPrice = 250 * videoCardsCount ;
        double processorPrice = 0.35 * videoCardsPrice * processorsCount ;
        double ramPrice = 0.10 * videoCardsPrice * ramCount ;

        double expenses = videoCardsPrice + processorPrice + ramPrice ;

        if (videoCardsCount > processorsCount) {
            expenses = expenses - expenses * 0.15 ;
        }

        if (expenses <= budget) {
            System.out.printf("You have %.2f leva left!", budget - expenses);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", expenses - budget);
        }
    }
}
