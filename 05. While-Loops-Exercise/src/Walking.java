import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int targetSteps = 10000 ;

        int reachedSteps = 0 ;
        String command = scan.nextLine() ;

        while(!command.equals("Going home")){
            int currentSteps = Integer.parseInt(command) ;
            reachedSteps += currentSteps ;

            if(reachedSteps >= targetSteps){
                break ;
            }
            command = scan.nextLine() ;
        }

        if (command.equals("Going home")) {
            int homeSteps = Integer.parseInt(scan.nextLine()) ;
            reachedSteps += homeSteps ;
        }
        int diff = Math.abs(reachedSteps - targetSteps) ;
        if (reachedSteps >= targetSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal! %n", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
