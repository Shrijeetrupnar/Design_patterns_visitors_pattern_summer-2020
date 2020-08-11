package arrayvisitors.visitors;

import java.io.IOException;

import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayListI;
import arrayvisitors.util.FileProcessor;


/**
 * PopulateMyArrayVisitor class 
 * It has different method such as processInput,visit
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class PopulateMyArrayVisitor implements Visitor{

	private String inputOneFilePath=null;
	private Element element= null;


	/**
	 * PopulateMyArrayVisitor  is parameterized constructor
	 * I'm Initializing inputFilePath in it.
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	public PopulateMyArrayVisitor(String inputOneFilePathIn) {
		// TODO Auto-generated constructor stub

		this.inputOneFilePath=inputOneFilePathIn;

	}


	/**
	 * processInput this method used to parse input file
	 * and send input to MyArray to insert into Internal Array
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */

	public void processInput() {

		try {

			FileProcessor fp= new FileProcessor(inputOneFilePath);

			String line; 
			do {
				line = fp.poll();
				if(line != null) {
					int number= Integer.parseInt(line);

					((MyArrayI) element).insertInToArray(number);
				}
				else {
					//EOF


				}
			} while(line != null);



		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Number Format Exception...");
			System.out.println("Please check input file...");
			System.exit(0);

		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}

	}

	/**
	 * visit this method will call ProcessInput method
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */

	@Override
	public void visit(MyArrayI myArrayInterface) {
		// TODO Auto-generated method stub
		element = (MyArrayI)myArrayInterface;

		processInput();

	}


	/**
	 * visit method 
	 * @param MyArrayListI
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */
	@Override
	public void visit(MyArrayListI myArrayListInterface) {
		// TODO Auto-generated method stub

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
