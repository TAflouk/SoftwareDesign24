
public class NewsagentExceptionHandler extends Exception{
	
	String message;
	
	public NewsagentExceptionHandler(String errorMessage){
		message = errorMessage;
	}
	
	public String getMessage() {
		return message;
	}


}
