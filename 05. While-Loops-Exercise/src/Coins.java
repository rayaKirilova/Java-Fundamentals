import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        double change = Double.parseDouble(scan.nextLine()) ;
        double coins = Math.floor(change * 100) ;
        int coinsCounter = 0 ;

        while (coins > 0) {
            coinsCounter ++ ;

            if (coins >= 200){
                coins -= 200 ;
            } else if (coins >= 100){
                coins -= 100 ;
            } else if (coins >= 50) {
                coins -= 50 ;
            } else if (coins >= 20) {
                coins -= 20 ;
            } else if (coins >= 10){
                coins -= 10 ;
            } else if (coins >= 5){
                coins -= 5 ;
            } else if (coins >= 2){
                coins -= 2 ;
            } else {
                coins -= 1 ;
            }
        }
        System.out.println(coinsCounter);
    }
}
