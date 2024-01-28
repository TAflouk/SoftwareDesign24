import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
	
	public static void testReceiptSQL() throws Exception 
	{
	Receipt receipt1 = new Receipt(1, "John Doe", 102, 25.0, new int[]{15, 11, 2023}, new int[]{10, 30}, "123 Main St", 500.0, "Magazine A", "taha");
	         Receipt receipt2 = new Receipt(2, "Jane Smith", 2, 30.0, new int[]{20, 11, 2023}, new int[]{12, 45}, "456 Oak St", 700.0, "Newspaper B", "taha");
	         Receipt receipt3 = new Receipt(3, "Bob Johnson", 1, 15.0, new int[]{10, 11, 2023}, new int[]{8, 15}, "789 Pine St", 300.0, "Book C", "taha");
	         Receipt receipt4 = new Receipt(4, "Alice Brown", 14, 12.0, new int[]{5, 11, 2023}, new int[]{16, 0}, "321 Cedar St", 200.0, "Journal D", "taha");
	         Receipt receipt5 = new Receipt(5, "Eve White", 15, 18.0, new int[]{25, 11, 2023}, new int[]{14, 20}, "654 Elm St", 900.0, "Magazine E", "taha");
	List<Receipt> list = new ArrayList();
	list.add(receipt1);
	list.add(receipt2);
	list.add(receipt3);
	list.add(receipt4);
	list.add(receipt5);
	//Receipt r = new Receipt(12, null, 0, 0, null, null, null, 0, null);


	for(Receipt p: list)
	{
	MySQLAccess sql = new MySQLAccess();
	if(sql.insertReceiptDetailsAccount(p))
	{
	System.out.println("inserted");
	}
	if(!sql.insertReceiptDetailsAccount(p))
	{
	System.out.println("not inserted");
	}
	}
	}

	
	public static void testPublicationSQL() throws Exception 
	{
        Publication p0 = new Publication("Title0", 35, 230, "Author0", "Frequency0");
        Publication p1 = new Publication("Title1", 23, 20, "Author1", "Frequency1");
        Publication p2 = new Publication("Title2", 33, 20, "Author2", "Frequency2");
        Publication p3 = new Publication("Title3", 43, 20, "Author3", "Frequency3");
        
		List<Publication> list = new ArrayList();
		list.add(p0);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		//Receipt r = new Receipt(12, null, 0, 0, null, null, null, 0, null);
		


		for(Publication p: list)
		{
			MySQLAccess sql = new MySQLAccess();
			
			if(sql.insertPublicationDetails(p))
			{
				System.out.println("inserted");
			}
			if(!sql.insertPublicationDetails(p))
			{
				System.out.println("not inserted");
			}
		}
		
	}
	public static void testDeliveryDriverSQL()throws NewsagentExceptionHandler, SQLException {
	    DeliveryDriverController sql;
	    try {
	        sql = new MySQLAccess();
	        DeliveryDriver driver1 = new DeliveryDriver(1, "taha", "Doe", "123-456-7890", "123 Main St", 1234, true);
	        DeliveryDriver driver2 = new DeliveryDriver(2, "taha", "Smith", "987-654-3210", "456 Oak St", 1234, false);
	        DeliveryDriver driver3 = new DeliveryDriver(3, "taha", "Johnson", "555-123-4567", "789 Pine St", 1234, true);
	        DeliveryDriver driver4 = new DeliveryDriver(4, "taha", "Brown", "111-222-3333", "321 Cedar St", 1234, false);
	        DeliveryDriver driver5 = new DeliveryDriver(5, "abdul", "White", "999-888-7777", "654 Elm St", 1234, true);

	        // ... (other driver instances)

	        DeliveryDriver[] list = {driver1, driver2, driver3, driver4,driver5};

	        for (DeliveryDriver d : list) 
	        {
	            if (sql.insertDeliveryDriverDetails(d)) {
				    System.out.println("inserted");
				} else {
				    System.out.println("not inserted");
				}
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
    private static boolean checkDeliveryDriverAuthentication(String username, int enteredPin) {
        try {
            DeliveryDriverController authenticationDeliveryDriver = new MySQLAccess();
            return authenticationDeliveryDriver.authenticate(username, enteredPin);
        } catch (NewsagentExceptionHandler e) {
            System.out.println("Error during authentication: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean checkNewsagentAuthentication(String username, int enteredPin) {
        try {
            NewsagentSQLInterface authenticationNewsagent = new MySQLAccess();
            return authenticationNewsagent.authenticateNewsagent(username, enteredPin);
        } catch (NewsagentExceptionHandler e) {
            System.out.println("Error during authentication: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        }
    
    public static void testMenu22() {
        Menu windowLogin = new Menu("WELCOME TO NEWSAGENT APPLICATION");
        windowLogin.decorateTitle();

        while (true) {
            try {
                // Determine if the user is a Delivery Driver or Newsagent

                    boolean loggedIn = windowLogin.generateLoginWindow();
                    if (loggedIn) {
                        System.out.println("Newsagent logged in.");
                    } 
                    else {
                        System.out.println("Invalid user type. Exiting the application.");
                        break;
                    }
                }
            
        catch (InputMismatchException e) {
                System.out.println("Enter a valid number.");
            } catch (Exception e) {
                System.out.println("Please enter a valid input from the options.");
            }
        }
    }

	public static void testMenu()
	{
        Menu windowLogin = new Menu("WELCOME TO NEWSAGENT APPLICATION");
        windowLogin.decorateTitle();
		while(true) 
		{
			try {
	
		        boolean loggedIn = windowLogin.generateLoginWindow();
		        if (loggedIn) 
		        {
		            windowLogin.generateMenuForDriver();
		        } 
		        else 
		        {
		            System.out.println("Login failed. Exiting the application.");
		        }
			}
			catch(InputMismatchException e)
			{
				System.out.println("Enter valid number");
	
			}
			catch(Exception e)
			{
				System.out.println("Please enter VALID INPUT from the options.");
	
			}
		}
	}
	
	public static void testCreateCustomerBook() {
	    // Create a CustomerBook object
	    CustomerBook customerBook = new CustomerBook();

	    // Declare a boolean variable to store the result of the method
	    boolean result;

	    // Use a do-while loop to call the method until it returns true
	    do {
	        // Call the createCustomerBook() method and assign the result to the variable
	        result = customerBook.createCustomerBook();
	    } while (!result); // Repeat the loop if the result is false

	    // Print the customer book details
	    System.out.println(customerBook);
	}

	public static void main(String[] args) throws Exception
	{
		MySQLAccess e = new MySQLAccess();
        Newsagent newsagentToInsert = new Newsagent("taha", 1, "123 Main St", 987654321, 1234);

        // Create an instance of the class that contains the insertNewsagentDetails method
        // Assuming you have a class named NewsagentDAO that contains this method


        // Insert the Newsagent
        boolean insertResult = e.insertNewsagentDetails(newsagentToInsert);

        // Check if the insertion was successful
        if (insertResult) {
            System.out.println("Newsagent insertion successful!");
        } else {
            System.out.println("Newsagent insertion failed.");
        }
    
	testMenu22();

	}



			
			
			

	

	
	
	
	public static void testUpdatePublication() throws SQLException
	{
		MySQLAccess sql = new MySQLAccess();
		Publication p = new Publication("Title0", 35, 230, "Author0", "Frequency0");
		if(sql.updatePublicationDetails(p))
		{
			System.out.println("updated");
		}
		if(!sql.updatePublicationDetails(p))
		{
			sql.insertPublicationDetails(p);
			System.out.println("not updated");
		}
	}
	public static void testretRieveAllPublication() throws SQLException
	{
		MySQLAccess sql = null;
		try {
			sql = new MySQLAccess();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet resultSet = sql.retrieveAllPublications();
		while (resultSet.next()) {
		    int iD = resultSet.getInt("id");
		    String name = resultSet.getString("title");
		    // Retrieve other columns as needed
		    System.out.println("Publication ID: " + iD + ", Publication Name: " + name);
		}	
	}
	public static void testretRieveAllReceipts() throws SQLException
	{
		MySQLAccess sql = null;
		try {
			sql = new MySQLAccess();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet receiptResultSet = sql.retrieveAllReceipts();
		while (receiptResultSet.next()) {
		    int receiptId = receiptResultSet.getInt("idNumber");
		    String customerName = receiptResultSet.getString("customerName");
		    // Retrieve other columns as needed
		    System.out.println("Receipt ID: " + receiptId + ", Customer Name: " + customerName);
		}

		}	

		
	// Helper method to check if a receipt ID exists
	private static boolean isReceiptIdExists(int receiptId) throws SQLException {
		MySQLAccess sql = new MySQLAccess();
	    PreparedStatement checkStatement = sql.connect.prepareStatement("SELECT COUNT(*) AS count FROM newsagent.Receipts WHERE idNumber=?");
	    checkStatement.setInt(1, receiptId);
	    ResultSet resultSet = checkStatement.executeQuery();
	    resultSet.next();
	    int count = resultSet.getInt("count");
	    return count > 0;
	}

}
