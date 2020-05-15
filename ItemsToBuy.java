/**
 *  Final Project
 *  This class represents a shopping list of items.
 *  It derives class ListMaker to make a linked list of type String and
 * instantiates getArray method to return a String array. It also implements FindValue
 * interface and instantiates getValueAtIndex method to return a String.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
public class ItemsToBuy extends ListMaker<String> implements FindValue<String>  {

    public ItemsToBuy() { super(); }

    @Override //This method converts linked list to an Array of type String
    String[] getArray() {
        String[] items = new String[listObj.size()];
        return listObj.toArray(items);
    }

    @Override //This method returns a value of linked list at a specified index
    public String getValueAtIndex(int index) { return listObj.get(index); }

}
