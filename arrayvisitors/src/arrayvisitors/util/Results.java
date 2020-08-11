package arrayvisitors.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Result class 
 * It has different method such as store,writeToFileOne, display.
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class Results implements StdoutDisplayInterface,FileDisplayInterface {

	private List<Integer> integerList;

	/**
	 * Result is default  constructor
	 * I'm initializing ArrayList in it
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public Results() {
		// TODO Auto-generated constructor stub

		integerList = new ArrayList();
	}




	/**
	 * This method is used to store result in to ArrayList
	 * @param integer to store
	 * @return no return type
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void store(int commonIntsIn) {
		// TODO Auto-generated method stub

		integerList.add(commonIntsIn);
	}


	/**
	 * This method is used to write result in file
	 * @param output file name 
	 * @return no return type
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void writeToFileOne(String output1FilePathIn) {
		// TODO Auto-generated method stub


		try {
			File myObj = new File(output1FilePathIn);
			myObj.createNewFile();
		}
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			System.out.println("Exiting...");
			System.exit(0);

		}catch (IOException e1) {
			// TODO Auto-generated catch block
			System.err.println("Could not create new file");
		}

		try {

			FileWriter myWriter = new FileWriter(output1FilePathIn);
			BufferedWriter bw = new BufferedWriter(myWriter);

			for(int i=0;i<integerList.size();i++) {
				bw.write(integerList.get(i).toString());
				bw.write("\n");
			}


			bw.close();


		}//try
		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			System.out.println("Exiting...");
			System.exit(0);

		}
		catch(IOException e) {
			System.err.println("Exception: writing to output file");
			System.err.println("Exiting...");
			System.exit(0);
		}

	}



	/**
	 * This method is used to write result on the console
	 * @param no
	 * @return no return type
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub

		for(int a: integerList )
			System.out.println(a);

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
