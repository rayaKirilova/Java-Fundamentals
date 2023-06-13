import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int packagesWithPens = Integer.parseInt(scan.nextLine()) ;
        int packagesWithMarkers = Integer.parseInt(scan.nextLine()) ;
        int detergentsInLitres = Integer.parseInt(scan.nextLine()) ;
        int discountPercent = Integer.parseInt(scan.nextLine()) ;

        double sumForSupplies = packagesWithPens * 5.80 + packagesWithMarkers * 7.20 + detergentsInLitres * 1.20 ;
        double sumWithDiscount = sumForSupplies - sumForSupplies * discountPercent / 100 ;

        System.out.println(sumWithDiscount);
    }
}
