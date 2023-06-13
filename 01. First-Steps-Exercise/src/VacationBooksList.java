import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int pagesCountCurrentBook = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int daysCount = Integer.parseInt(scan.nextLine());

        int hours = pagesCountCurrentBook / pagesPerHour / daysCount ;

        System.out.println(hours);

    }
}
