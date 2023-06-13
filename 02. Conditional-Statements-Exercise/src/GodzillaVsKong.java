import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double budget = Double.parseDouble(scan.nextLine()) ;
        int artists = Integer.parseInt(scan.nextLine()) ;
        double outfitPrice = Double.parseDouble(scan.nextLine()) ;

        double decor = budget * 0.1 ;
        double outfitCost = artists * outfitPrice ;

        if (artists >= 150) {
            outfitCost = outfitCost - outfitCost * 0.1 ;
        }

        double productionPrice = outfitCost + decor ;

        if (productionPrice > budget) {
            double diff = productionPrice - budget ;
            System.out.println("Not enough money!") ;
            System.out.printf("Wingard needs %.2f leva more.", diff);
        } else {
            double diff = budget - productionPrice ;
            System.out.println("Action!") ;
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
    }
}
