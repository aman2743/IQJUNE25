package jumpStatement;

public class ContinueStatement1 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            for (int j = i; j < 10; j++) {
                if (j == 4) {
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
