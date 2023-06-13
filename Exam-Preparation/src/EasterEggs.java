import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int firstPlayerEggs = Integer.parseInt(scan.nextLine());
        int secondPlayerEggs = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();

        while (!command.equalsIgnoreCase("End")) {

            if (command.equalsIgnoreCase("one")) {
                secondPlayerEggs--;
            } else if (command.equalsIgnoreCase("two")) {
                firstPlayerEggs--;
            }
            if (firstPlayerEggs == 0) {
                System.out.println(String.format("Player one is out of eggs. Player two has %s eggs left.", secondPlayerEggs));
                break;
            } else if (secondPlayerEggs == 0) {
                System.out.println(String.format("Player two is out of eggs. Player one has %s eggs left.", firstPlayerEggs));
                break;
            }
            command = scan.nextLine();
        }

        if (firstPlayerEggs != 0 && secondPlayerEggs != 0) {
            System.out.println(String.format("Player one has %s eggs left.", firstPlayerEggs));
            System.out.println(String.format("Player two has %s eggs left.", secondPlayerEggs));
        }
    }
}
