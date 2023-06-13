import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int firstNum = Integer.parseInt(scan.nextLine()) ;
        int secondNum = Integer.parseInt(scan.nextLine()) ;
        int magicNum = Integer.parseInt(scan.nextLine()) ;

        int counter = 0;
        boolean isFound = false;

        for (int i = firstNum; i <= secondNum; i++) {
            for (int z = firstNum; z <= secondNum; z++) {
                counter++;
                if (i + z == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d) %n", counter, i, z, magicNum);
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
