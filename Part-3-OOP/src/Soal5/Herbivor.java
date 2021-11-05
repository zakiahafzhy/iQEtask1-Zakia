package Soal5;

public class Herbivor extends Animal {
    public Herbivor(String namaBinatang) {
        super(namaBinatang, "tumbuhan", "tumpul");
    }

    public String identify_myself() {
        return "Hi! I'm Herbivore , My Name is " + this.namaBinatang +  ", My Food is '" + this.jenisMakanan + "', I have '" + this.gigi + "' teeth";
    }
}
