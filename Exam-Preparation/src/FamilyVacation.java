import java.util.Scanner;

public class FamilyVacation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        double budget = Double.parseDouble(scan.nextLine()) ;
        int nightCount = Integer.parseInt(scan.nextLine()) ;
        double nightPrice = Double.parseDouble(scan.nextLine()) ;
        int percentExpenses = Integer.parseInt(scan.nextLine()) ;

        scan.close() ;

        if (nightCount > 7){
            nightPrice -= nightPrice * 0.05 ;
        }
        double expenses = budget * percentExpenses / 100 ;
        double vacationPrice = nightCount * nightPrice + expenses ;
        double diff = Math.abs(budget - vacationPrice) ;

        if (budget >= vacationPrice) {
            System.out.println(String.format("Ivanovi will be left with %.2f leva after vacation.", diff)) ;
        } else {
            System.out.println(String.format("%.2f leva needed.", diff)) ;
        }

       // System.out.println(nightPrice);
    }
}
