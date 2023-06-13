import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int number = Integer.parseInt(scan.nextLine()) ;
        int counter = 0 ;

        for (int i = 0 ; i <= number ; i++){
            for (int z = 0 ; z <= number ; z++){
                for (int y = 0 ; y <= number ; y++){

                    if (i + y + z == number){
                        counter ++ ;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
