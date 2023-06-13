import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int budget = Integer.parseInt(scan.nextLine()) ;
        String season = scan.nextLine() ; 
        int fishermans = Integer.parseInt(scan.nextLine()) ;

        double boatPrice = 0 ;

        if (season.equals("Summer") || season.equals("Autumn")) {
            boatPrice = 4200 ;
            if (fishermans > 0 && fishermans <= 6) {
                boatPrice = boatPrice - boatPrice * 0.1 ;
            } else if (fishermans > 7 && fishermans <= 11) {
                boatPrice = boatPrice - boatPrice * 0.15 ;
            } else if (fishermans > 12) {
                boatPrice = boatPrice - boatPrice * 0.25 ;
            }

        } else if (season.equals("Winter")) {
            boatPrice = 2600 ;
            if (fishermans > 0 && fishermans <= 6) {
                boatPrice = boatPrice - boatPrice * 0.1 ;
            } else if (fishermans > 7 && fishermans <= 11) {
                boatPrice = boatPrice - boatPrice * 0.15 ;
            } else if (fishermans > 12) {
                boatPrice = boatPrice - boatPrice * 0.25 ;
            }

        } else if (season.equals("Spring")) {
            boatPrice = 3000 ;
            if (fishermans > 0 && fishermans <= 6) {
                boatPrice = boatPrice - boatPrice * 0.1 ;
            } else if (fishermans > 7 && fishermans <= 11) {
                boatPrice = boatPrice - boatPrice * 0.15 ;
            } else if (fishermans > 12) {
                boatPrice = boatPrice - boatPrice * 0.25 ;
            }
        }

        if (fishermans % 2 == 0 && !season.equals("Autumn")) {
            boatPrice = boatPrice - boatPrice * 0.05 ;
        }

        double diff = 0 ;
        if (boatPrice <= budget) {
            diff = budget - boatPrice ;
            System.out.printf("Yes! You have %.2f leva left.", diff) ;
        } else {
            diff = boatPrice - budget ;
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
