import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        int nylon = Integer.parseInt(scan.nextLine()) ;
        int paint = Integer.parseInt(scan.nextLine()) ;
        int detergent = Integer.parseInt(scan.nextLine()) ;
        int hoursForWork = Integer.parseInt(scan.nextLine()) ;

        double sumForSupplies = (nylon + 2) * 1.50 + ((paint + paint * 0.1) * 14.50) + detergent * 5 + 0.40 ;
        double sumForWorkers = sumForSupplies * 0.3 * hoursForWork ;

        double finalSum = sumForSupplies + sumForWorkers ;

        System.out.println(finalSum);
    }
}
