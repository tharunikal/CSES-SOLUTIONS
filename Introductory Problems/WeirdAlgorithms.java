import java.util.Scanner;

public class WeirdAlgorithms {
    public static void algo(long x) {
        System.out.println(x + " ");
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = (x * 3) + 1;
            }
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        long a = inp.nextInt();
        algo(a);
        inp.close();
    }

}