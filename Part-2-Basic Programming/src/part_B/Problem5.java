package part_B;

import java.util.ArrayList;

public class Problem5 {
    private static String ubahHuruf(String s) {
        ArrayList<Character> arr = new ArrayList<>();
        for (char i = 'A'; i <= 'Z'; i++) {
            arr.add(i);
        }
        String[] splitSpace = s.toUpperCase().trim().split(" ");

        StringBuilder encrypt = new StringBuilder();
        for (String value : splitSpace) {
            char[] keHuruf = value.toCharArray();
            for (char cekHuruf : keHuruf) {
                for (int j = 0; j <= 25; j++) {
                    if (cekHuruf == arr.get(j)) {
                        j += 10;
                        if (j > 26) {
                            j -= 26;
                        }
                        cekHuruf = arr.get(j);
                        encrypt.append(cekHuruf);
                    }
                }
            }
            encrypt.append(" ");
        }
        return encrypt.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}
