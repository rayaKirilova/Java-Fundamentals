import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int days = Integer.parseInt(scan.nextLine()) ; 
        String roomType = scan.nextLine() ;
        String feedback = scan.nextLine() ;

        double totalPrice = 0;

        if (days < 10) {
            if (roomType.equals("room for one person")) {
                totalPrice = (days - 1) * 18;
            } else if (roomType.equals("apartment")) {
                totalPrice = (days - 1) * 25;
                totalPrice = totalPrice - totalPrice * 0.3;
            } else if (roomType.equals("president apartment")) {
                totalPrice = (days - 1) * 35;
                totalPrice = totalPrice - totalPrice * 0.1;
            }
        } else if (days >= 10 && days <= 15) {
            if (roomType.equals("room for one person")) {
                totalPrice = (days - 1) * 18;
            } else if (roomType.equals("apartment")) {
                totalPrice = (days - 1) * 25;
                totalPrice = totalPrice - totalPrice * 0.35;
            } else if (roomType.equals("president apartment")) {
                totalPrice = (days - 1) * 35;
                totalPrice = totalPrice - totalPrice * 0.15;
            }
        } else if (days > 15) {
            if (roomType.equals("room for one person")) {
                totalPrice = (days - 1) * 18;
            } else if (roomType.equals("apartment")) {
                totalPrice = (days - 1) * 25;
                totalPrice = totalPrice - totalPrice * 0.5;
            } else if (roomType.equals("president apartment")) {
                totalPrice = (days - 1) * 35;
                totalPrice = totalPrice - totalPrice * 0.2;
            }
        }
        if (feedback.equals("positive")) {
            totalPrice = totalPrice + totalPrice * 0.25;
        } else if (feedback.equals("negative")) {
            totalPrice = totalPrice - totalPrice * 0.1;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
