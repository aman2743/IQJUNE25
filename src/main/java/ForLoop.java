public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // 5 rows
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
