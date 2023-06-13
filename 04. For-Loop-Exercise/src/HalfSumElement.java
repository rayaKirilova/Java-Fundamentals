import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;

        int max = Integer.MIN_VALUE ;
        int sum = 0 ;

        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(scan.nextLine()) ;
            if (max < number) {
                max = number ;
            }
            sum += number ;
        }
        sum = sum - max ;
        if (sum == max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            int diff = Math.abs(sum - max) ;
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
