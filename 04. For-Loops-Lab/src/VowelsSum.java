import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        String text = scan.nextLine() ;

        int sum = 0 ;

        for (int i = 0; i < text.length() ; i++) {
            char letter = text.charAt(i);
            String vowel = String.valueOf(letter);

            if (vowel.equals("a")){
                sum += 1;
            } else if (vowel.equals("e")){
                sum += 2 ;
            } else if (vowel.equals("i")) {
                sum += 3 ;
            } else if (vowel.equals("o")){
                sum += 4 ;
            } else if (vowel.equals("u")) {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
