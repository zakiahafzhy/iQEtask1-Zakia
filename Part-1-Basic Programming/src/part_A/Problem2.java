package part_A;

import java.util.Scanner;

public class Problem2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka nilai : ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Masukan tidak valid");
        } else {
            if (score >= 80) {
                System.out.println("Nilai : A");
            } else if (score >= 65 && score <= 79) {
                System.out.println("Nilai : B+");
            } else if (score >= 50 && score <= 64) {
                System.out.println("Nilai : B");
            } else if (score >= 35 && score <= 49) {
                System.out.println("Nilai : C");
            } else if (score >= 0 && score <= 34) {
                System.out.println("Nilai : D");
            }
        }
    }
}
