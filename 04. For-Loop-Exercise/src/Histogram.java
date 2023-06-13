import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;
        double p1Counter = 0 ;
        double p2Counter = 0 ;
        double p3Counter = 0 ;
        double p4Counter = 0 ;
        double p5Counter = 0 ;

        for (int i = 1 ; i <= n ; i++) {
            int number = Integer.parseInt(scan.nextLine()) ; 

            if (number < 200) {
                p1Counter ++ ;
            } else if (number >= 200 && number <= 399) {
                p2Counter ++ ;
            } else if (number >= 400 && number <= 599) {
                p3Counter ++ ;
            } else if (number >= 600 && number <= 799) {
                p4Counter ++ ;
            } else if (number >= 800 && number <= 1000) {
                p5Counter ++ ;
            }
        }
        double p1 = p1Counter / n * 100 ;
        double p2 = p2Counter / n * 100 ;
        double p3 = p3Counter / n * 100 ;
        double p4 = p4Counter / n * 100 ;
        double p5 = p5Counter / n * 100 ;

        System.out.printf("%.2f%% %n", p1) ;
        System.out.printf("%.2f%% %n", p2) ;
        System.out.printf("%.2f%% %n", p3) ;
        System.out.printf("%.2f%% %n", p4) ;
        System.out.printf("%.2f%% %n", p5) ;
    }
}
