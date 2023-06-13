import java.sql.SQLOutput;
import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        String product = scan.nextLine() ;
        String city = scan.nextLine() ; 
        double quantity = Double.parseDouble(scan.nextLine()) ; 

        double cost = 0 ;

        if (product.equals("coffee")) {

            if (city.equals("Sofia")) {
                cost = quantity * 0.50 ;
            } else if (city.equals("Plovdiv")) {
                cost = quantity * 0.40 ;
            } else if (city.equals("Varna")) {
                cost = quantity * 0.45 ;
            }
        } else if (product.equals("water")) {

            if (city.equals("Sofia")) {
                cost = quantity * 0.80 ;
            } else if (city.equals("Plovdiv") || city.equals("Varna")) {
                cost = quantity * 0.70 ;
            }
        } else if (product.equals("beer")) {

            if (city.equals("Sofia")) {
                cost = quantity * 1.20 ;
            } else if (city.equals("Plovdiv")) {
                cost = quantity * 1.15 ;
            } else if (city.equals("Varna")) {
                cost = quantity * 1.10 ;
            }
        } else if (product.equals("sweets")) {

            if (city.equals("Sofia")) {
                cost = quantity * 1.45 ;
            } else if (city.equals("Plovdiv")) {
                cost = quantity * 1.30 ;
            } else if (city.equals("Varna")) {
                cost = quantity * 1.35 ;
            }
        } else if (product.equals("peanuts")) {

            if (city.equals("Sofia")) {
                cost = quantity * 1.60 ;
            } else if (city.equals("Plovdiv")) {
                cost = quantity * 1.50 ;
            } else if (city.equals("Varna")) {
                cost = quantity * 1.55 ;
            }
        }
        System.out.println(cost);
    }
}
