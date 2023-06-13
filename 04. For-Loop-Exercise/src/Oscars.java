import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        String actor = scan.nextLine() ;
        double actorPoints = Double.parseDouble(scan.nextLine()) ;
        int counter = Integer.parseInt(scan.nextLine()) ;

        for (int z = 1; z <= counter ; z++) {
            String nameJuryActor = scan.nextLine() ;
            double points = Double.parseDouble(scan.nextLine()) ;

            int nameLength = nameJuryActor.length() ;

            actorPoints += ((nameLength * points) / 2);

            if (actorPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, actorPoints);
                break ;
            }
        }
        if (actorPoints < 1250.5) {
            double diff = 1250.5 - actorPoints ;
            System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
        }
    }
}
