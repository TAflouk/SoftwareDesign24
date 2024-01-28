package leapYearCalc_package;

public class ExceptionHandler extends Exception {

	String message;
	
	public ExceptionHandler(String errorMessage) 
	{
		message  = errorMessage;
	}

	public String getMessage() {
		return message;
	}


}
