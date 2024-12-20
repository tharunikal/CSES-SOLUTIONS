import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();
        int xor = 0;
        for (int i = 1; i <= x; i++) {
            xor ^= i;
        }
        for (int i = 1; i <= x - 1; i++) {
            int y = inp.nextInt();
            xor ^= y;
        }
        System.out.println(xor);
        inp.close();
    }
}
