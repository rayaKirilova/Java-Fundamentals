import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int hours = Integer.parseInt(scan.nextLine()) ;
        int minutes = Integer.parseInt(scan.nextLine()) + 15 ;

        if (minutes >= 60) {
            hours++;
            minutes = minutes - 60;
        }

        if (hours >= 24) {
            hours = hours - 24;
        }

        if (minutes < 10) {
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
