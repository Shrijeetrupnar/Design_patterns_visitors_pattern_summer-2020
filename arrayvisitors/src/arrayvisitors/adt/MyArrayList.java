package arrayvisitors.adt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import arrayvisitors.visitors.Visitor;


/**
 * MyArrayList class 
 * This class has internal array to store input.
 * This is an ADT and has method such as accept,getIterator
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class MyArrayList implements MyArrayListI{

	List<MyArrayI> myArrayList= null;


	/**
	 * MyArrayList is parameterized  constructor
	 * I'm initializing myArrayList in it and adding objects to list
	 * @param MyArrayI
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public MyArrayList(MyArrayI... myArrayListIn) {
		// TODO Auto-generated constructor stub

		myArrayList= new ArrayList<MyArrayI>();

		for(MyArrayI myArray: myArrayListIn) {
			myArrayList.add(myArray);
		}
	}


	/**
	 * This method is used to accept the visitor and
	 * perform double dispatch on them
	 * @param visitor
	 * @return no return type
	 * @author  Shrijeet Rupnar
	 * @version 1.0
	 * @since   07-24-2020
	 */
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}


	/**
	 * This method is used to return Iterator
	 * @param no param
	 * @return Iterator of myArrayList
	 * @author  Shrijeet Rupnar
	 * @version 1.0
	 * @since   07-24-2020
	 */
	public Iterator getIterator() {
		return myArrayList.iterator();

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
