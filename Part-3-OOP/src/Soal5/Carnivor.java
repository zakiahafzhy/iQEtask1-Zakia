package Soal5;

public class Carnivor extends Animal {
    public Carnivor(String namaBinatang) {
        super(namaBinatang, "daging", "tajam");
    }

    public String identify_myself() {
        return "Hi! I'm Carnivore , My Name is " + this.namaBinatang +  ", My Food is '" + this.jenisMakanan + "', I have '" + this.gigi + "' teeth";
    }
}
