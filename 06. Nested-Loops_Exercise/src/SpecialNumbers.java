import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;
        String print = "" ;

        for (int i = 1 ; i <= 9 ; i++){
            for (int x = 1 ; x <=9 ; x++){
                for (int y = 1 ; y <= 9 ; y++){
                    for (int z = 1 ; z <= 9 ; z++){
                        if (n % i == 0 &&
                                n % x == 0 &&
                                n % y == 0 &&
                                n % z == 0){
                            print += "" + i + x + y + z + " " ;
                        }
                    }
                }
            }
        }
        System.out.println(print);
    }
}
