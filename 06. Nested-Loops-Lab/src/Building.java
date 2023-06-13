import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int floorsCount = Integer.parseInt(scan.nextLine());
        int roomsCount = Integer.parseInt(scan.nextLine());

        for (int i = floorsCount; i >= 1; i--) {
            String toPrint = "";
            for (int j = 0; j < roomsCount; j++) {

                if (i == floorsCount) {
                    toPrint += "L" + i + j + " ";
                } else if (i % 2 == 0) {
                    toPrint += "O"+ i + j + " ";
                } else {
                    toPrint += "A"+ i + j + " ";
                }
            }
            System.out.println(toPrint);
        }
    }
}