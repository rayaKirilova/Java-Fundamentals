import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        String fruit = scan.nextLine() ; 
        String day = scan.nextLine() ;
        double quantity = Double.parseDouble(scan.nextLine()) ; 

        double totalPrice = 0 ;

        switch (fruit) {
            case "banana":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 2.50 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 2.70 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "apple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 1.20 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 1.25 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "orange":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 0.85 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 0.90 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "grapefruit":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 1.45 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 1.60 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "kiwi":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 2.70 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 3 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "pineapple":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 5.50 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 5.60 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            case "grapes":
                if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                        || day.equals("Friday")) {

                    totalPrice = quantity * 3.85 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else if (day.equals("Saturday") || day.equals("Sunday")) {
                    totalPrice = quantity * 4.20 ;
                    System.out.printf("%.2f", totalPrice) ;  ;
                } else {
                    System.out.printf("error") ;
                }
                break ;
            default:
                System.out.printf("error") ;
                break ;
        }
    }
}
