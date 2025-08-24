// Logic: Find Min & Max in Array
// - Initialize largest = -∞, smallest = +∞.
// - Traverse array once.
// - Update largest if element > largest.
// - Update smallest if element < smallest.
// - Final values are min and max → O(n).

public class MinMaxInArray {
    // Trick: track largest & smallest while traversing once. O(n), O(1).
    public static void getLargestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n > largest) largest = n;      // update max
            if (n < smallest) smallest = n;    // update min
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }

    public static void main(String[] args) {
        int[] arr = {97, 98, 99, 100};
        getLargestAndSmallest(arr); // Largest=100, Smallest=97
    }
}
