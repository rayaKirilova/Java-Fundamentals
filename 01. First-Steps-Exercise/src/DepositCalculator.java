import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double depositSum = Double.parseDouble(scan.nextLine()) ;
        int period = Integer.parseInt(scan.nextLine()) ;
        double percent = Double.parseDouble(scan.nextLine()) ;

        double finalSum = depositSum + period * ((depositSum * percent/ 100) / 12) ;

        System.out.println(finalSum);
    }
}
