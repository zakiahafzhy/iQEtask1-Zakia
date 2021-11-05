package Soal1;

public class Main extends HitungLuasKeliling {

    public static void main (String[] args) {
        System.out.println("--------- Output Luas ---------");
        System.out.println("Luas persegi = " + LuasPersegi(4));
        System.out.println("Luas segitiga = " + LuasSegitiga(3,4));
        System.out.println("Luas persegi panjang = " + LuasPersegipanjang(7,8));
        System.out.println("");
        System.out.println("------- Output Keliling -------");
        System.out.println("Keliling persegi = " + KelilingPersegi(4));
        System.out.println("Keliling segitiga = " + KelilingSegitiga(3,4,5));
        System.out.println("Keliling persegi panjang = " + KelilingPersegipanjang(7,8));
    }
}
