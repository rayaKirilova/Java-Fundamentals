import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        double budget = Double.parseDouble(scan.nextLine()) ; 
        String season = scan.nextLine() ; 

        double vacationPrice = 0 ;
        String destination = "" ;
        String vacationType = "" ;

        if (budget <= 100){
            destination = "Bulgaria" ;
            if (season.equals("summer")) {
                vacationPrice = budget * 0.3 ;
                vacationType = "Camp" ;
            } else if (season.equals("winter")) {
                vacationPrice = budget * 0.7 ;
                vacationType = "Hotel" ;
            }
        } else if (budget > 100 && budget <= 1000){
            destination = "Balkans" ;
            if (season.equals("summer")) {
                vacationPrice = budget * 0.4 ;
                vacationType = "Camp" ;
            } else if (season.equals("winter")) {
                vacationPrice = budget * 0.8 ;
                vacationType = "Hotel" ;
            }
        } else if (budget > 1000){
            destination = "Europe" ;
            vacationPrice = budget * 0.9 ;
            vacationType = "Hotel" ;
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", vacationType, vacationPrice);
    }
}