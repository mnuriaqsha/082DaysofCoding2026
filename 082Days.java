import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int n = hi.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
