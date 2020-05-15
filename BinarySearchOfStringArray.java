/**
 *  Final Project
 *  This class is a binary search algorithm that efficiently searches a sorted list
 *  of type String for a specified value by reducing the search space by half each iteration.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
public class BinarySearchOfStringArray {

    //This method performs binary search on an Array of String to find a specified key
    public int binarySearch(String[] items, int low, int high, String key) {

        int midIndex;

        while (high >= low) { //Repeats until the whole array has been searched

            midIndex = (high + low) / 2;

            //If key is (alphabetically)larger than value at mid
            //search the right sublist
            if (items[midIndex].compareToIgnoreCase(key) < 0) {
                low = midIndex + 1;
            }
            //If key is (alphabetically)smaller than value at mid
            //search the left sublist
            else if (items[midIndex].compareToIgnoreCase(key) > 0) {
                high = midIndex - 1;
            }
            //If key is at middle
            //search is done
            else {
                return midIndex;
            }
        }
        return -1; //If key is not found

    }

    //This method outputs the key was found and at what index or the key was not found
    public void results(int keyIndex, String key) {

        if (keyIndex == -1) {
            System.out.print(key + " was not found.");
        } else {
            System.out.print("Found " + key + " at index " + keyIndex + ". Cost of " + key + ": $");
        }

    }

}


