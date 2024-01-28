public interface AdminSQLInterface {


	
	public boolean ifAdminIdExists(int idNumber);
	public boolean insertAdminDetails(Admin admin);
	public boolean updateAdminDetails(Admin admin) throws NewsagentExceptionHandler;
	public Admin getAdminById(int idNumber) throws NewsagentExceptionHandler ;
	public void retrieveAndPrintAllAdmins();
	public boolean deleteAdminById(int idNumber) throws NewsagentExceptionHandler;
	public boolean authenticateAdmin(String adminUsername, int enteredPin) throws NewsagentExceptionHandler;


}
