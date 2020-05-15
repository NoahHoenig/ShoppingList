# ShoppingList
Author: Noah Hoenig, Red ID: 824412349, Date: 05-14-20

Description:  I made a shopping program. It utilizes Linked List to create two different lists.  One list is an items list and the other is a price list.  Certain values have already been added to both lists but these can easily be altered by going into the Shopping file.  The idea is that each item has a corresponding price.  For example a banana might cost $0.2. The program will output the shopping list with each item and its corresponding price (EX: {banana $0.2, apple $0.5, Cereal $2.0} ).  Then the program will output an alphabetically sorted list of the same items with the correct prices for each item still corresponding (EX: {apple $0.5, banana $0.2, cereal $2.0} ).  The program then promts the user to type on your keyboard an item to find within the shopping list.  The program will tell you where in the sorted shopping list the item was found and the cost of that item. If the item you search for is not found the correct message will be displayed.

* Shopping.java : This is the application file that runs the shopping list program. (Contains ENHANCED FOR LOOPS). Detailed explanation of process in file. 
* UnitTests.java : Runs a UNIT TEST for all the important methods of my shopping program.
* ListMaker.java : This ABSTRACT class lays out the groundwork for creating a LINKED LIST of type GENERIC. It holds methods add, remove, and defines an abstract method called getArray.
* FindValue.java : This INTERFACE defines a method called getValueAtIndex of type GENERIC
* ItemsToBuy.java : This class represents a shopping list of items.
* CostOfItems.java : This class represents the prices of items in a shopping list.
* QuickSortOfStringArray.java : This class is a sorting algorithm that repeatedly partitions an array of input into low and high parts (each part unsorted), and then RECURSIVELY sorts each of those parts alphabetically.
* BinarySearchOfStringArray.java : This class is a binary search algorithm that efficiently searches a sorted list of type String for a specified value by reducing the search space by half each iteration.

