import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String studentName = scan.nextLine();
        double sum = 0;
        boolean isGraduated = true;

        for (int i = 1; i <= 12; i++) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade >= 4.00) {
                sum += grade;
            } else if (grade < 4.00) {
                isGraduated = false;
                System.out.printf("%s has been excluded at %d grade %n", studentName, i);
                break;
            }
        }

            if (isGraduated) {
                double average = sum / 12;
                System.out.printf("%s graduated. Average grade: %.2f", studentName, average);
            }
        }
    }
