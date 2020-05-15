/**
 *  Final Project
 *  This class runs a unit test for all the important methods of my shopping program.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
public class UnitTests {

    public static void main(String[] args) {

        addToItemsToBuyTest(); //Tests the add method of ItemsToBuy
        addToCostOfItemsTest(); //Tests the add method of CostOfItems
        removeItemsToBuyTest(); //Tests the remove method of ItemsToBuy
        removeCostOfItemsTest(); //Tests the remove method of CostOfItems
        getArrayItemsToBuyTest(); //Tests the getArray method of ItemsToBuy
        getArrayCostOfItemsTest(); //Tests the getArray method of CostOfItems
        getValueAtIndexItemsToBuyTest(); //Tests the getValueAtIndex method of ItemsToBuy
        getValueAtIndexCostOfItemsTest(); //Tests the getValueAtIndex method of CostOfItems
        partitionTest(); //Tests the partition method of QuickSortOfStringArray
        quickSortTest(); //Tests the quickSort method of QuickSortOfStringArray
        binarySearchTest(); //Tests the binarySearch method of BinarySearchOfStringArray

    }

    public static void addToItemsToBuyTest( ) {//Tests the add method of ItemsToBuy

        ItemsToBuy shoppingItems = new ItemsToBuy();
        shoppingItems.add("Banana");
        if(shoppingItems.getValueAtIndex(0).compareToIgnoreCase("Banana") != 0) {
            System.out.println("Failed to add Banana");
        }
        else{
            System.out.println("Banana was added successfully");
        }

    }
    public static void addToCostOfItemsTest( ) {//Tests the add method of CostOfItems

        CostOfItems prices = new CostOfItems();
        prices.add(.2);
        if(prices.getValueAtIndex(0) != .2) {
            System.out.println("Failed to add .2");
        }
        else{
            System.out.println(".2 was added successfully");
        }

    }
    public static void removeItemsToBuyTest( ) {//Tests the remove method of ItemsToBuy

        ItemsToBuy shoppingItems = new ItemsToBuy();
        shoppingItems.add("Banana"); //index 0 = Banana
        shoppingItems.remove("Banana"); //null
        shoppingItems.add("Apple"); //index 0 = Apple
        if(shoppingItems.getValueAtIndex(0).compareToIgnoreCase("Banana") == 0) {
            System.out.println("Failed to remove Banana");
        }
        else{
            System.out.println("Banana was removed successfully");
        }

    }
    public static void removeCostOfItemsTest( ) {//Tests the remove method of CostOfItems

        CostOfItems prices = new CostOfItems();
        prices.add(.2); //index 0 = .2
        prices.remove(.2); //null
        prices.add(.5); //index 0 = Apple
        if(prices.getValueAtIndex(0) == .2) {
            System.out.println("Failed to remove .2");
        }
        else{
            System.out.println(".2 was removed successfully");
        }

    }
    public static void getArrayItemsToBuyTest( ) {//Tests the getArray method of ItemsToBuy

        ItemsToBuy shoppingItems = new ItemsToBuy();
        shoppingItems.add("Banana");
        shoppingItems.add("Cereal");
        String[] array = shoppingItems.getArray();
        if((array[0].compareToIgnoreCase("Banana") == 0) && (array[1].compareToIgnoreCase("Cereal") == 0)) {
            System.out.println("ItemsToBuy's getArray method was successful");
        }
        else{
            System.out.println("ItemsToBuy's getArray method failed");
        }

    }
    public static void getArrayCostOfItemsTest( ) {//Tests the getArray method of CostOfItems

        CostOfItems prices = new CostOfItems();
        prices.add(.2);
        prices.add(1.0);
        Double[] array = prices.getArray();
        if((array[0] == .2) && (array[1] == 1.0)) {
            System.out.println("CostOfItems's getArray method was successful");
        }
        else{
            System.out.println("CostOfItems's getArray method failed");
        }

    }
    public static void getValueAtIndexItemsToBuyTest( ) {//Tests the getValueAtIndex method of ItemsToBuy

        ItemsToBuy shoppingItems = new ItemsToBuy();
        shoppingItems.add("Banana");
        shoppingItems.add("Cereal");
        if((shoppingItems.getValueAtIndex(0).compareToIgnoreCase("Banana") == 0) && (shoppingItems.getValueAtIndex(1).compareToIgnoreCase("Cereal") == 0)) {
            System.out.println("ItemsToBuy's getValueAtIndex method was successful");
        }
        else{
            System.out.println("ItemsToBuy's getValueAtIndex method failed");
        }

    }
    public static void getValueAtIndexCostOfItemsTest( ) {//Tests the getValueAtIndex method of CostOfItems

        CostOfItems prices = new CostOfItems();
        prices.add(.2);
        prices.add(1.0);
        if((prices.getValueAtIndex(0) == .2) && (prices.getValueAtIndex(1) == 1.0)) {
            System.out.println("CostOfItems's getValueAtIndex method was successful");
        }
        else{
            System.out.println("CostOfItems's getValueAtIndex method failed");
        }

    }
    public static void partitionTest( ) {//Tests the partition method of QuickSortOfStringArray

        QuickSortOfStringArray sortMe = new QuickSortOfStringArray();
        String[] array = {"Ben","John","Zayne", "Alf", "Mary", "Emily" };
        if(sortMe.partition(array, 0, array.length - 1) == 4) {
            System.out.println("QuickSortOfStringArray's partition method was successful");
        }
        else{
            System.out.println("QuickSortOfStringArray's partition method failed");
        }

    }

    public static void quickSortTest( ) {//Tests the quickSort method of QuickSortOfStringArray

        QuickSortOfStringArray sortMe = new QuickSortOfStringArray();
        String[] array = {"Ben", "Alf", "Mary", "Emily" };
        sortMe.quickSort(array, 0, array.length-1);
        if((array[0].compareTo("Alf") == 0) && (array[1].compareTo("Ben") == 0) && (array[2].compareTo("Emily") == 0) && (array[3].compareTo("Mary") == 0)         ) {
            System.out.println("QuickSortOfStringArray's quickSort method was successful");
        }
        else{
            System.out.println("QuickSortOfStringArray's quickSort method failed");
        }

    }
    public static void binarySearchTest( ) {//Tests the binarySearch method of BinarySearchOfStringArray

        QuickSortOfStringArray sortMe = new QuickSortOfStringArray();
        String[] array = {"Ben", "Alf", "Mary", "Emily" };
        //Sort the array first
        sortMe.quickSort(array, 0, array.length-1);
        String key = "Mary";
        int keyIndex = new BinarySearchOfStringArray().binarySearch(array,0,array.length - 1, key);
        if(keyIndex == 3) {
            System.out.println("BinarySearchOfStringArray's binarySearch method was successful");
        }
        else{
            System.out.println("BinarySearchOfStringArray's binarySearch method failed");
        }

    }

}
