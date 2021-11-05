package Soal1;

public class HitungLuasKeliling {

    //Luas dan Keliling Persegi
    public static int LuasPersegi (int sisi) {
        int luas = sisi * sisi ;
        return luas;
    }
    public static int KelilingPersegi (int sisi) {
        int keliling = 4 * sisi ;
        return keliling;
    }
    //Luas dan Keliling Segitiga
    public static int LuasSegitiga (int alas, int tinggi) {
        int luas = (alas * tinggi) / 2 ;
        return luas;
    }
    public static int KelilingSegitiga (int sisi_a, int sisi_b, int sisi_c) {
        int keliling = sisi_a + sisi_b + sisi_c;
        return keliling;
    }
    //Luas dan Keliling Persegi Panjang
    public static int LuasPersegipanjang (int panjang, int lebar) {
        int luas = panjang * lebar ;
        return luas;
    }
    public static int KelilingPersegipanjang (int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
