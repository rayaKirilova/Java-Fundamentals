import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        int length = Integer.parseInt(scan.nextLine()) ;
        int width = Integer.parseInt(scan.nextLine()) ;
        int height = Integer.parseInt(scan.nextLine()) ;
        double percent = Double.parseDouble(scan.nextLine()) ;

        int tankVolume = length * width * height ;
        double volumeInLitres = tankVolume * 0.001 ;
        double neededLitres = volumeInLitres * (1 - percent / 100) ;

        System.out.println(neededLitres);
    }
}
