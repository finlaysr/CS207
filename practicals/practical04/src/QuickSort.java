import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  // Main quicksort method (single argument)
  public static void quicksort(int[] array) {

  }

  // Overloaded quicksort method with start and end indices
  private static void quicksort(int[] array, int start, int end) {

  }

  // Partition method
  private static int partition(int[] array, int start, int end) {

  }

  // For use in Task iii. Comment this out initially while completing Task ii.
  public static int selectARandomNumIn(int start, int end) {
    Random random = new Random();
    return random.nextInt(end - start + 1) + start;
  }

  // For use in Task iii. Comment this out initially while completing Task ii.
  private static int randomisedPartition(int[] array, int start, int end) {

  }

  // Helper method: Swap elements in the array
  private static void swap(int[] array, int i, int j) {

  }

  // Main method to create and sort an array
  public static void main(String[] args) {
    int[] array = new int[200];
    Random rand = new Random();

    // Fill the array with random values
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(1000); // Random integers between 0 and 999
    }

    // Display array before sorting
    System.out.println("Array before sorting:");
    System.out.println(Arrays.toString(array));

    // Sort the array using quicksort
    quicksort(array);

    // Display array after sorting
    System.out.println("Array after sorting:");
    System.out.println(Arrays.toString(array));
  }
}
