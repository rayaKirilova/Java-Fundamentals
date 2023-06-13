import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        String month = scan.nextLine() ;
        int days = Integer.parseInt(scan.nextLine()) ;

        double apartmentPrice = 0;
        double studioPrice = 0;

        if (month.equals("May") || month.equals("October")) {
            studioPrice = days * 50;
            apartmentPrice = days * 65;

            if (days > 7 && days < 14) {
                studioPrice = studioPrice - studioPrice * 0.05;
            } else if (days > 14) {
                studioPrice = studioPrice - studioPrice * 0.3;
                apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
            }
        } else if (month.equals("June") || month.equals("September")) {
            studioPrice = days * 75.20;
            apartmentPrice = days * 68.70;

            if (days > 14) {
                studioPrice = studioPrice - studioPrice * 0.2;
                apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
            }
        } else if (month.equals("July") || month.equals("August")) {
            studioPrice = days * 76;
            apartmentPrice = days * 77;

            if (days > 14) {
                apartmentPrice = apartmentPrice - apartmentPrice * 0.1;
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
