import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {
            int counter = 0;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }
            if (counter == 1) {
                System.out.print(n + " ");
            }
        }
    }
}
