package Soal5;

public class Omnivor extends Animal {
    public Omnivor(String namaBinatang, String jenisMakanan, String gigi) {
        super(namaBinatang, jenisMakanan, gigi);
    }

    public String identify_myself() {
        return "Hi! I'm Omnivore , My Name is " + this.namaBinatang +  ", My Food is '" + this.jenisMakanan + "', I have '" + this.gigi + "' teeth";
    }
}
