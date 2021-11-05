package Soal4;

public class Ongkir {
    protected int panjang;
    protected int lebar;
    protected int tinggi;
    protected double berat;

    public Ongkir(int panjang, int lebar, int tinggi, double berat) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public double HitungHarga() {
        int volume = panjang * lebar * tinggi;
        if(volume > 50) {
            System.out.println("error berat");
            return 0;
        } else {
            return 5000 * berat;
        }

    }
}
