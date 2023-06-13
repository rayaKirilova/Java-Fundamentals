import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tournamentCount = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());

        double winsCounter = 0;
        int winPoints = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String tournamentStage = scan.nextLine();

            if (tournamentStage.equals("W")) {
                winsCounter++;
                winPoints += 2000;
            } else if (tournamentStage.equals("SF")) {
                winPoints += 720;
            } else if (tournamentStage.equals("F")) {
                winPoints += 1200;
            }
        }

        double averagePoints = (winPoints) / tournamentCount;
        double percentWons = winsCounter / tournamentCount * 100;

        System.out.printf("Final points: %d %n", startPoints + winPoints);
        System.out.printf("Average points: %.0f %n", Math.floor(averagePoints));
        System.out.printf("%.2f%% %n", percentWons);
    }
}
