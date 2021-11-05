package part_B;

import java.util.Scanner;

public class Problem3 {
    private static void drawXYZ(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                num += 1;
                if (num % 3 == 0) {
                    System.out.print("X");
                } else if (num % 2 == 0) {
                    System.out.print("Z");
                } else {
                    System.out.print("Y");
                }
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        drawXYZ(input.nextInt());
    }
}
