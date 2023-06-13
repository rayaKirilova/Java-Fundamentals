import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tax = Integer.parseInt(scan.nextLine()) ;

        double trainersPrice = tax - tax * 0.4 ;
        double outfitPrice = trainersPrice - trainersPrice * 0.2 ;
        double ballPrice = outfitPrice / 4 ;
        double accessories = ballPrice / 5 ;

        double finalPrice = tax + trainersPrice + outfitPrice + ballPrice + accessories ;

        System.out.println(finalPrice);
    }
}
