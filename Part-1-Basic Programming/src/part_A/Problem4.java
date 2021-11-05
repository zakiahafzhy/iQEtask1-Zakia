package part_A;

import java.util.Scanner;

public class Problem4 {
    public static void main (String[] args) {
        int bilangan;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        bilangan = input.nextInt();

        System.out.println("Output :");
        for (int i = bilangan; i > 0; i--) {
            if (bilangan % i == 0) {
                System.out.print(i + "\n");
            }
        }
    }
}
