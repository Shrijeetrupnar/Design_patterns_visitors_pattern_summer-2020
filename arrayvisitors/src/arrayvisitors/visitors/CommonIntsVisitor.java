package arrayvisitors.visitors;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayListI;
import arrayvisitors.util.Results;


/**
 * CommonIntsVisitor class 
 * It has different method such as visit.
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class CommonIntsVisitor implements Visitor {

	private	List<MyArrayI> myArrayList=null;
	private	Results resultobj=null;
	private Set<Integer> commonIntegerSet = null;
	private boolean isFirstArray=true;


	/**
	 * CommonIntsVisitor  is parameterized constructor
	 * I'm Initializing HashMap and result class object in it.
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public CommonIntsVisitor(Results resultclassObjIn) {
		// TODO Auto-generated constructor stub

		commonIntegerSet= new HashSet<Integer>(); 

		resultobj=resultclassObjIn;
	}



	/**
	 * visit method  insert values in to map and if corresponding key is not
	 * presnt then it will be inserted with value one, if key is already
	 * presnt then the corresponding value is increased by 1
	 * @param MyArray class Object
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void visit(MyArrayI myArrayObjIn) {
		// TODO Auto-generated method stub

		int[] array = myArrayObjIn.returnArray();

		if(isFirstArray) {

			for(int a: array) {
				commonIntegerSet.add(a);

			}
		}else {

			for(int a: array) {

				if(commonIntegerSet.contains(a)&& a!=-1) {
					resultobj.store(a);

				}
			}
		}
	}


	/**
	 * visit method  select instance of an MyArray Class object and 
	 * call accept method, Common integer with value greater
	 *  than 1 are sent to Result class
	 * @param MyArrayList class Object
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void visit(MyArrayListI myArrayListObjIn) {
		// TODO Auto-generated method stub

		Iterator iterator= myArrayListObjIn.getIterator();

		MyArrayI myArray= (MyArrayI) iterator.next();

		myArray.accept(this);

		isFirstArray=false;

		myArray= (MyArrayI) iterator.next();

		myArray.accept(this);

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
