public class BigO {
    // O(n)
    public static void printLinear(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(n+n) -> O(2n) -> O(n): remove the constant.
    public static void printTwice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // Important interview question: O(a+b)
    public static void printAPlusB(int a, int b) {
        // O(a)
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        // O(b)
        for (int i = 0; i < b; i++) {
            System.out.println(i);
        }
    }

    // O(n*n) -> O(n^2)
    public static void printPairs(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // O(n^2 + n): drop the non-dominant term, so it is O(n^2).
    public static void printPairsAndNumbers(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // O(1)
    public static void printConstant(int n) {
        System.out.println(n + n);
        System.out.println(n + n + n);
    }

    // O(log n)
    // [1, 2, 3, 4, 5, 6, 7, 8] is divided into 2 parts each time.
    // The number of divisions needed to reach 1 is O(log n).
    public static void countLogarithm(int n) {
        int count = 0;
        while (n > 1) {
            n = n / 2;
            count++;
        }
        System.out.println("Number of divisions: " + count);
    }

    // ArrayList add/remove at the end is O(1).
    // At another index it is O(n) because the items must be reindexed.

    public static void main(String[] args) {
        int n = 4;

        printLinear(n);
        printTwice(n);
        printAPlusB(n, n);
        printPairs(n);
        printPairsAndNumbers(n);
        printConstant(n);
        countLogarithm(n);
    }
}