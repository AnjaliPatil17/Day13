
    public class FindMaximum<T extends Comparable<T>> {
        private T var1;
        private T var2;
        private T var3;

        // Parameterized constructor
        public FindMaximum(T var1, T var2, T var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }

        // Method to find the maximum among the three variables
        public T testMaximum() {
            return FindMaximum.testMaximum(var1, var2, var3);
        }

        // Static method to find the maximum among three values
        public static <T extends Comparable<T>> T testMaximum(T var1, T var2, T var3) {
            T max = var1;
            if (var2.compareTo(max) > 0) {
                max = var2;
            }
            if (var3.compareTo(max) > 0) {
                max = var3;
            }
            return max;
        }

        // New test case to use the Generic Clas
        public static void main(String[] args) {

            FindMaximum<Integer> intMaxFinder = new FindMaximum<>(3, 5, 1);
            System.out.println("Maximum Integer: " + intMaxFinder.testMaximum());

            FindMaximum<Float> floatMaxFinder = new FindMaximum<>(6.6f, 8.8f, 7.7f);
            System.out.println("Maximum Float: " + floatMaxFinder.testMaximum());

            FindMaximum<String> stringMaxFinder = new FindMaximum<>("apple", "banana", "cherry");
            System.out.println("Maximum String: " + stringMaxFinder.testMaximum());
        }
    }
