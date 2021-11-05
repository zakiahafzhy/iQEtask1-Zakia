package part_A;

public class Problem5 {
    private static boolean primeNumber(int number) {
        int pembagi;
        for (pembagi = 2; pembagi < number; pembagi++) {
            if ((number % pembagi) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
    }
}
