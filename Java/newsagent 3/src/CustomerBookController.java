import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface CustomerBookController 
{
	boolean customerBookExists(int customerID) ;
	boolean insertCustomerBookDetails(CustomerBook book) throws SQLException, NewsagentExceptionHandler;
	void printAllCustomerBookDetails() throws NewsagentExceptionHandler;
	boolean updateCustomerBook(CustomerBook updatedBook) throws SQLException ;
	boolean deleteCustomerBookById(int customerID) throws NewsagentExceptionHandler ;
	CustomerBook findCustomerBookById(int customerID) throws NewsagentExceptionHandler;

}
