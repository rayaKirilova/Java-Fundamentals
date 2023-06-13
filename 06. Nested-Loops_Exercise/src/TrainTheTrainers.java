import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        int n = Integer.parseInt(scan.nextLine()) ;

        String command = scan.nextLine() ;
        double sumGrades = 0 ;
        int counter = 0 ;

        while (!command.equals("Finish")) {
            String presentationName = command ;
            double sumTempGrades = 0 ;

            for (int i = 0 ; i < n ;i++){
                double grade = Double.parseDouble(scan.nextLine()) ;
                sumTempGrades += grade ;
            }

            double averageGradeForPresentation = sumTempGrades / n ;
            System.out.printf("%s - %.2f", presentationName, averageGradeForPresentation);
            counter ++ ;

            command = scan.nextLine() ;

        }
        double averageGrade = sumGrades / counter ;
        System.out.printf("Student's final assessment is %.2f", averageGrade);
    }
}
