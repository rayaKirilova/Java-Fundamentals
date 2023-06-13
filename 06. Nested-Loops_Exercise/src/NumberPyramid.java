import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int number = Integer.parseInt(scan.nextLine()) ;

        int current = 1 ;
        boolean isBigger = false ;
        String printCurrentLine = "" ;

        for (int i = 1; i <= number; i++) {

            for (int j = 1 ; j <= i ; j++){
                if (current > number) {
                    isBigger = true ;
                    break ;
                }
                printCurrentLine += current + " " ;
                current ++ ;
            }
            System.out.println(printCurrentLine);
            printCurrentLine = "" ;

            if (isBigger){
                break ;
            }
        }
    }
}
