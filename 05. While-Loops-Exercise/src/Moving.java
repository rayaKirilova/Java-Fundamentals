import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int width = Integer.parseInt(scan.nextLine()) ;
        int length = Integer.parseInt(scan.nextLine()) ;
        int height = Integer.parseInt(scan.nextLine()) ;

        int cubicMetresAvailable = width * length * height ;
        int allBoxes = 0 ;

        boolean noMoreFreeSpace = false ;

        String command = scan.nextLine() ;
        while (!command.equals("Done")) {

            int boxesSize = Integer.parseInt(command) ;
            allBoxes += boxesSize ;

            if (cubicMetresAvailable < allBoxes){
                noMoreFreeSpace = true ;
                int diff = allBoxes - cubicMetresAvailable ;
                System.out.printf("No more free space! You need %d Cubic meters more.", diff);
                break ;
            }
            command = scan.nextLine() ;
        }

        if (noMoreFreeSpace == false){
            int diff = cubicMetresAvailable - allBoxes ;
            System.out.printf("%d Cubic meters left.", diff) ;
        }
    }
}
