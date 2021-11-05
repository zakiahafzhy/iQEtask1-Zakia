package Soal2;

public class HitungVolume {
    public static int VolumeKubus (int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static int VolumeBalok (int panjang, int lebar, int tinggi) {
        int volume = panjang * lebar * tinggi;
        return volume;
    }
    public static double VolumeTabung (double r, double tinggi) {
        double phi = 3.14;
        double luas_alas = phi * r * r;
        double volume = luas_alas * tinggi;
        return volume;
    }
}
