import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int chickenMenus = Integer.parseInt(scan.nextLine()) ;
        int fishMenus = Integer.parseInt(scan.nextLine()) ;
        int veggyMenus = Integer.parseInt(scan.nextLine()) ;

        double deliveryPrice = chickenMenus * 10.35 + fishMenus * 12.40 + veggyMenus * 8.15 ;

        double dessertPrice = deliveryPrice * 0.2 ;
        double orderPrice = deliveryPrice + dessertPrice + 2.50 ;

        System.out.println(orderPrice);
    }
}
