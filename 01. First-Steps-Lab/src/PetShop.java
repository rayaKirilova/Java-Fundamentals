import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int dogPackagesCount = Integer.parseInt(scan.nextLine()) ;
        int catPackagesCount = Integer.parseInt(scan.nextLine()) ;

        double priceForDogFood = dogPackagesCount * 2.50 ;
        double priceForCatFood = catPackagesCount * 4 ;

        double foodExpenses = priceForCatFood + priceForDogFood ;

        System.out.println(foodExpenses + " lv.");

    }
}
