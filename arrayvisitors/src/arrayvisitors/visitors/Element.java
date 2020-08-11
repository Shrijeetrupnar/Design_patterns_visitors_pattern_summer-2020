package arrayvisitors.visitors;

/**
 * Element Interface 
 * This interface has declaration of accept()
 * @return no return
 * @author Shrijeet Rupnar
 * @version 1.0.
 * @since   07-24-2020
 */
public interface Element {

	public void accept(Visitor visit);

}
