/**
 *  Final Project
 *  This class represents the prices of items in a shopping list.
 *  It derives class ListMaker to make a linked list of type Double and
 * instantiates getArray method to return a Double array. It also implements FindValue
 * interface and instantiates getValueAtIndex method to return a Double.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
public class CostOfItems extends ListMaker<Double> implements FindValue<Double> {

    public CostOfItems() { super(); }

    @Override //This method converts linked list to an Array of type Double
    Double[] getArray() {
        Double[] money = new Double[listObj.size()];
        return listObj.toArray(money);
    }

    @Override //This method returns a value of linked list at a specified index
    public Double getValueAtIndex(int index) { return listObj.get(index); }

}

