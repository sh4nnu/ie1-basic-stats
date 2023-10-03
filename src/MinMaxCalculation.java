import java.util.ArrayList;

//Controller for MinMaxCalculation given a set of numbers.

public class MinMaxCalculation {

    private ArrayList<Integer> numbers;

    /**
     * Constructor to initialize the MinMaxCalculation with an ArrayList of numbers.
     *
     * @param numbers The ArrayList of numbers.
     */
    public MinMaxCalculation(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    /**
     * Finds the minimum value in the given list of numbers.
     *
     * @return The minimum value in the ArrayList.
     */
    public int findMin() {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty. Cannot find minimum.");
        }

        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int current = numbers.get(i);
            if (current < min) {
                min = current;
            }
        }

        return min;
    }

}