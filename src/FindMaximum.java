public class FindMaximum {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        T max = array[0]; // Assume the first element is the maximum
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element; // Update max if current element is greater
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {3, 5, 1, 4, 2};
        System.out.println("Maximum in Integer array: " + findMax(intArray));

        // Example with Double array
        Double[] doubleArray = {2.3, 5.6, 1.2, 4.8};
        System.out.println("Maximum in Double array: " + findMax(doubleArray));

        // Example with String array
        String[] stringArray = {"apple", "orange", "banana", "grape"};
        System.out.println("Maximum in String array: " + findMax(stringArray));
    }
}