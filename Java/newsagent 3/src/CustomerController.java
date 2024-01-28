

import java.sql.SQLException;

public interface CustomerController {
	boolean insertCustomerDetailsAccount(Customer c) throws SQLException;
	
	void printAllCustomerDetails();
	
	boolean deleteCustomer(int customerId) throws SQLException;
	
	Customer findCustomerById(int customerId) throws NewsagentExceptionHandler;
	
	boolean updateCustomer(Customer updatedCustomer) throws SQLException;



}
