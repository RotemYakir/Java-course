package homeWorkDictionary;

public class DictionaryExceptions extends Exception {

	private static final long serialVersionUID = 1L;

	public DictionaryExceptions() {
		super();
	}

	public DictionaryExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DictionaryExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public DictionaryExceptions(String message) {
		super(message);
	}

	public DictionaryExceptions(Throwable cause) {
		super(cause);
	}

}