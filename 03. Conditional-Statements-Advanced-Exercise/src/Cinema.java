import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        String type = scan.nextLine() ; 
        int row = Integer.parseInt(scan.nextLine()) ;
        int column = Integer.parseInt(scan.nextLine()) ;
        
        int hallArea = row * column ;
        double revenue = 0 ;

        if (type.equals("Premiere")) {
            revenue = hallArea * 12 ;
            System.out.printf("%.2f leva", revenue) ; 
        } else if (type.equals("Normal")) {
            revenue = hallArea * 7.5 ;
            System.out.printf("%.2f leva", revenue) ; 
        } else if (type.equals("Discount")) {
            revenue = hallArea * 5 ;
            System.out.printf("%.2f leva", revenue) ; 
        }
    }
}
