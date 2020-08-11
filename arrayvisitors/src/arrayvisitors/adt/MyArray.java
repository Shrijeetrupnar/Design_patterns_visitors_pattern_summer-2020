package arrayvisitors.adt;

import java.util.Iterator;
import arrayvisitors.visitors.Visitor;



/**
 * MyArray class 
 * This class has internal array to store input.
 * This is an ADT and has method such as insertInToArray,accept,returnArray
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class MyArray implements MyArrayI {

	private int[] internalArray;
	private int[] temporaryArray;
	private int positionOfArray=0;



	/**
	 * MyArray is default constructor
	 * I'm initializing internalArray in it.
	 * @param no
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public MyArray() {
		// TODO Auto-generated constructor stub

		internalArray	= new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	}


	/**
	 * This method is used to add integers from input file to an internal Array
	 * @param next input from file
	 * @return no return type
	 * @author  Shrijeet Rupnar
	 * @version 1.0
	 * @since   07-24-2020
	 */
	public void insertInToArray(int input) {

		int len=   internalArray.length;

		if(positionOfArray<len){

			internalArray[positionOfArray]= input;
			positionOfArray++;

		}
		else{

			len = (internalArray.length + (int)(Math.ceil((len/2))));
			temporaryArray = new int[len];
			int j;
			for(j=0;j<internalArray.length;j++ ){

				temporaryArray[j]= internalArray[j];
			}

			temporaryArray[j]= input;
			j++;
			while(j<len) {
				temporaryArray[j++]=-1;
			}
			internalArray= temporaryArray;
			positionOfArray++;

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
	 * This method is used to returnArray the Array
	 * @param no param
	 * @return internal array
	 * @author  Shrijeet Rupnar
	 * @version 1.0
	 * @since   07-24-2020
	 */
	public int[] returnArray() {

		return internalArray;
	}



	/**
	 * This method is used to return Iterator
	 * @param no param
	 * @return Iterator
	 * @author  Shrijeet Rupnar
	 * @version 1.0
	 * @since   07-24-2020
	 */
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return null;
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
