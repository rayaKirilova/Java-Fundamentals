import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        String figure = scan.nextLine() ; 

        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine()) ;
            double result = a * a ;
            System.out.printf("%,.3f", result) ;

        } else if (figure.equals("circle")) {
            double radius = Double.parseDouble(scan.nextLine()) ;
            double result = Math.PI * radius * radius ;
            System.out.printf("%,.3f", result) ;

        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine()) ;
            double b = Double.parseDouble(scan.nextLine()) ;
            double result = a * b ;
            System.out.printf("%,.3f", result) ;

        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine()) ;
            double b = Double.parseDouble(scan.nextLine()) ;
            double result = a * b / 2 ;
            System.out.printf("%,.3f", result) ;
        }
    }
}
