import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        String flowerType = scan.nextLine() ;
        int flowerCount = Integer.parseInt(scan.nextLine()) ;
        int budget = Integer.parseInt(scan.nextLine()) ;

        double flowerPrice = 0 ;

        if (flowerType.equals("Roses")) {
            flowerPrice = flowerCount * 5 ;
            if (flowerCount > 80) {
                flowerPrice = flowerPrice - flowerPrice * 0.1 ;
            }

        } else if (flowerType.equals("Dahlias")) {
            flowerPrice = flowerCount * 3.8 ;
            if (flowerCount > 90) {
                flowerPrice = flowerPrice - flowerPrice * 0.15 ;  // 209.44
            }

        } else if (flowerType.equals("Tulips")) {
            flowerPrice = flowerCount * 2.8 ;
            if (flowerCount > 80) {
                flowerPrice = flowerPrice - flowerPrice * 0.15 ;
            }

        } else if (flowerType.equals("Narcissus")) {
            flowerPrice = flowerCount * 3 ;
            if (flowerCount < 120) {
                flowerPrice = flowerPrice + flowerPrice * 0.15 ;
            }

        } else if (flowerType.equals("Gladiolus")) {
            flowerPrice = flowerCount * 2.5 ;
            if (flowerCount < 80) {
                flowerPrice = flowerPrice + flowerPrice * 0.2 ;
            }
        }

        if (flowerPrice <= budget) {
            double diff = budget - flowerPrice ;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerType, diff) ;
        } else {
            double diff = flowerPrice - budget ;
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
