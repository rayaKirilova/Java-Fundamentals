import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int age = Integer.parseInt(scan.nextLine()) ;
        double washingMachinePrice = Double.parseDouble(scan.nextLine()) ;
        int toyPrice = Integer.parseInt(scan.nextLine()) ;

        double money = 0;
        int toyCounter = 0;
        int evenBirthdayCounter = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                evenBirthdayCounter++;
            } else {
                toyCounter++;
            }
        }

        for (int z = 1; z <= evenBirthdayCounter; z++) {
            money += z * 10;
        }

        double moneyTakenFromBrother = evenBirthdayCounter;
        double moneyFromToys = toyPrice * toyCounter;

        double savedMoney = money + moneyFromToys - moneyTakenFromBrother;


        if (savedMoney >= washingMachinePrice) {
            double diff = savedMoney - washingMachinePrice ;
            System.out.printf("Yes! %.2f", diff);
        } else {
            double diff = washingMachinePrice - savedMoney ;
            System.out.printf("No! %.2f", diff);
        }
    }
}
