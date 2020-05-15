/**
 *  Final Project
 *  This abstract class lays out the groundwork for creating a Linked List of type Generic. It holds
 *  methods add, remove, and defines an abstract method called getArray.
 *  CS108-4
 *  5-14-20
 *  @author  Noah Hoenig
 */
import java.util.LinkedList;

public abstract class ListMaker<E> {

    protected LinkedList<E> listObj;  // A linked list of generic type E

    public ListMaker(){ listObj = new LinkedList<>(); }

    public void add(E value) { listObj.add(value); } //Method adds value of generic type E to linked list

    public void remove(E obj) { listObj.remove(obj); } //Method removes obj of generic type E from linked list

    public LinkedList<E> getListObj() { return listObj; } //Returns the linked list

    abstract E[] getArray(); //This method will return the array representation of the linked list

}
