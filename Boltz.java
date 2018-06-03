package boltz;

import java.util.Scanner;

public class Boltz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        while (true) {
            int a = sc.nextInt();
            if (verificaJoc(a,m) == a) {
                System.out.print("Boltz");
                break;
                }

            rulareJoc(a);
        }
    }


    public static void rulareJoc(int m) {
        int i = 0;
        for (; i <= m; i++) {
        }
        System.out.println(i);
    }


    public static int verificaJoc(int sum, int m) {
        sum = 0;
        for (int i = 0; i <= m; i++) {
            sum = sum + 7;
        }
        return sum;
    }
}
