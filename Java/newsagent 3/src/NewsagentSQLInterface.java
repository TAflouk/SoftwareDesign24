

public interface NewsagentSQLInterface 
{
	public boolean isNewsagentIdExists(int idNumber) ;
	// insertNewsagentDetails method;
	public boolean insertNewsagentDetails(Newsagent newsagent) ;
	public boolean updateNewsagentDetails(Newsagent newsagent) throws NewsagentExceptionHandler ;
	public Newsagent getNewsagentById(int idNumber) throws NewsagentExceptionHandler;
	public void retrieveAndPrintAllNewsagents() ;
	public boolean deleteNewsagentById(int idNumber) throws NewsagentExceptionHandler;
	public boolean authenticateNewsagent(String newsagentName, int enteredPin) throws NewsagentExceptionHandler ;

}
