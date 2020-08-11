package arrayvisitors.visitors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayListI;
import arrayvisitors.util.Results;


/**
 * MissingIntsVisitor class 
 * It has different method such as visit.
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class MissingIntsVisitor implements Visitor {
	private Set<Integer> missingIntegerSet=null;
	private Results resultObj;


	/**
	 * MissingIntsVisitor  is parameterized constructor
	 * I'm Initializing Hashset and result class object in it.
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public MissingIntsVisitor(Results resultobjIn) {
		// TODO Auto-generated constructor stub

		missingIntegerSet= new HashSet();
		this.resultObj=resultobjIn;
	}


	/**
	 * visit method  insert values in to set 
	 * @param MyArrayI class Object
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void visit(MyArrayI myArrayObjIn) {
		// TODO Auto-generated method stub

		int[] array = myArrayObjIn.returnArray();

		for(int a : array) {
			missingIntegerSet.add(a);
		}
	}

	/**
	 * visit method  select instance of an MyArray Class object and 
	 * call accept method, The integer which is not present in set
	 * is sent to result class as Missing integer
	 * @param MyArrayList class Object
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */

	@Override
	public void visit(MyArrayListI myArrayListObjIn) {
		// TODO Auto-generated method stub

		Iterator iterator= myArrayListObjIn.getIterator();

		while(iterator.hasNext()) {

			MyArrayI myArray= (MyArrayI) iterator.next();
			myArray.accept(this);
		}

		for(int i=0;i<=99;i++) {
			if(!missingIntegerSet.contains(i)) {

				resultObj.store(i);

			}
		}
	}


	/**
	 * toString method 
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

}
