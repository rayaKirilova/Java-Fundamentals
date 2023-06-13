import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        double strawberryPrice = Double.parseDouble(scan.nextLine());
        double bananasQuantity = Double.parseDouble(scan.nextLine());
        double orangesQuantity = Double.parseDouble(scan.nextLine());
        double rasberriesQuantity = Double.parseDouble(scan.nextLine());
        double strawberriesQuantity = Double.parseDouble(scan.nextLine());

        scan.close() ;

        double rasberryPrice = strawberryPrice / 2 ;
        double orangesPrice = rasberryPrice - rasberryPrice * 0.4 ;
        double bananasPrice = rasberryPrice - rasberryPrice * 0.8 ;

        double neededMoney = strawberryPrice * strawberriesQuantity + rasberryPrice * rasberriesQuantity +
                orangesPrice * orangesQuantity + bananasPrice * bananasQuantity ;

        System.out.println(String.format("%.2f", neededMoney)) ;
    }
}
