package part_B;

import java.util.Scanner;

public class Problem1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int x = input.nextInt();
        System.out.print("n = ");
        int n = input.nextInt();

        int hasil = (int) Math.pow(x, n);
        System.out.println("Hasil = " + hasil);
    }
}
