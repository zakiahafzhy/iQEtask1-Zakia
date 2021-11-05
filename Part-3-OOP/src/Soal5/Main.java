package Soal5;

public class Main {
    public static void main (String[] args) {
        Animal animal1 = new Animal("Binatang");
        Herbivor herbivor1 = new Herbivor("Kambing");
        Carnivor carnivor1 = new Carnivor("Singa");
        Omnivor omnivor1 = new Omnivor("Ayam", "semua", "tajam and tumpul");

        System.out.println(animal1.identify_myself());
        System.out.println("");
        System.out.println(herbivor1.identify_myself());
        System.out.println(carnivor1.identify_myself());
        System.out.println(omnivor1.identify_myself());
    }
}
