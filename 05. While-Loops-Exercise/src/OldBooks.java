import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        String bookName = scan.nextLine() ;
        boolean bookIsFound = false;
        int bookCounter = 0 ;
        String input = scan.nextLine() ;

        while (!input.equals("No More Books")) {
            if (input.equals(bookName)){
                bookIsFound = true;
                break;
            }
            bookCounter ++ ;
            input = scan.nextLine() ;
        }

        if (bookIsFound) {
            System.out.printf("You checked %d books and found it. %n", bookCounter);

        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books. %n", bookCounter);
        }
    }
}
