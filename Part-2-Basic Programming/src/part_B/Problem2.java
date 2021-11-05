package part_B;

import java.util.Scanner;

public class Problem2 {
    private static void playWithAsterik(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n-1; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        playWithAsterik(input.nextInt());
    }
}
