/**
 *  Final Project
 *  This class is a sorting algorithm that repeatedly partitions an array of input into low and
 *  high parts (each part unsorted), and then recursively sorts each of those parts alphabetically.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
public class QuickSortOfStringArray {

    //This method divides the array into two parts
    public int partition(String[] shoppingList, int lowIndex, int highIndex) {

        int midIndex;
        String pivot; //Value used to divide the data into low and high parts
        String temp;
        boolean done = false;

        // Pick middle element as pivot
        midIndex = lowIndex + (highIndex - lowIndex) / 2;
        pivot = shoppingList[midIndex];

        while (!done) {

            // Increment lowIndex while shoppingList[lowIndex] < pivot
            while (shoppingList[lowIndex].compareToIgnoreCase(pivot) < 0) {
                ++lowIndex;
            }

            // Decrement highIndex while pivot < shoppingList[highIndex]
            while (pivot.compareToIgnoreCase(shoppingList[highIndex]) < 0) {
                --highIndex;
            }

            // If there are zero or one elements remaining,
            // all items are partitioned. Return highIndex
            if (lowIndex >= highIndex) {
                done = true;
            }
            else {
                // Swap shoppingList[lowIndex] and shoppingList[highIndex],
                // update lowIndex and highIndex
                temp = shoppingList[lowIndex];
                shoppingList[lowIndex] = shoppingList[highIndex];
                shoppingList[highIndex] = temp;

                ++lowIndex;
                --highIndex;
            }
        }
        return highIndex;

    }

    //This method recursively sorts partitions until the whole array is sorted alphabetically
    public void quickSort(String[] foodItems, int lowIndex, int highIndex) {

        int lowEndIndex;

        // Base case: If there are 1 or zero elements to sort,
        // partition is already sorted
        if (lowIndex >= highIndex) {
            return;
        }

        // Partition the data within the array. Value lowEndIndex returned
        // from partitioning is location of last element in low partition.
        lowEndIndex = partition(foodItems, lowIndex, highIndex);

        // Recursively sort low partition (lowIndex to lowEndIndex) and
        // high partition (lowEndIndex + 1 to highIndex)
        quickSort(foodItems, lowIndex, lowEndIndex);
        quickSort(foodItems, lowEndIndex + 1, highIndex);

    }

}
