import java.util.Scanner;

public class YardGardening {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double squareMetres = Double.parseDouble(scan.nextLine()) ;

        double price = squareMetres * 7.61 ;
        double discount = price * 0.18 ;
        double finalPrice =  price - discount ;

        System.out.printf("The final price is: %f lv.", finalPrice) ;
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount) ;

    }
}
