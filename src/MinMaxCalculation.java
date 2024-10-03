import java.util.Arrays;

public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {23, 89, 12, 56, 99, 34};

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}