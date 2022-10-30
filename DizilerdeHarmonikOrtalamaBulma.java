public class DizilerdeHarmonikOrtalamaBulma {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        double sum = 0;
        double harmonikavarage = 0.0;
        double harmonikNumbers;

        for (int i : numbers) {
            harmonikNumbers = 1.0 / i;
            sum += harmonikNumbers;
            harmonikavarage = numbers.length / sum;

        }
        System.out.println(harmonikavarage);

    }
}
