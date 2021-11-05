package Soal5;

public class Animal {
    protected String namaBinatang;
    protected String jenisMakanan;
    protected String gigi;

    public Animal(String namaBinatang, String jenisMakanan, String gigi) {
        this.namaBinatang = namaBinatang;
        this.jenisMakanan = jenisMakanan;
        this.gigi = gigi;
    }

    public Animal(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public String identify_myself() {
        return "Hi! I'm Parent of All animal, My Name is " + this.namaBinatang;
    }
}
