package exception;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	MyException(String msg) {
		super(msg);
	}
}
