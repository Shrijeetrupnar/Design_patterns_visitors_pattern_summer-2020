package arrayvisitors.adt;

import java.util.Iterator;
import arrayvisitors.visitors.Element;

/**
 * MyArrayI Interface 
 * This Interface has insertInToArray,getIterator
 * returnArray method declaration.
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public interface MyArrayI extends Element {

	public	void insertInToArray(int number);

	public	Iterator getIterator();

	public int[] returnArray();

}
