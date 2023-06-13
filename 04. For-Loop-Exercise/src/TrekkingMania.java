import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int groupCount = Integer.parseInt(scan.nextLine()) ;

        double countOfAllParticipants = 0 ;

        double musalaCounter = 0 ;
        double monblanCounter = 0 ;
        double kilimandzharoCounter = 0 ;
        double k2Counter = 0 ;
        double everestCounter = 0 ;

        for (int i = 1 ; i <= groupCount ; i++) {
            int participantsInGroup = Integer.parseInt(scan.nextLine()) ;

            countOfAllParticipants += participantsInGroup ;

            if (participantsInGroup <= 5) {
                musalaCounter += participantsInGroup ;
            } else if (participantsInGroup >= 6 && participantsInGroup <= 12) {
                monblanCounter += participantsInGroup ;
            } else if (participantsInGroup >= 13 && participantsInGroup <= 25) {
                kilimandzharoCounter += participantsInGroup ;
            } else if (participantsInGroup >= 26 && participantsInGroup <= 40){
                k2Counter += participantsInGroup ;
            } else if (participantsInGroup >= 41){
                everestCounter += participantsInGroup ;
            }
        }
        double musalaGroupInPercent = musalaCounter / countOfAllParticipants * 100 ;
        double monblanGroupInPercent = monblanCounter / countOfAllParticipants * 100 ;
        double kilimandzharoGroupInPercent = kilimandzharoCounter / countOfAllParticipants * 100 ;
        double k2GroupInPercent = k2Counter / countOfAllParticipants * 100 ;
        double everestGroupInPercent = everestCounter / countOfAllParticipants * 100 ;

        System.out.printf("%.2f%% %n", musalaGroupInPercent);
        System.out.printf("%.2f%% %n", monblanGroupInPercent);
        System.out.printf("%.2f%% %n", kilimandzharoGroupInPercent);
        System.out.printf("%.2f%% %n", k2GroupInPercent);
        System.out.printf("%.2f%% %n", everestGroupInPercent);
    }
}
