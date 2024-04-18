
public class InputMismatchException extends StringIndexOutOfBoundsException {

	public InputMismatchException(String input) {
		super(input);//to know reason of the Exception
		System.out.println(input);
	}
}
