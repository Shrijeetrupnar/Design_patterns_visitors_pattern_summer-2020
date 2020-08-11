package arrayvisitors.adt;

import java.util.Iterator;
import arrayvisitors.visitors.Element;


/**
 * MyArrayListI Interface 
 * This Interface has getIterator
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public interface MyArrayListI extends Element {

	public	Iterator getIterator();

}
