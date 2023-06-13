import java.util.Scanner;

public class PetFood {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int daysCount = Integer.parseInt(scan.nextLine()) ;
        double foodQuantity = Double.parseDouble(scan.nextLine()) ;

        double totalQuantityDogFood = 0 ;
        double totalQuantityCatFood = 0 ;
        double biscuits = 0 ;

        for (int i = 1 ; i <= daysCount ; i++){
            int dogFood = Integer.parseInt(scan.nextLine()) ;
            int catFood = Integer.parseInt(scan.nextLine()) ;

            totalQuantityDogFood += dogFood ;
            totalQuantityCatFood += catFood ;

            if (i % 3 == 0){
                biscuits = Math.round((dogFood + catFood) * 0.1) ;
            }
        }
        double percentEatenFood = (totalQuantityCatFood + totalQuantityDogFood) / foodQuantity * 100 ;
        double percentEatenDogFood = totalQuantityDogFood / (totalQuantityCatFood + totalQuantityDogFood) * 100 ;
        double percentEatenCatFood = totalQuantityCatFood / (totalQuantityCatFood + totalQuantityDogFood) * 100 ;

        System.out.println(String.format("Total eaten biscuits: %.0fgr.", biscuits));
        System.out.println(String.format("%.2f%% of the food has been eaten.", percentEatenFood));
        System.out.println(String.format("%.2f%% eaten from the dog.", percentEatenDogFood));
        System.out.println(String.format("%.2f%% eaten from the cat.", percentEatenCatFood));
    }
}
