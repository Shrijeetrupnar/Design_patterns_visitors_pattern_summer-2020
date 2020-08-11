package arrayvisitors.driver;

import java.io.File;
import java.nio.file.InvalidPathException;
import arrayvisitors.adt.MyArray;
import arrayvisitors.adt.MyArrayI;
import arrayvisitors.adt.MyArrayList;
import arrayvisitors.adt.MyArrayListI;
import arrayvisitors.util.Results;
import arrayvisitors.visitors.CommonIntsVisitor;
import arrayvisitors.visitors.MissingIntsVisitor;
import arrayvisitors.visitors.PopulateMyArrayVisitor;
import arrayvisitors.visitors.Visitor;



/**
 *  Driver class 
 * The Driver program implements the application,
 * It reads input, creates different Elements,Visitors, process the input
 * perform the write to output file and console write operation.
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public class Driver {



	/**
	 * This is the main method which accepts input file 
	 * creates different Elements and Visitors
	 * Using Result Object, it also prints to output file
	 * perform the write to output file and console write operation
	 * @param args Accepts command line arguments as array of strings
	 * @return void. Since it is main method
	 * @author Shrijeet Rupnar
	 * @version 1.0.
	 * @since   07-24-2020
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub




		if ((args.length != 5) || args[0].equals("${input1}") || args[1].equals("${input2}") ||args[2].equals("${commonintsout}") ||args[3].equals("${missingintsout}") ||args[4].equals("${debug}")) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 5 arguments.");
			System.exit(0);
		}


		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("--------------------------- Design Patterns -------------------------------------------------");
		System.out.println("--------------------- Assignment-4 - Summer - 2020 ------------------------------------------");
		System.out.println("------Program with visitors to determine features in two input files that have integers------");
		System.out.println("---------------------------------------------------------------------------------------------\n");



		String inputOneFilePath= args[0];
		String inputTwoFilePath=args[1];
		String output1FilePath=args[2];
		String output2FilePath=args[3];
		int debugLevel=Integer.parseInt(args[4]);



		try {

			File firstFile = new File(args[0]);
			File secondFile = new File(args[1]);

			if(firstFile.length()!=0 && secondFile.length()!=0 ) {

				PopulateMyArrayVisitor populateMyArrayObjOne= new PopulateMyArrayVisitor(inputOneFilePath);

				MyArrayI myArrayObj = new MyArray();

				myArrayObj.accept(populateMyArrayObjOne);


				PopulateMyArrayVisitor populateMyArrayObjSecond= new PopulateMyArrayVisitor(inputTwoFilePath);

				MyArrayI myArraySecondObj = new MyArray();

				myArraySecondObj.accept(populateMyArrayObjSecond);


				MyArrayListI myArrayListObj= new MyArrayList(myArrayObj,myArraySecondObj);

				Results resultsObjone = new Results();
				Visitor v= new CommonIntsVisitor(resultsObjone);

				Results resultsObjsecond = new Results();
				Visitor v1= new MissingIntsVisitor(resultsObjsecond);

				myArrayListObj.accept(v);
				resultsObjone.writeToFileOne(output1FilePath);

				myArrayListObj.accept(v1);
				resultsObjsecond.writeToFileOne(output2FilePath);

				System.out.println("---------------------------------------------------------------------------------------------");
				System.out.println("Common Integers in the both file :");
				System.out.println("---------------------------------------------------------------------------------------------");
				resultsObjone.display();
				System.out.println("---------------------------------------------------------------------------------------------");
				System.out.println("Missing Integers in the both file :");
				System.out.println("---------------------------------------------------------------------------------------------");
				resultsObjsecond.display();
				System.out.println("---------------------------------------------------------------------------------------------");




			}
			else {
				System.out.println("Input File is Empty...");
				System.exit(0);
			}





		}catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Null Pointer...");
			System.out.println("Exiting...");
			System.exit(0);

		}

		catch(SecurityException e)
		{
			System.out.println(e.getMessage());
			System.out.println("\n Not valid Input file...");
			System.exit(0);
		}
		catch (InvalidPathException e)
		{
			// TODO Auto-generated catch block
			System.out.println("\nPlease check Input File...");
			System.out.println("Exiting...");
			System.err.println(e.getMessage());
			System.exit(0);

		}
		catch(Exception e)// Any other exceptions
		{
			System.err.println(e.getMessage());

			System.out.println("\nException...");
			System.exit(0);
		}


		finally {

			System.out.println("---------------------------------------------------------------------------------------------");
			System.out.println("Thank you ....");
			System.out.println("Exiting.......");
			System.out.println("------------------------------- End of Application ------------------------------------------");

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
