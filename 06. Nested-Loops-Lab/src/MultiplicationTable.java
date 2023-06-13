public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            for (int z = 1 ; z <= 10 ; z++){
                int result = i * z ;
                System.out.printf("%d * %d = %d %n", i, z, result);
            }
        }
    }
}
