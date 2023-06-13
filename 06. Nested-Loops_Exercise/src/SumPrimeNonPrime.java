import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        String command = scan.nextLine() ;

        int sumPrimeNumbers = 0 ;
        int sumNonPrimeNumbers = 0 ;

        while (!command.equals("stop")){
            int number = Integer.parseInt(command) ;
            if (number < 0){
                System.out.println("Number is negative.");
                command = scan.nextLine() ;
                continue ;
            }
            if (number == 1) {
                sumPrimeNumbers += number ;
                command = scan.nextLine() ;
                continue ;
            }
            boolean isNonPrime = false ;
            for (int i = 2 ; i < number ; i++){
                if (number % i == 0){
                    isNonPrime = true ;
                    break ;
                }
            }
            if (isNonPrime){
                sumNonPrimeNumbers += number ;
            } else {
                sumPrimeNumbers += number ;
            }

            command = scan.nextLine() ;
        }
        System.out.printf("Sum of all prime numbers is: %d %n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);
    }
}
