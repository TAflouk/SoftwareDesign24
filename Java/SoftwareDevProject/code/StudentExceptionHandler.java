package template;

public class StudentExceptionHandler extends Exception{
	
	String message;
	
	public StudentExceptionHandler(String errorMessage){
		message = errorMessage;
	}
	
	public String getMessage() {
		return message;
	}


}
