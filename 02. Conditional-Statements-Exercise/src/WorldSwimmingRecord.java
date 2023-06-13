import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        double record = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double timeInSeconds = Double.parseDouble(scan.nextLine());

        double distanceInMetres = distance * timeInSeconds ;
        double resistance = Math.floor(distance / 15) * 12.5 ;

        double timeToCompare = distanceInMetres + resistance ;

        if (timeToCompare >= record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeToCompare - record);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds", timeToCompare);
        }
    }
}
