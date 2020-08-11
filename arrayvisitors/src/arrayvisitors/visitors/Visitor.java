package arrayvisitors.visitors;

import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayListI;


/**
 * Visitor Interface 
 * This interface has declaration of visit()
 * @return no return
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public interface Visitor {

	public void visit(MyArrayI myArrayInterface);
	public void visit(MyArrayListI myArrayListInterface);


}
