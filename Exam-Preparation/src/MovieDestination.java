import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter budget: ");
        double budget = Double.parseDouble(scan.nextLine()) ;

        System.out.println("Enter one of the following destinations: Dubai, Sofia or London");
        String destination = scan.nextLine() ;

        System.out.println("Enter one of the following seasons: Summer or Winter");
        String season = scan.nextLine() ;

        System.out.println("Enter number of days for shooting the movie : ");
        int daysCount = Integer.parseInt(scan.nextLine()) ;

        scan.close() ;

        double pricePerDay = 0 ;

        if (destination.equalsIgnoreCase("Dubai")){
            if (season.equalsIgnoreCase("Winter")){
                pricePerDay = 45000 * daysCount ;
            } else if (season.equalsIgnoreCase("Summer")) {
                pricePerDay = 40000 * daysCount ;
            }
            pricePerDay -= pricePerDay * 0.3 ;
        } else if (destination.equalsIgnoreCase("Sofia")){
            if (season.equalsIgnoreCase("Winter")){
                pricePerDay = 17000 * daysCount ;
            } else if (season.equalsIgnoreCase("Summer")) {
                pricePerDay = 12500 * daysCount ;
            }
            pricePerDay = pricePerDay + pricePerDay * 0.25 ;
        } else if (destination.equalsIgnoreCase("London")) {
            if (season.equalsIgnoreCase("Winter")){
                pricePerDay = 24000 * daysCount ;
            } else if (season.equalsIgnoreCase("Summer")) {
                pricePerDay = 20250 * daysCount ;
            }
        }
        double diff = Math.abs(budget - pricePerDay) ;

        if (budget >= pricePerDay){
            System.out.println(String.format("The budget for the movie is enough! We have %.2f leva left!", diff)) ;
        } else {
            System.out.println(String.format("The director needs %.2f leva more!", diff)) ;
        }
    }
}
