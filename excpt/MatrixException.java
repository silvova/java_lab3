package lab3.excpt;
public class MatrixException extends RuntimeException {
	private String errorStr;

	public MatrixException(String str) {
		errorStr = str;
	}

	public void getMassage() {
		System.err.println(errorStr);
	}
}