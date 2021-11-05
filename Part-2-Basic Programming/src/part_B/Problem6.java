package part_B;

public class Problem6 {
    private static float Mean(float[] numbers) {
        float jumlah = 0;
        for (int i = 0; i < numbers.length; i++) {
            jumlah += numbers[i];
        }
        return jumlah / numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4, 5};
        System.out.println(Mean(value));
    }
}
