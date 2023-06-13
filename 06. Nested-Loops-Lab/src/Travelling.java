import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String destination = scan.nextLine() ;
        int budget = Integer.parseInt(scan.nextLine()) ;

        int savings = 0;

        while (!destination.equals("End")) {
            while (savings < budget) {
                int num = Integer.parseInt(destination) ;
                savings += num ;
            }
            System.out.printf("Going to %s", destination);
        }
    }
}
