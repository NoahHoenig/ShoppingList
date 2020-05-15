/**
 *  Final Project
 *  This class runs a shopping program. First you create a linked list of ItemsToBuy and a linked list of CostOfItems.
 *  You then add an item to your list and a price that will correspond with that item. You repeat this process
 *  until you have a list full of items. You can remove an item from the list as well. The program will show you the
 *  shopping list you gave created and then create an alphabetically sorted list of the same items. You will then be
 *  prompted to type on your keyboard an item to find within in your shopping list. The program will tell you where in
 *  your sorted list the item was found and the cost of that item. If the item you search for is not found the correct message
 *  will be displayed.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {

        //MAKE A SHOPPING LIST AND PRICE LIST AND SORT IT ALPHABETICALLY

        ItemsToBuy shoppingItems = new ItemsToBuy(); //Creates a LinkedList of ItemsToBuy
        CostOfItems prices = new CostOfItems(); //Creates a LinkedList of CostOfItem

        //Add item to the linked list and add a price to each item. Ex: first item would be banana with a price of $0.2
        //These values can be changed and you can also add more items or remove an item too.
        shoppingItems.add("banana");
        prices.add(.2);
        shoppingItems.add("apple");
        prices.add(.5);
        shoppingItems.add("Cereal");
        prices.add(2.0);
        shoppingItems.add("watermelon");
        prices.add(2.5);
        shoppingItems.add("apple pie");
        prices.add(1.5);
        shoppingItems.add("juice");
        prices.add(2.5);

        shoppingItems.remove("juice");

        //Outputs all the items in (list) shoppingItems and all the prices for each item in (list) prices
        System.out.println();
        System.out.print("UNSORTED List:  { ");
        int i = 0;
        for( String item : shoppingItems.getArray() ) { //ITERATOR
            System.out.print(item + " $" + prices.getValueAtIndex(i)+ ", ");
            i++;
        }
        System.out.println("}");

        //Creates an array of the (list) shoppingItems that will eventually be sorted
        String[] sortArray = shoppingItems.getArray();
        //Creates an array of the (list) shoppingItems that will eventually be compared to the sorted array
        String[] oldArray = shoppingItems.getArray();

        //Calls quickSort on sortArray. The array will be sorted alphabetically
        new QuickSortOfStringArray().quickSort(sortArray, 0, sortArray.length - 1);

        //Outputs each item of the new array with the correct price next to it.  In a way the price is sorted to match its item
        System.out.print("SORTED List:  { ");
        for(String item : sortArray) { //ITERATOR. Outputs each item in alphabetical sorted order
            System.out.print(item.toLowerCase() + " $");
            for(int j = 0; j < oldArray.length; j++) {    //Outputs the price of an item by looking at the oldArray
                if (item.compareToIgnoreCase(oldArray[j]) == 0) {
                    System.out.print(prices.getValueAtIndex(j) + ", ");
                }
            }
        }
        System.out.println("}");

        //NOW SEARCH FOR AN ITEM VIA KEYBOARD

        Scanner scnr = new Scanner(System.in);
        String key;
        int keyIndex;

        System.out.println();

        System.out.print("Enter an item to find: ");
        key = scnr.nextLine();               //Gets input specified by user using keyboard
        System.out.println();

        //Calls binary search on the sorted array to find the key and stores the result as an index.
        keyIndex = new BinarySearchOfStringArray().binarySearch(sortArray,0,sortArray.length - 1, key);
        //Outputs the results of the binary search
        new BinarySearchOfStringArray().results(keyIndex, key);

        //Outputs the cost of the item that was searched for. No cost outputted if item is not found
        for(int x = 0; x < oldArray.length; x++) {
            if(oldArray[x].compareToIgnoreCase(key) == 0) {
                System.out.print(prices.getValueAtIndex(x));
            }
        }
        System.out.println();

    }

}
