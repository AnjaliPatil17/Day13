import java.util.Arrays;

public class FindMaximum<T extends Comparable<T>> {
    private T[] elements;

    public FindMaximum(T... elements) {
        this.elements = elements;
    }

    public T testMaximum() {
        return FindMaximum.testMaximum(elements);
    }

    public static <T extends Comparable<T>> T testMaximum(T... elements) {
        Arrays.sort(elements);
        return elements[elements.length - 1];
    }

    public static void main(String[] args) {

        FindMaximum<Integer> intMaxFinder = new FindMaximum<>(3, 5, 1, 10, 7);
        System.out.println("Maximum Integer: " + intMaxFinder.testMaximum());

        FindMaximum<Float> floatMaxFinder = new FindMaximum<>(6.6f, 8.8f, 7.7f, 9.9f, 5.5f,6.7f);
        System.out.println("Maximum Float: " + floatMaxFinder.testMaximum());

        FindMaximum<String> stringMaxFinder = new FindMaximum<>("apple", "banana", "cherry", "date", "elderberry");
        System.out.println("Maximum String: " + stringMaxFinder.testMaximum());
    }
}
