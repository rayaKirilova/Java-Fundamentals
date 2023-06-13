import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int length = Integer.parseInt(scan.nextLine()) ;
        int width = Integer.parseInt(scan.nextLine()) ;

        int piecesCount = length * width ;
        int piecesForGuests = 0 ;
        boolean noMoreCakeLeft = false ;

        String command = scan.nextLine() ;

        while (!command.equals("STOP")) {

            int pieceCake = Integer.parseInt(command) ;
            piecesForGuests += pieceCake ;

            if (piecesForGuests > piecesCount) {
                noMoreCakeLeft = true ;
                int diff = piecesForGuests - piecesCount ;
                System.out.printf("No more cake left! You need %d pieces more.", diff);
                break ;
            }
            command = scan.nextLine() ;
        }
        if (noMoreCakeLeft == false){
            int diff = piecesCount - piecesForGuests ;
            System.out.printf("%d pieces are left.", diff);
        }
    }
}

