import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double vacationprice = Double.parseDouble(scan.nextLine()) ;
        int puzzlesCount = Integer.parseInt(scan.nextLine()) ;
        int dollsCount = Integer.parseInt(scan.nextLine()) ;
        int teddysCount = Integer.parseInt(scan.nextLine()) ;
        int minionsCount = Integer.parseInt(scan.nextLine()) ;
        int trucksCount = Integer.parseInt(scan.nextLine()) ; ;

        int toysCount = puzzlesCount + dollsCount + teddysCount + minionsCount + trucksCount ;

        double allToysCost = puzzlesCount * 2.60 + dollsCount * 3 + teddysCount * 4.10
                + minionsCount * 8.20 + trucksCount * 2 ;

        if (toysCount >= 50){
            allToysCost = allToysCost - allToysCost * 0.25 ;
        }

        double rent = allToysCost * 0.10 ;
        double moneyLeft = allToysCost - rent ;

        if (moneyLeft >= vacationprice) {
            double diff = moneyLeft - vacationprice ;
            System.out.printf("Yes! %.2f lv left.", diff);

        } else {
            double diff = vacationprice - moneyLeft ;
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
