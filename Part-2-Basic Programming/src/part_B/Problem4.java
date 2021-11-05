package part_B;

import java.util.Scanner;

public class Problem4 {
    private static void cetakTabelPerkalian(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" " + i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        cetakTabelPerkalian(input.nextInt());
    }
}
