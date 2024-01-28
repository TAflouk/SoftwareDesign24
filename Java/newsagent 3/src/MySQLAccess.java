import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLAccess implements DeliveryDocketController, ReceiptUpdater, AdminSQLInterface, DeliveryDriverController, NewsagentSQLInterface, CustomerBookController, CustomerController, InvoiceController,DeliveryAreaController, PublicationInterface {
	
	Connection connect = null;
	private Statement statement = null;
	PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	final private String host ="localhost:3306";
	final private String user = "root";
	final private String password = "";
    private final String url = "jdbc:mysql://localhost:3306/newsagent";
	
	public MySQLAccess() throws SQLException
	{
	    try
	    {
	        // Load MySQL Driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Setup the connection with the DB
	        connect = DriverManager.getConnection("jdbc:mysql://" + host + "/newsagent?" + "user=" + user + "&password=" + password);
	    }
	    catch (ClassNotFoundException e)
	    {
	        throw new SQLException("MySQL JDBC Driver not found.", e);
	    }
	}
	// -------------------------------------------   CRUD for Delivery Docket  --------------------------------------
	 public boolean insertDeliveryDocketDetails(DeliveryDocket docket) {
	        boolean insertSuccessful = true;
	        try {
	            preparedStatement = connect.prepareStatement("INSERT INTO newsagent.DeliveryDockets (docketIDNumber, driverIDnumebr, customerName, customerID, price, dateDay, dateMonth, dateYear, timeHour, timeMinute, stateNumber, customerHomeAddress, customerBalance, statusOfSuccess, statusOfReturned, publicationName) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

	            preparedStatement.setInt(1, docket.getDocketIDNumber());
	            preparedStatement.setInt(2, docket.getDriverIDnumebr());
	            preparedStatement.setString(3, docket.getCustomerName());
	            preparedStatement.setInt(4, docket.getCustomerID());
	            preparedStatement.setInt(5, docket.getPrice());
	            preparedStatement.setInt(6, docket.getDate()[0]);
	            preparedStatement.setInt(7, docket.getDate()[1]);
	            preparedStatement.setInt(8, docket.getDate()[2]);
	            preparedStatement.setInt(9, docket.getTime()[0]);
	            preparedStatement.setInt(10, docket.getTime()[1]);
	            preparedStatement.setInt(11, docket.getStateNumber());
	            preparedStatement.setString(12, docket.getCustomerHomeAddress());
	            preparedStatement.setInt(13, docket.getCustomerBalance());
	            preparedStatement.setBoolean(14, docket.isStatusOfSuccess());
	            preparedStatement.setBoolean(15, docket.isStatusOfReturned());
	            preparedStatement.setString(16, docket.getPublicationName());

	            preparedStatement.executeUpdate();
	        } catch (Exception e) {
	            insertSuccessful = false;
	            e.printStackTrace();
	        }
	        return insertSuccessful;
	    }

	    public void retrieveAndPrintAllDockets() {
	        try {
	            statement = connect.createStatement();
	            resultSet = statement.executeQuery("SELECT * FROM newsagent.DeliveryDockets");

	            while (resultSet.next()) {
	                // Retrieve and print details similar to the existing Receipt retrieval
	                // Use resultSet.getInt, resultSet.getString, etc., to retrieve values
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // Similar closing statements as in the existing Receipt retrieval
	        }
	    }

	    public boolean updateDeliveryDocketDetails(DeliveryDocket docket) {
	        boolean updateSuccessful = true;
	        try {
	            if (isDocketIdExists(docket.getDocketIDNumber())) {
	                preparedStatement = connect.prepareStatement("UPDATE newsagent.DeliveryDockets SET driverIDnumebr=?, customerName=?, customerID=?, price=?, dateDay=?, dateMonth=?, dateYear=?, timeHour=?, timeMinute=?, stateNumber=?, customerHomeAddress=?, customerBalance=?, statusOfSuccess=?, statusOfReturned=?, publicationName=? WHERE docketIDNumber=?");

	                preparedStatement.setInt(1, docket.getDriverIDnumebr());
	                preparedStatement.setString(2, docket.getCustomerName());
	                preparedStatement.setInt(3, docket.getCustomerID());
	                preparedStatement.setInt(4, docket.getPrice());
	                preparedStatement.setInt(5, docket.getDate()[0]);
	                preparedStatement.setInt(6, docket.getDate()[1]);
	                preparedStatement.setInt(7, docket.getDate()[2]);
	                preparedStatement.setInt(8, docket.getTime()[0]);
	                preparedStatement.setInt(9, docket.getTime()[1]);
	                preparedStatement.setInt(10, docket.getStateNumber());
	                preparedStatement.setString(11, docket.getCustomerHomeAddress());
	                preparedStatement.setInt(12, docket.getCustomerBalance());
	                preparedStatement.setBoolean(13, docket.isStatusOfSuccess());
	                preparedStatement.setBoolean(14, docket.isStatusOfReturned());
	                preparedStatement.setString(15, docket.getPublicationName());
	                preparedStatement.setInt(16, docket.getDocketIDNumber());

	                preparedStatement.executeUpdate();
	            } else {
	                System.out.println("Delivery Docket with ID " + docket.getDocketIDNumber() + " does not exist. Cannot update.");
	                updateSuccessful = false;
	            }
	        } catch (SQLException e) {
	            updateSuccessful = false;
	            e.printStackTrace();
	        }
	        return updateSuccessful;
	    }

	    public boolean isDocketIdExists(int id) throws SQLException {
	        preparedStatement = connect.prepareStatement("SELECT docketIDNumber FROM newsagent.DeliveryDockets WHERE docketIDNumber = ?");
	        preparedStatement.setInt(1, id);
	        resultSet = preparedStatement.executeQuery();
	        return resultSet.next(); // Returns true if the ID exists
	    }

	 // Inside your DeliveryDocketController or a similar class
	    public boolean deleteDeliveryDocket(int docketIDNumber) {
	        try {
	            if (isDocketIdExists(docketIDNumber)) {
	                // Create a DELETE SQL query
	                String deleteQuery = "DELETE FROM newsagent.DeliveryDockets WHERE docketIDNumber=?";

	                // Prepare the statement
	                preparedStatement = connect.prepareStatement(deleteQuery);
	                preparedStatement.setInt(1, docketIDNumber);

	                // Execute the query
	                int rowsAffected = preparedStatement.executeUpdate();

	                if (rowsAffected > 0) {
	                    System.out.println("Delivery Docket with ID " + docketIDNumber + " deleted successfully.");
	                    return true;
	                } else {
	                    System.out.println("Failed to delete Delivery Docket with ID " + docketIDNumber + ".");
	                }
	            } else {
	                System.out.println("Delivery Docket with ID " + docketIDNumber + " does not exist.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return false;
	    }


	    public DeliveryDocket findDocketById(int docketIDNumber) {
	        try {
	            if (isDocketIdExists(docketIDNumber)) {
	                preparedStatement = connect.prepareStatement("SELECT * FROM newsagent.DeliveryDockets WHERE docketIDNumber=?");
	                preparedStatement.setInt(1, docketIDNumber);
	                resultSet = preparedStatement.executeQuery();

	                if (resultSet.next()) {
	                    // Retrieve and create a new DeliveryDocket object using the correct column names
	                    int[] retrievedDate = {
	                            resultSet.getInt("dateDay"),
	                            resultSet.getInt("dateMonth"),
	                            resultSet.getInt("dateYear")
	                    };

	                    int[] retrievedTime = {
	                            resultSet.getInt("timeHour"),
	                            resultSet.getInt("timeMinute")
	                    };

	                    return new DeliveryDocket(
	                            resultSet.getInt("docketIDNumber"),
	                            resultSet.getInt("driverIDnumebr"),
	                            resultSet.getString("customerName"),
	                            resultSet.getInt("customerID"),
	                            resultSet.getInt("price"),
	                            retrievedDate,
	                            retrievedTime,
	                            resultSet.getInt("stateNumber"),
	                            resultSet.getString("customerHomeAddress"),
	                            resultSet.getInt("customerBalance"),
	                            resultSet.getBoolean("statusOfSuccess"),
	                            resultSet.getBoolean("statusOfReturned"),
	                            resultSet.getString("publicationName")
	                    );
	                } else {
	                    System.out.println("Delivery Docket with ID " + docketIDNumber + " not found.");
	                }
	            } else {
	                System.out.println("Delivery Docket with ID " + docketIDNumber + " does not exist.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }


	    public ResultSet retrieveAllDockets() {
	        try {
	            statement = connect.createStatement();
	            resultSet = statement.executeQuery("SELECT * FROM newsagent.DeliveryDockets");
	        } catch (Exception e) {
	            resultSet = null;
	        }
	        return resultSet;
	    }
	    public void printAllDockets() {
	        try {
	            ResultSet resultSet = retrieveAllDockets();

	            while (resultSet.next()) {
	                int docketIDNumber = resultSet.getInt("docketIDNumber");
	                int driverIDNumber = resultSet.getInt("driverIDnumebr");
	                String customerName = resultSet.getString("customerName");
	                int customerID = resultSet.getInt("customerID");
	                int price = resultSet.getInt("price");
	                int dateDay = resultSet.getInt("dateDay");
	                int dateMonth = resultSet.getInt("dateMonth");
	                int dateYear = resultSet.getInt("dateYear");
	                int timeHour = resultSet.getInt("timeHour");
	                int timeMinute = resultSet.getInt("timeMinute");
	                int stateNumber = resultSet.getInt("stateNumber");
	                String customerHomeAddress = resultSet.getString("customerHomeAddress");
	                int customerBalance = resultSet.getInt("customerBalance");
	                boolean statusOfSuccess = resultSet.getBoolean("statusOfSuccess");
	                boolean statusOfReturned = resultSet.getBoolean("statusOfReturned");
	                String publicationName = resultSet.getString("publicationName");

	                System.out.println("Docket ID: " + docketIDNumber +
	                        ", Driver ID: " + driverIDNumber +
	                        ", Customer Name: " + customerName +
	                        ", Customer ID: " + customerID +
	                        ", Price: " + price +
	                        ", Date: " + dateDay + "/" + dateMonth + "/" + dateYear +
	                        ", Time: " + timeHour + ":" + timeMinute +
	                        ", State Number: " + stateNumber +
	                        ", Customer Home Address: " + customerHomeAddress +
	                        ", Customer Balance: " + customerBalance +
	                        ", Status of Success: " + statusOfSuccess +
	                        ", Status of Returned: " + statusOfReturned +
	                        ", Publication Name: " + publicationName);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	     
	    public boolean docketExists(int docketID) {
	        try {
	            preparedStatement = connect.prepareStatement("SELECT docketIDNumber FROM your_database_name.DeliveryDockets WHERE docketIDNumber = ?");
	            preparedStatement.setInt(1, docketID);
	            resultSet = preparedStatement.executeQuery();
	            return resultSet.next(); // Returns true if the docket ID exists
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        } finally {
	            try {
	                if (resultSet != null) resultSet.close();
	                if (preparedStatement != null) preparedStatement.close();
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }

	   
	    public boolean updateDocket(DeliveryDocket updatedDocket) throws SQLException {
	        boolean updateSuccessful = true;
	        try {
	            // Check if the ID exists before updating
	            if (docketExists(updatedDocket.getDocketIDNumber())) {
	                preparedStatement = connect.prepareStatement("UPDATE your_database_name.DeliveryDockets SET driverIDnumebr=?, customerName=?, customerID=?, price=?, dateDay=?, dateMonth=?, dateYear=?, timeHour=?, timeMinute=?, stateNumber=?, customerHomeAddress=?, customerBalance=?, statusOfSuccess=?, statusOfReturned=?, publicationName=? WHERE docketIDNumber=?");
	                preparedStatement.setInt(1, updatedDocket.getDriverIDnumebr());
	                preparedStatement.setString(2, updatedDocket.getCustomerName());
	                preparedStatement.setInt(3, updatedDocket.getCustomerID());
	                preparedStatement.setInt(4, updatedDocket.getPrice());
	                preparedStatement.setInt(5, updatedDocket.getDate()[0]);
	                preparedStatement.setInt(6, updatedDocket.getDate()[1]);
	                preparedStatement.setInt(7, updatedDocket.getDate()[2]);
	                preparedStatement.setInt(8, updatedDocket.getTime()[0]);
	                preparedStatement.setInt(9, updatedDocket.getTime()[1]);
	                preparedStatement.setInt(10, updatedDocket.getStateNumber());
	                preparedStatement.setString(11, updatedDocket.getCustomerHomeAddress());
	                preparedStatement.setInt(12, updatedDocket.getCustomerBalance());
	                preparedStatement.setBoolean(13, updatedDocket.isStatusOfSuccess());
	                preparedStatement.setBoolean(14, updatedDocket.isStatusOfReturned());
	                preparedStatement.setString(15, updatedDocket.getPublicationName());
	                preparedStatement.setInt(16, updatedDocket.getDocketIDNumber());

	                preparedStatement.executeUpdate();
	            } else {
	                System.out.println("Docket with ID " + updatedDocket.getDocketIDNumber() + " does not exist. Cannot update.");
	                updateSuccessful = false;
	            }
	        } catch (SQLException e) {
	            updateSuccessful = false;
	            e.printStackTrace();
	        }
	        return updateSuccessful;
	    }
	
	
	
	// -------------------------------------------   CRUD for Publication  --------------------------------------
	public boolean deletePublicationById(int id) {
	    boolean deleteSuccessful = true;
	    try {
	        if (id == -99) {
	            preparedStatement = connect.prepareStatement("DELETE FROM newsagent.publications");
	        } else {
	            preparedStatement = connect.prepareStatement("DELETE FROM newsagent.publications WHERE id = ?");
	            preparedStatement.setInt(1, id);
	        }
	        preparedStatement.executeUpdate();
	    } catch (Exception e) {
	        deleteSuccessful = false;
	        e.printStackTrace();
	    }
	    return deleteSuccessful;
	}
	
	public void retrieveAndPrintAllPublications() {
	    try {
	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM newsagent.publications");

	        while (resultSet.next()) {
	            int id = resultSet.getInt("id");
	            String title = resultSet.getString("title");
	            double price = resultSet.getDouble("price");
	            String author = resultSet.getString("author");
	            String frequency = resultSet.getString("frequency");

	            System.out.println("ID: " + id + ", Title: " + title + ", Price: " + price + ", Author: " + author + ", Frequency: " + frequency);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    
	    finally {
	        try {
	            if (resultSet != null) resultSet.close();
	            if (statement != null) statement.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	public Publication findPublicationById(int publicationId) {
	    Publication publication = null;
	    try {
	        preparedStatement = connect.prepareStatement("SELECT * FROM newsagent.publications WHERE id = ?");
	        preparedStatement.setInt(1, publicationId);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	            // Found a matching publication
	            String title = resultSet.getString("title");
	            double price = resultSet.getDouble("price");
	            String author = resultSet.getString("author");
	            String frequency = resultSet.getString("frequency");

	            // Create a Publication object with the retrieved data
	            publication = new Publication(title, publicationId, price, author, frequency);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return publication;
	}

	public boolean insertPublicationDetails(Publication p) {
	    boolean insertSuccessful = true;
	    try {
	        if (!isPublicationIdExists(p.getIdNumber())) {
	            preparedStatement = connect.prepareStatement("INSERT INTO newsagent.publications (id, title, price, author, frequency) VALUES (?, ?, ?, ?, ?)");
	            preparedStatement.setInt(1, p.getIdNumber());
	            preparedStatement.setString(2, p.getTitle());
	            preparedStatement.setDouble(3, p.getPrice());
	            preparedStatement.setString(4, p.getAuthor());
	            preparedStatement.setString(5, p.getFrequncy());
	            preparedStatement.executeUpdate();
	        } else {
	            System.out.println("Publication with ID " + p.getIdNumber() + " already exists.");
	            insertSuccessful = false;
	        }
	    } catch (SQLException e) {
	        insertSuccessful = false;
	        e.printStackTrace();
	    }
	    return insertSuccessful;
	}

	public boolean isPublicationIdExists(int id) throws SQLException {
	    preparedStatement = connect.prepareStatement("SELECT id FROM newsagent.publications WHERE id = ?");
	    preparedStatement.setInt(1, id);
	    resultSet = preparedStatement.executeQuery();
	    return resultSet.next(); // Returns true if the ID exists
	}
	public boolean updatePublicationDetails(Publication p) {
	    boolean updateSuccessful = true;
	    try {
	        if (isPublicationIdExists(p.getIdNumber())) {
	            preparedStatement = connect.prepareStatement("UPDATE newsagent.publications SET title=?, price=?, author=?, frequency=? WHERE id=?");
	            preparedStatement.setString(1, p.getTitle());
	            preparedStatement.setDouble(2, p.getPrice());
	            preparedStatement.setString(3, p.getAuthor());
	            preparedStatement.setString(4, p.getFrequncy());
	            preparedStatement.setInt(5, p.getIdNumber());

	            preparedStatement.executeUpdate();
	        } else {
	            System.out.println("Publication with ID " + p.getIdNumber() + " does not exist. Cannot update.");
	            updateSuccessful = false;
	        }
	    } catch (SQLException e) {
	        updateSuccessful = false;
	        e.printStackTrace();
	    }
	    return updateSuccessful;
	}
	public ResultSet retrieveAllPublications() {
	    try {
	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM newsagent.publications");
	    } catch (Exception e) {
	        resultSet = null;
	    }
	    return resultSet;
	}
	// -------------------------------------------   CRUD for Receipt --------------------------------------
	public boolean insertReceiptDetailsAccount(Receipt r) {
	    boolean insertSuccessful = true;
	    try {
	        if (!isReceiptIdExists(r.getIdNumber())) {
	            preparedStatement = connect.prepareStatement("INSERT INTO newsagent.Receipts (idNumber, customerName, customerID, price, dateDay, dateMonth, dateYear, timeHour, timeMinute, homeAddress, balance, publicationName, name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");

	            preparedStatement.setInt(1, r.getIdNumber());
	            preparedStatement.setString(2, r.getCustomerName());
	            preparedStatement.setInt(3, r.getCustomerID());
	            preparedStatement.setDouble(4, r.getPrice());
	            preparedStatement.setInt(5, r.getDate()[0]);
	            preparedStatement.setInt(6, r.getDate()[1]);
	            preparedStatement.setInt(7, r.getDate()[2]);
	            preparedStatement.setInt(8, r.getTime()[0]);
	            preparedStatement.setInt(9, r.getTime()[1]);
	            preparedStatement.setString(10, r.getHomeAddress());
	            preparedStatement.setDouble(11, r.getBalance());
	            preparedStatement.setString(12, r.getPublicationName());
	            preparedStatement.setString(13, r.getName());
	            preparedStatement.executeUpdate();
	        } else {
	            System.out.println("Receipt with ID " + r.getIdNumber() + " already exists.");
	            insertSuccessful = false;
	        }
	    } catch (Exception e) {
	        insertSuccessful = false;
	        e.printStackTrace();
	    }
	    return insertSuccessful;
	}

	public void retrieveAndPrintAllReceipts() {
	    try {
	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM newsagent.Receipts");

	        while (resultSet.next()) {
	            int idNumber = resultSet.getInt("idNumber");
	            String customerName = resultSet.getString("customerName");
	            int customerID = resultSet.getInt("customerID");
	            double price = resultSet.getDouble("price");
	            int dateDay = resultSet.getInt("dateDay");
	            int dateMonth = resultSet.getInt("dateMonth");
	            int dateYear = resultSet.getInt("dateYear");
	            int timeHour = resultSet.getInt("timeHour");
	            int timeMinute = resultSet.getInt("timeMinute");
	            String homeAddress = resultSet.getString("homeAddress");
	            double balance = resultSet.getDouble("balance");
	            String name = resultSet.getString("name");
	            String publicationName = resultSet.getString("publicationName");

	            System.out.println("ID Number: " + idNumber + ", Customer Name: " + customerName +
	                    ", Customer ID: " + customerID + ", Price: " + price +
	                    ", Date: " + dateDay + "/" + dateMonth + "/" + dateYear +
	                    ", Time: " + timeHour + ":" + timeMinute + ":" + 
	                    ", Home Address: " + homeAddress + ", Balance: " + balance +
	                    ", Publication Name: " + publicationName +"Name: "+name);
	        }
	    } 
	    catch (SQLException e) {
	        e.printStackTrace();
	    } 
	    finally {
	        try {
	            if (resultSet != null) resultSet.close();
	            if (statement != null) statement.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	
	public boolean updateReceiptDetails(Receipt r) {
        boolean updateSuccessful = true;
        try {
            // Check if the ID exists before updating
            if (isReceiptIdExists(r.getIdNumber())) {
                preparedStatement = connect.prepareStatement("UPDATE newsagent.Receipts SET customerName=?, customerID=?, price=?, dateDay=?, dateMonth=?, dateYear=?, timeHour=?, timeMinute=?, homeAddress=?, balance=?, publicationName=?, name=? WHERE idNumber=?");
                preparedStatement.setString(1, r.getCustomerName());
                preparedStatement.setInt(2, r.getCustomerID());
                preparedStatement.setDouble(3, r.getPrice());
                preparedStatement.setInt(4, r.getDate()[0]);
                preparedStatement.setInt(5, r.getDate()[1]);
                preparedStatement.setInt(6, r.getDate()[2]);
                preparedStatement.setInt(7, r.getTime()[0]);
                preparedStatement.setInt(8, r.getTime()[1]);
                preparedStatement.setString(9, r.getHomeAddress());
                preparedStatement.setDouble(10, r.getBalance());
                preparedStatement.setString(11, r.getPublicationName());
                preparedStatement.setString(12, r.getName());
                preparedStatement.setInt(13, r.getIdNumber());

                preparedStatement.executeUpdate();
            } else {
                System.out.println("Receipt with ID " + r.getIdNumber() + " does not exist. Cannot update.");
                updateSuccessful = false;
            }
        } catch (SQLException e) {
            updateSuccessful = false;
            e.printStackTrace();
        }
        return updateSuccessful;
    }

    public boolean isReceiptIdExists(int id) throws SQLException {
        preparedStatement = connect.prepareStatement("SELECT idNumber FROM newsagent.Receipts WHERE idNumber = ?");
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        return resultSet.next(); // Returns true if the ID exists
    }
    public ResultSet retrieveAllReceipts()
	{
	    try 
	    {
	        statement = connect.createStatement();
	        resultSet = statement.executeQuery("SELECT * FROM newsagent.Receipts");
	    } catch (Exception e) {
	        resultSet = null;
	    }
	    return resultSet;
	}

	
	
    public boolean deleteReceiptById(int idNumber) {
        boolean deleteSuccessful = true;
        try {
            // Create a prepared statement to issue the SQL query to the database
            if (idNumber == -99) {
                // Delete all entries in the Receipts table
                preparedStatement = connect.prepareStatement("DELETE FROM newsagent.Receipts");
            } else {
                // Delete a particular Receipt by idNumber
                preparedStatement = connect.prepareStatement("DELETE FROM newsagent.Receipts WHERE idNumber = ?");
                preparedStatement.setInt(1, idNumber);
                preparedStatement.executeUpdate();

                // Check if any rows were affected to determine if the receipt was deleted successfully
                if (preparedStatement.getUpdateCount() == 0) {
                    System.out.println("Receipt with ID " + idNumber + " does not exist. Cannot delete.");
                    deleteSuccessful = false;
                }
            }
        } catch (Exception e) {
            deleteSuccessful = false;
            e.printStackTrace();
        }
        return deleteSuccessful;
    }


	public Receipt findReceiptById(int receiptId) 
	{
	    try 
	    {
	        // Check if the ID exists
	        if (isReceiptIdExists(receiptId)) 
	        {
	            PreparedStatement preparedStatement = connect.prepareStatement("SELECT * FROM newsagent.Receipts WHERE idNumber=?");
	            preparedStatement.setInt(1, receiptId);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) 
	            {
	                int idNumber = resultSet.getInt("idNumber");
	                String customerName = resultSet.getString("customerName");
	                int customerID = resultSet.getInt("customerID");
	                double price = resultSet.getDouble("price");
	                int dateDay = resultSet.getInt("dateDay");
	                int dateMonth = resultSet.getInt("dateMonth");
	                int dateYear = resultSet.getInt("dateYear");
	                int timeHour = resultSet.getInt("timeHour");
	                int timeMinute = resultSet.getInt("timeMinute");
	                String homeAddress = resultSet.getString("homeAddress");
	                double balance = resultSet.getDouble("balance");
	                String name = resultSet.getString("name");
	                String publicationName = resultSet.getString("publicationName");

	                return new Receipt(idNumber, customerName, customerID, price,
	                        new int[]{dateDay, dateMonth, dateYear},
	                        new int[]{timeHour, timeMinute},
	                        homeAddress, balance, publicationName,name);
	            }
	            else 
	            {
	                System.out.println("Receipt with ID " + receiptId + " not found.");
	            }
	        } 
	        else 
	        {
	            System.out.println("Receipt with ID " + receiptId + " does not exist.");
	        }
	    } 
	    catch (SQLException e) 
	    {
	        e.printStackTrace();
	    }
	    return null;
	}


public boolean authenticate(String username, int enteredPin) throws NewsagentExceptionHandler {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        String query = "SELECT * FROM DeliveryDrivers WHERE name = ? AND pin = ?";
        connection = DriverManager.getConnection("jdbc:mysql://" + host + "/newsagent?" + "user=" + user + "&password=" + password);
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setInt(2, enteredPin);

        resultSet = preparedStatement.executeQuery();

        // If there is a match in the database, return true; otherwise, return false
        return resultSet.next();
    } catch (SQLException e) {
        throw new NewsagentExceptionHandler("Error during authentication: " + e.getMessage());
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
// -------------------------------------------   CRUD for Newsagent  --------------------------------------
public boolean isNewsagentIdExists(int idNumber) {
    boolean exists = false;
    try {
        preparedStatement = connect.prepareStatement("SELECT id_number FROM newsagents WHERE id_number = ?");
        preparedStatement.setInt(1, idNumber);
        resultSet = preparedStatement.executeQuery();
        exists = resultSet.next();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return exists;
}
// insertNewsagentDetails method
public boolean insertNewsagentDetails(Newsagent newsagent) {
    boolean insertSuccessful = true;
    try {
        // Check if the ID already exists
        if (!isNewsagentIdExists(newsagent.getIdNumber())) {
            preparedStatement = connect.prepareStatement("INSERT INTO newsagents (id_number, newsagent_name, address, phone_number, pin) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, newsagent.getIdNumber());
            preparedStatement.setString(2, newsagent.getNewsagentName());
            preparedStatement.setString(3, newsagent.getAddress());
            preparedStatement.setInt(4, newsagent.getPhoneNumber());
            preparedStatement.setInt(5, newsagent.getPin());
            preparedStatement.executeUpdate();
        } else {
            System.out.println("Newsagent with ID " + newsagent.getIdNumber() + " already exists.");
            insertSuccessful = false;
        }
    } catch (SQLException e) {
        insertSuccessful = false;
        e.printStackTrace();
    }
    return insertSuccessful;
}
public boolean updateNewsagentDetails(Newsagent newsagent) throws NewsagentExceptionHandler {
    boolean updateSuccessful = true;
    try {
        // Check if the ID exists before updating
        if (isNewsagentIdExists(newsagent.getIdNumber())) {
            preparedStatement = connect.prepareStatement("UPDATE newsagents SET newsagent_name=?, address=?, phone_number=?, pin=? WHERE id_number=?");

            preparedStatement.setString(1, newsagent.getNewsagentName());
            preparedStatement.setString(2, newsagent.getAddress());
            preparedStatement.setInt(3, newsagent.getPhoneNumber());
            preparedStatement.setInt(4, newsagent.getPin());
            preparedStatement.setInt(5, newsagent.getIdNumber());

            preparedStatement.executeUpdate();
        } else {
            // Throw an exception if the ID is not found
            throw new NewsagentExceptionHandler("Newsagent with ID " + newsagent.getIdNumber() + " does not exist. Cannot update.");
        }
    } catch (SQLException e) {
        updateSuccessful = false;
        e.printStackTrace(); // You may log or handle the SQL exception as needed
    }
    return updateSuccessful;
}



public Newsagent getNewsagentById(int idNumber) throws NewsagentExceptionHandler {
    Newsagent newsagent = null;
    try {
        preparedStatement = connect.prepareStatement("SELECT * FROM newsagents WHERE id_number = ?");
        preparedStatement.setInt(1, idNumber);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String newsagentName = resultSet.getString("newsagent_name");
            String address = resultSet.getString("address");
            int phoneNumber = resultSet.getInt("phone_number");
            int pin = resultSet.getInt("pin");

            newsagent = new Newsagent(newsagentName, idNumber, address, phoneNumber, pin);
        } else {
            // Throw an exception if the ID is not found
            throw new NewsagentExceptionHandler("Newsagent with ID " + idNumber + " not found.");
        }
    } catch (SQLException e) 
    {
        e.printStackTrace();
        // Log or return an indication of failure
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    return newsagent;
}



public void retrieveAndPrintAllNewsagents() {
    try {
        statement = connect.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM newsagents");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String newsagentName = resultSet.getString("newsagent_name");
            int idNumber = resultSet.getInt("id_number");
            String address = resultSet.getString("address");
            int phoneNumber = resultSet.getInt("phone_number");
            int pin = resultSet.getInt("pin");

            System.out.println("ID: " + id +
                    ", Newsagent Name: " + newsagentName +
                    ", ID Number: " + idNumber +
                    ", Address: " + address +
                    ", Phone Number: " + phoneNumber +
                    ", PIN: " + pin);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close the resources to prevent memory leaks
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

public boolean deleteNewsagentById(int idNumber) throws NewsagentExceptionHandler {
    boolean deleteSuccessful = false;
    try {
        // Check if the ID exists before deleting
        if (isNewsagentIdExists(idNumber)) {
            preparedStatement = connect.prepareStatement("DELETE FROM newsagents WHERE id_number=?");
            preparedStatement.setInt(1, idNumber);
            preparedStatement.executeUpdate();
            deleteSuccessful = true;
        } else {
            // Throw an exception if the ID is not found
            throw new NewsagentExceptionHandler("Newsagent with ID " + idNumber + " does not exist. Cannot delete.");
        }
    } catch (SQLException e) {
        e.printStackTrace(); // You may log or handle the SQL exception as needed
    }
    return deleteSuccessful;
}

public boolean authenticateNewsagent(String newsagentName, int enteredPin) throws NewsagentExceptionHandler {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        String query = "SELECT * FROM Newsagents WHERE newsagent_name = ? AND pin = ?";
        connection = DriverManager.getConnection("jdbc:mysql://" + host + "/newsagent?" + "user=" + user + "&password=" + password);
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newsagentName);
        preparedStatement.setInt(2, enteredPin);

        resultSet = preparedStatement.executeQuery();

        // If there is a match in the database, return true; otherwise, return false
        return resultSet.next();
    } catch (SQLException e) {
        throw new NewsagentExceptionHandler("Error during authentication: " + e.getMessage());
    } finally {
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//--------------------------------------------------- customerbook

public boolean updateCustomerBook(CustomerBook updatedBook) throws SQLException {
    boolean updateSuccessful = false;
    try (PreparedStatement preparedStatement = connect.prepareStatement("UPDATE CustomerBook SET Name = ?, Surname = ?, Home_Address = ?, Balance = ? WHERE Customer_ID = ?")) {
        preparedStatement.setString(1, updatedBook.getName());
        preparedStatement.setString(2, updatedBook.getSurname());
        preparedStatement.setString(3, updatedBook.getHomeAddress());
        preparedStatement.setDouble(4, updatedBook.getBalance());
        preparedStatement.setInt(5, updatedBook.getCustomerID());

        int rowsAffected = preparedStatement.executeUpdate();
        updateSuccessful = rowsAffected > 0;
    }

    return updateSuccessful;
}
public boolean customerBookExists(int customerID) {
    boolean exists = false;
    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM CustomerBook WHERE Customer_ID = ?")) {
        preparedStatement.setInt(1, customerID);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            exists = resultSet.next();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return exists;
}
public boolean insertCustomerBookDetails(CustomerBook book) throws SQLException, NewsagentExceptionHandler {
    String insertCustomerQuery = "INSERT INTO Customer (ID, Name, Phone_Num, Address, Order_Type, Name_of_Publication) VALUES (?, ?, ?, ?, ?, ?)";
    String insertCustomerBookQuery = "INSERT INTO CustomerBook (Customer_ID, Name, Surname, Home_Address, Balance) VALUES (?, ?, ?, ?, ?)";
    try (PreparedStatement insertCustomerStatement = connect.prepareStatement(insertCustomerQuery, Statement.RETURN_GENERATED_KEYS);
         PreparedStatement insertCustomerBookStatement = connect.prepareStatement(insertCustomerBookQuery)) {

        // Set parameters for the Customer table
        insertCustomerStatement.setInt(1, book.getCustomerID());  // Replace with the actual ID value
        insertCustomerStatement.setString(2, book.getName());
        insertCustomerStatement.setString(3, "");  // Replace with the actual phone number
        insertCustomerStatement.setString(4, book.getHomeAddress());
        insertCustomerStatement.setString(5, "");  // Replace with the actual order type
        insertCustomerStatement.setString(6, "");  // Replace with the actual name of publication

        // Execute the insert into the Customer table
        int affectedRowsCustomer = insertCustomerStatement.executeUpdate();

        if (affectedRowsCustomer == 0) {
            throw new SQLException("Creating customer failed, no rows affected.");
        }

        try (ResultSet generatedKeys = insertCustomerStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                int customerId = generatedKeys.getInt(1);

                // Now use customerId as the Customer_ID for the CustomerBook table
                insertCustomerBookStatement.setInt(1, customerId);
                insertCustomerBookStatement.setString(2, book.getName());
                insertCustomerBookStatement.setString(3, book.getSurname());
                insertCustomerBookStatement.setString(4, book.getHomeAddress());
                insertCustomerBookStatement.setDouble(5, book.getBalance());

                // Execute the insert into the CustomerBook table
                insertCustomerBookStatement.executeUpdate();

                return true;  // Both inserts were successful
            } else {
                throw new SQLException("Creating customer failed, no ID obtained.");
            }
        }
    }
}

public void printAllCustomerBookDetails() throws NewsagentExceptionHandler  {
    try {
        statement = connect.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM CustomerBook INNER JOIN Customer ON CustomerBook.Customer_ID = Customer.ID");
        System.out.println("CustomerBook Details:");

        while (resultSet.next()) {
            int customerID = resultSet.getInt("Customer_ID");
            String name = resultSet.getString("Name");
            String surname = resultSet.getString("Surname");
            String homeAddress = resultSet.getString("Home_Address");
            double balance = resultSet.getDouble("Balance");

            System.out.println("Customer_ID: " + customerID);
            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Home Address: " + homeAddress);
            System.out.println("Balance: " + balance);
            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // You might want to handle this exception more appropriately
        throw new NewsagentExceptionHandler("Error printing all customer book details");
    } finally {
        closeResources();
    }
}

public boolean deleteCustomerBookById(int customerID) throws NewsagentExceptionHandler {
    boolean deleteSuccessful = true;

    try {
        if (!customerBookExists(customerID)) {
            throw new SQLException("CustomerBook with Customer_ID " + customerID + " does not exist");
        }

        preparedStatement = connect.prepareStatement("DELETE FROM CustomerBook WHERE Customer_ID = ?");
        preparedStatement.setInt(1, customerID);
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected == 0) {
            throw new SQLException("CustomerBook not found for deletion");
        }
    } catch (SQLException e) {
        deleteSuccessful = false;
        e.printStackTrace();
        // You might want to handle this exception more appropriately
        throw new NewsagentExceptionHandler("Error deleting customer book");
    } finally {
        closeResources();
    }

    return deleteSuccessful;
}
public CustomerBook findCustomerBookById(int customerID) throws NewsagentExceptionHandler  {
    try (PreparedStatement preparedStatement = connect.prepareStatement("SELECT * FROM CustomerBook WHERE Customer_ID = ?")) {
        preparedStatement.setInt(1, customerID);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String name = resultSet.getString("Name");
            String surname = resultSet.getString("Surname");
            String homeAddress = resultSet.getString("Home_Address");
            double balance = resultSet.getDouble("Balance");
            int id = resultSet.getInt("Customer_ID");

            return new CustomerBook(customerID, name, surname, homeAddress, balance, id);
        }
    } catch (SQLException | NewsagentExceptionHandler e) {
        // Wrap the SQLException in CustomerExceptionHandler and include a meaningful error message
        throw new NewsagentExceptionHandler("Error finding customer book by ID: " + e.getMessage());
    } finally {
        closeResources();
    }

    return null;
}
private void closeResources() {
    try {
        if (resultSet != null) {
            resultSet.close();
        }
        if (statement != null) {
            statement.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


public void close() throws Exception {
    closeResources();
    if (connect != null) {
        connect.close();
    }
}


// ======================================================= Customer CRUD ======================================================= 


public boolean customerExists(int customerId) {
    boolean exists = false;
    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM customer WHERE id = ?")) {
        preparedStatement.setInt(1, customerId);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            exists = resultSet.next();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return exists;
}




public boolean insertCustomerDetailsAccount(Customer customer) {
    if (customerExists(customer.getId())) {
        System.out.println("Customer with ID " + customer.getId() + " already exists.");
        return false;
    }

    try (PreparedStatement preparedStatement = connect.prepareStatement("INSERT INTO customer (ID, Name, Address, Phone_Num) VALUES (?, ?, ?, ?)")) {
        preparedStatement.setInt(1, customer.getId());
        preparedStatement.setString(2, customer.getName());
        preparedStatement.setString(3, customer.getAddress());
        preparedStatement.setString(4, customer.getPhoneNumber());
        int rowsAffected = preparedStatement.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

public void printAllCustomerDetails() {
    try {
        statement = connect.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM Customer");
        System.out.println("Customer Details:");

        while (resultSet.next()) {
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("Name");
            String address = resultSet.getString("Address");
            String phoneNumber = resultSet.getString("Phone_Num");

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("--------------------");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        closeResources();
    }
}

public boolean deleteCustomer(int customerId) throws SQLException {
    boolean deleteSuccessful = true;

    try {
        if (!customerExistsById(customerId)) {
            throw new SQLException("Customer with ID " + customerId + " does not exist");
        }

        preparedStatement = connect.prepareStatement("DELETE FROM Customer WHERE ID = ?");
        preparedStatement.setInt(1, customerId);
        int rowsAffected = preparedStatement.executeUpdate();

        if (rowsAffected == 0) {
            throw new SQLException("Customer not found for deletion");
        }
    } catch (SQLException e) {
        deleteSuccessful = false;
        e.printStackTrace();
    } finally {
        closeResources();
    }

    return deleteSuccessful;
}

public boolean customerExistsById(int customerId) throws SQLException {
    boolean exists = false;
    try (PreparedStatement preparedStatement = connect.prepareStatement("SELECT * FROM customer WHERE id = ?")) {
        preparedStatement.setInt(1, customerId);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            exists = resultSet.next();
        }
    }

    return exists;
}

public Customer findCustomerById(int customerId) throws NewsagentExceptionHandler {
    try (PreparedStatement preparedStatement = connect.prepareStatement("SELECT * FROM Customer WHERE ID = ?")) {
        preparedStatement.setInt(1, customerId);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("ID");
            String name = resultSet.getString("Name");
            String address = resultSet.getString("Address");
            String phoneNumber = resultSet.getString("Phone_Num");

            return new Customer(id, name, address, phoneNumber);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        closeResources();
    }

    return null;
}

public boolean updateCustomer(Customer customer) throws SQLException {
    boolean updateSuccessful = false;
    try (PreparedStatement preparedStatement = connect.prepareStatement("UPDATE Customer SET Name = ?, Address = ?, Phone_Num = ? WHERE ID = ?")) {
        preparedStatement.setString(1, customer.getName());
        preparedStatement.setString(2, customer.getAddress());
        preparedStatement.setString(3, customer.getPhoneNumber());
        preparedStatement.setInt(4, customer.getId());

        int rowsAffected = preparedStatement.executeUpdate();
        updateSuccessful = rowsAffected > 0;
    }

    return updateSuccessful;
}

// ----------------------------------- Invoices ----------------------------------

//----------------------------------- CRUD for Invoice
public void insertInvoice88(Invoice invoice) {
    try (
        // Create a prepared statement with SQL
        PreparedStatement preparedStatement = connect.prepareStatement(
            "INSERT INTO newsagent.invoice (id, home_address, name, date_year, date_month, date_day, " +
            "time_hour, time_minute, balance, newspaperName, newspaperNumber, newsagentName, " +
            "successfulTickBox, unsuccessfulTickBox, returnedTickBox, customerPaid, total_amount, " +
            "deliveryAddress) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
        )
    ) {
        // Set the values for the prepared statement
        preparedStatement.setInt(1, invoice.getId());
        preparedStatement.setString(2, invoice.getHome_address());
        preparedStatement.setString(3, invoice.getName());
        preparedStatement.setInt(4, invoice.getDate()[0]); // Assuming date[0] is year
        preparedStatement.setInt(5, invoice.getDate()[1]); // Assuming date[1] is month
        preparedStatement.setInt(6, invoice.getDate()[2]); // Assuming date[2] is day
        preparedStatement.setInt(7, invoice.getTime()[0]); // Assuming time[0] is hour
        preparedStatement.setInt(8, invoice.getTime()[1]); // Assuming time[1] is minute
        preparedStatement.setDouble(9, invoice.getBalance());
        preparedStatement.setString(10, invoice.getNewspaperName());
        preparedStatement.setInt(11, invoice.getNewspaperNumber());
        preparedStatement.setString(12, invoice.getNewsagentName());
        preparedStatement.setBoolean(13, invoice.isSuccessfulTickBox());
        preparedStatement.setBoolean(14, invoice.isUnsuccessfulTickBox());
        preparedStatement.setBoolean(15, invoice.isReturnedTickBox());
        preparedStatement.setBoolean(16, invoice.isCustomerPaid());
        preparedStatement.setDouble(17, invoice.getTotal_amount());
        preparedStatement.setString(18, invoice.getHome_address());

        preparedStatement.executeUpdate();

        System.out.println("Invoice inserted successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

public void insertInvoice(Invoice invoice) {
 try (
     // Create a prepared statement with SQL
     PreparedStatement preparedStatement = connect.prepareStatement(
         "INSERT INTO invoice (id, home_address, name, date_year, date_month, date_day, " +
         "time_hour, time_minute, balance, newspaperName, newspaperNumber, newsagentName, " +
         "successfulTickBox, unsuccessfulTickBox, returnedTickBox, customerPaid, total_amount) " +
         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
     )
 ) {
     // Set the values for the prepared statement
     preparedStatement.setInt(1, invoice.getId());
     preparedStatement.setString(2, invoice.getHome_address());
     preparedStatement.setString(3, invoice.getName());
     preparedStatement.setInt(4, invoice.getDate()[0]); // Assuming date[0] is year
     preparedStatement.setInt(5, invoice.getDate()[1]); // Assuming date[1] is month
     preparedStatement.setInt(6, invoice.getDate()[2]); // Assuming date[2] is day
     preparedStatement.setInt(7, invoice.getTime()[0]); // Assuming time[0] is hour
     preparedStatement.setInt(8, invoice.getTime()[1]); // Assuming time[1] is minute
     preparedStatement.setDouble(9, invoice.getBalance());
     preparedStatement.setString(10, invoice.getNewspaperName());
     preparedStatement.setInt(11, invoice.getNewspaperNumber());
     preparedStatement.setString(12, invoice.getNewsagentName());
     preparedStatement.setBoolean(13, invoice.isSuccessfulTickBox());
     preparedStatement.setBoolean(14, invoice.isUnsuccessfulTickBox());
     preparedStatement.setBoolean(15, invoice.isReturnedTickBox());
     preparedStatement.setBoolean(16, invoice.isCustomerPaid());
     preparedStatement.setDouble(17, invoice.getTotal_amount());

     preparedStatement.executeUpdate();

     System.out.println("Invoice inserted successfully.");
 } catch (SQLException e) {
     e.printStackTrace();
 }
}

public void printAllInvoices() {
 try (
     // Create a statement
     Statement statement = connect.createStatement();

     // Execute the SQL query to retrieve all invoices
     ResultSet resultSet = statement.executeQuery("SELECT * FROM invoice")
 ) {
     // Iterate through the result set and print each invoice
     while (resultSet.next()) {
         int id = resultSet.getInt("id");
         String homeAddress = resultSet.getString("home_address");
         String name = resultSet.getString("name");
         int dateYear = resultSet.getInt("date_year");
         int dateMonth = resultSet.getInt("date_month");
         int dateDay = resultSet.getInt("date_day");
         int timeHour = resultSet.getInt("time_hour");
         int timeMinute = resultSet.getInt("time_minute");
         double balance = resultSet.getDouble("balance");
         String newspaperName = resultSet.getString("newspaperName");
         int newspaperNumber = resultSet.getInt("newspaperNumber");
         String newsagentName = resultSet.getString("newsagentName");
         boolean successfulTickBox = resultSet.getBoolean("successfulTickBox");
         boolean unsuccessfulTickBox = resultSet.getBoolean("unsuccessfulTickBox");
         boolean returnedTickBox = resultSet.getBoolean("returnedTickBox");
         boolean customerPaid = resultSet.getBoolean("customerPaid");
         double totalAmount = resultSet.getDouble("total_amount");

         // Print invoice details
         System.out.println("Invoice ID: " + id);
         System.out.println("Home Address: " + homeAddress);
         System.out.println("Name: " + name);
         System.out.println("Date: " + dateYear + "-" + dateMonth + "-" + dateDay);
         System.out.println("Time: " + timeHour + ":" + timeMinute);
         System.out.println("Balance: $" + balance);
         System.out.println("Newspaper Name: " + newspaperName);
         System.out.println("Newspaper Number: " + newspaperNumber);
         System.out.println("Newsagent Name: " + newsagentName);
         System.out.println("Successful Tick Box: " + successfulTickBox);
         System.out.println("Unsuccessful Tick Box: " + unsuccessfulTickBox);
         System.out.println("Returned Tick Box: " + returnedTickBox);
         System.out.println("Customer Paid: " + customerPaid);
         System.out.println("Total Amount: $" + totalAmount);

         System.out.println("---------------");
     }
 } catch (SQLException e) {
     e.printStackTrace();
 }
}

public boolean updateInvoiceDetails(Invoice invoice) throws SQLException {
 try {
     if (!isInvoiceIdExists(invoice.getId())) {
         throw new SQLException("Invoice with ID " + invoice.getId() + " does not exist. Cannot update.");
     }

     try (PreparedStatement preparedStatement = connect.prepareStatement(
             "UPDATE invoice SET home_address=?, name=?, date_year=?, date_month=?, date_day=?, " +
                     "time_hour=?, time_minute=?, balance=?, newspaperName=?, newspaperNumber=?, " +
                     "newsagentName=?, successfulTickBox=?, unsuccessfulTickBox=?, returnedTickBox=?, " +
                     "customerPaid=?, total_amount=? WHERE id=?"
     )) {
         // Set the values for the prepared statement
         preparedStatement.setString(1, invoice.getHome_address());
         preparedStatement.setString(2, invoice.getName());
         preparedStatement.setInt(3, invoice.getDate()[0]);
         preparedStatement.setInt(4, invoice.getDate()[1]);
         preparedStatement.setInt(5, invoice.getDate()[2]);
         preparedStatement.setInt(6, invoice.getTime()[0]);
         preparedStatement.setInt(7, invoice.getTime()[1]);
         preparedStatement.setDouble(8, invoice.getBalance());
         preparedStatement.setString(9, invoice.getNewspaperName());
         preparedStatement.setInt(10, invoice.getNewspaperNumber());
         preparedStatement.setString(11, invoice.getNewsagentName());
         preparedStatement.setBoolean(12, invoice.isSuccessfulTickBox());
         preparedStatement.setBoolean(13, invoice.isUnsuccessfulTickBox());
         preparedStatement.setBoolean(14, invoice.isReturnedTickBox());
         preparedStatement.setBoolean(15, invoice.isCustomerPaid());
         preparedStatement.setDouble(16, invoice.getTotal_amount());
         preparedStatement.setInt(17, invoice.getId());

         // Execute the update statement
         int rowsUpdated = preparedStatement.executeUpdate();

         if (rowsUpdated > 0) {
             System.out.println("Invoice with ID " + invoice.getId() + " updated successfully.");
             return true;
         } else {
             throw new SQLException("No invoice with ID " + invoice.getId() + " found for update.");
         }
     }
 } catch (SQLException e) {
     System.out.println("Error updating invoice: " + e.getMessage());
     throw e; // Rethrow the exception for the caller to handle
 }
}


public boolean isInvoiceIdExists(int invoiceId) throws SQLException {
 try (
     // Create a prepared statement with SQL to check if the ID exists
     PreparedStatement preparedStatement = connect.prepareStatement(
         "SELECT COUNT(*) FROM invoice WHERE id = ?"
     )
 ) {
     // Set the ID parameter in the prepared statement
     preparedStatement.setInt(1, invoiceId);

     // Execute the query
     ResultSet resultSet = preparedStatement.executeQuery();

     // Check if there is at least one row in the result set
     resultSet.next();
     int count = resultSet.getInt(1);

     return count > 0;
 }
}

public boolean deleteInvoice(int invoiceId) {
 boolean deleteSuccessful = false;
 try {
     if (isInvoiceIdExists(invoiceId)) {
         try (
             // Create a prepared statement with SQL for the delete
             PreparedStatement preparedStatement = connect.prepareStatement(
                 "DELETE FROM invoice WHERE id=?"
             )
         ) {
             // Set the value for the prepared statement
             preparedStatement.setInt(1, invoiceId);

             // Execute the delete statement
             int rowsDeleted = preparedStatement.executeUpdate();

             if (rowsDeleted > 0) {
                 System.out.println("Invoice with ID " + invoiceId + " deleted successfully.");
                 deleteSuccessful = true;
             } else {
                 System.out.println("No invoice with ID " + invoiceId + " found for deletion.");
             }
         }
     } else {
         System.out.println("Invoice with ID " + invoiceId + " does not exist. Cannot delete.");
     }
 } catch (SQLException e) {
     e.printStackTrace();
 }
 return deleteSuccessful;
}

@Override
public Invoice getInvoiceById(int invoiceId) throws SQLException {
 try (
     // Create a prepared statement with SQL to retrieve an invoice by ID
     PreparedStatement preparedStatement = connect.prepareStatement(
         "SELECT * FROM newsagent.invoice WHERE id = ?"
     )
 ) {
     // Set the ID parameter in the prepared statement
     preparedStatement.setInt(1, invoiceId);

     // Execute the query
     ResultSet resultSet = preparedStatement.executeQuery();

     // Check if there is at least one row in the result set
     if (resultSet.next()) {
         // Retrieve invoice details from the result set
         int id = resultSet.getInt("id");
         String homeAddress = resultSet.getString("home_address");
         String name = resultSet.getString("name");
         int dateYear = resultSet.getInt("date_year");
         int dateMonth = resultSet.getInt("date_month");
         int dateDay = resultSet.getInt("date_day");
         int timeHour = resultSet.getInt("time_hour");
         int timeMinute = resultSet.getInt("time_minute");
         double balance = resultSet.getDouble("balance");
         String newspaperName = resultSet.getString("newspaperName");
         int newspaperNumber = resultSet.getInt("newspaperNumber");
         String newsagentName = resultSet.getString("newsagentName");
         boolean successfulTickBox = resultSet.getBoolean("successfulTickBox");
         boolean unsuccessfulTickBox = resultSet.getBoolean("unsuccessfulTickBox");
         boolean returnedTickBox = resultSet.getBoolean("returnedTickBox");
         boolean customerPaid = resultSet.getBoolean("customerPaid");
         double totalAmount = resultSet.getDouble("total_amount");

         // Create and return an Invoice object
         return new Invoice(id, homeAddress, name, 
                            new int[] {dateYear, dateMonth, dateDay}, 
                            new int[] {timeHour, timeMinute}, 
                            balance, newspaperName, newspaperNumber, 
                            newsagentName, successfulTickBox, 
                            unsuccessfulTickBox, returnedTickBox, 
                            customerPaid, totalAmount);
     } else {
         // No invoice found with the given ID
         return null;
     }
 }

 }
// end Class


	
	// -------------------------- delivery driver CRUD  -----------------------------


	public boolean insertDeliveryDriverDetails(DeliveryDriver driver) {
	    boolean insertSuccessful = true;
	    try {
	        // Check if the ID already exists
	        if (!isDriverIdExists(driver.getId())) {
	            preparedStatement = connect.prepareStatement("INSERT INTO DeliveryDrivers (id, name, surname, phoneNumber, Address, pin, resetPinOptionVisible) VALUES (?, ?, ?, ?, ?, ?, ?)");

	            preparedStatement.setInt(1, driver.getId());
	            preparedStatement.setString(2, driver.getName());
	            preparedStatement.setString(3, driver.getSurname());
	            preparedStatement.setString(4, driver.getPhoneNumber());
	            preparedStatement.setString(5, driver.getAddress());
	            preparedStatement.setInt(6, driver.getPin());
	            preparedStatement.setBoolean(7, driver.isResetPinOptionVisible());

	            preparedStatement.executeUpdate();
	        } else {
	            System.out.println("DeliveryDriver with ID " + driver.getId() + " already exists.");
	            insertSuccessful = false;
	        }
	    } catch (Exception e) {
	        insertSuccessful = false;
	        e.printStackTrace();
	    }
	    return insertSuccessful;
	}

	public DeliveryDriver findDeliveryDriverById(int driverId) {
	    try {
	        // Check if the ID exists
	        if (isDriverIdExists(driverId)) {
	            preparedStatement = connect.prepareStatement("SELECT * FROM DeliveryDrivers WHERE id=?");
	            preparedStatement.setInt(1, driverId);
	            resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                String surname = resultSet.getString("surname");
	                String phoneNumber = resultSet.getString("phoneNumber");
	                String address = resultSet.getString("Address");
	                int pin = resultSet.getInt("pin");
	                boolean resetPinOptionVisible = resultSet.getBoolean("resetPinOptionVisible");

	                return new DeliveryDriver(id, name, surname, phoneNumber, address, pin, resetPinOptionVisible);
	            } else {
	                System.out.println("DeliveryDriver with ID " + driverId + " not found.");
	            }
	        } else {
	            System.out.println("DeliveryDriver with ID " + driverId + " does not exist.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}


public boolean isDriverIdExists(int driverId)  {
    try {
		preparedStatement = connect.prepareStatement("SELECT id FROM DeliveryDrivers WHERE id = ?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		preparedStatement.setInt(1, driverId);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		resultSet = preparedStatement.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    try {
		return resultSet.next();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} // Returns true if the ID exists
	return true;
}




public void retrieveAndPrintAllDeliveryDrivers() {
    try {
        statement = connect.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM DeliveryDrivers");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            String phoneNumber = resultSet.getString("phoneNumber");
            String address = resultSet.getString("Address");
            int pin = resultSet.getInt("pin");
            boolean resetPinOptionVisible = resultSet.getBoolean("resetPinOptionVisible");

            System.out.println("ID: " + id +
                    ", Name: " + name +
                    ", Surname: " + surname +
                    ", Phone Number: " + phoneNumber +
                    ", Address: " + address +
                    ", PIN: " + pin +
                    ", Reset Pin Option Visible: " + resetPinOptionVisible);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close the resources to prevent memory leaks
        try {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


public boolean updateDeliveryDriverDetails(DeliveryDriver driver) throws NewsagentExceptionHandler {
    boolean updateSuccessful = true;
    try {
        // Check if the ID exists before updating
        if (isDriverIdExists(driver.getId())) {
            preparedStatement = connect.prepareStatement("UPDATE DeliveryDrivers SET name=?, surname=?, phoneNumber=?, Address=?, pin=?, resetPinOptionVisible=? WHERE id=?");

            preparedStatement.setString(1, driver.getName());
            preparedStatement.setString(2, driver.getSurname());
            preparedStatement.setString(3, driver.getPhoneNumber());
            preparedStatement.setString(4, driver.getAddress());
            preparedStatement.setInt(5, driver.getPin());
            preparedStatement.setBoolean(6, driver.isResetPinOptionVisible());
            preparedStatement.setInt(7, driver.getId());

            preparedStatement.executeUpdate();
        } else {
            System.out.println("DeliveryDriver with ID " + driver.getId() + " does not exist. Cannot update.");
            updateSuccessful = false;
        }
    } catch (SQLException e) {
        updateSuccessful = false;
        e.printStackTrace();
    }
    return updateSuccessful;
}



public boolean deleteDeliveryDriverById(int driverId) {
    boolean deleteSuccessful = false;
    try {
        // Check if the ID exists before deleting
        if (isDriverIdExists(driverId)) {
            preparedStatement = connect.prepareStatement("DELETE FROM DeliveryDrivers WHERE id=?");
            preparedStatement.setInt(1, driverId);

            int rowsAffected = preparedStatement.executeUpdate();
            
            if (rowsAffected > 0) {
                deleteSuccessful = true;
            } else {
                System.out.println("Failed to delete DeliveryDriver with ID " + driverId + ".");
            }
        } else {
            System.out.println("DeliveryDriver with ID " + driverId + " does not exist. Cannot delete.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return deleteSuccessful;
}

////////////////////////////////////DeliveryArea///////////////////////
public boolean insertDeliveryAreaDetails(DeliveryArea area) {
boolean insertSuccessful = true;
try {
if (!isAreaIdExists(area.getIDNumber())) {
preparedStatement = connect.prepareStatement("INSERT INTO DeliveryAreas (IDNumber, areaName, numberOfCustomers) VALUES (?, ?, ?)");

preparedStatement.setInt(1, area.getIDNumber());
preparedStatement.setString(2, area.getAreaName());
preparedStatement.setInt(3, area.getNumberOfCustomers());

preparedStatement.executeUpdate();
} else {
System.out.println("DeliveryArea with ID " + area.getIDNumber() + " already exists.");
insertSuccessful = false;
}
} catch (SQLException e) {
insertSuccessful = false;
e.printStackTrace();
}
return insertSuccessful;
}

public DeliveryArea findDeliveryAreaById(int areaId) {
try {
if (isAreaIdExists(areaId)) {
preparedStatement = connect.prepareStatement("SELECT * FROM DeliveryAreas WHERE IDNumber=?");
preparedStatement.setInt(1, areaId);
resultSet = preparedStatement.executeQuery();

if (resultSet.next()) {
int id = resultSet.getInt("IDNumber");
String areaName = resultSet.getString("areaName");
int numberOfCustomers = resultSet.getInt("numberOfCustomers");

return new DeliveryArea(id, areaName, numberOfCustomers);
} else {
System.out.println("DeliveryArea with ID " + areaId + " not found.");
}
} else {
System.out.println("DeliveryArea with ID " + areaId + " does not exist.");
}
} catch (SQLException e) {
e.printStackTrace();
}
return null;
}

public boolean isAreaIdExists(int areaId) {
try {
preparedStatement = connect.prepareStatement("SELECT IDNumber FROM DeliveryAreas WHERE IDNumber = ?");
preparedStatement.setInt(1, areaId);
resultSet = preparedStatement.executeQuery();

return resultSet.next(); 
} catch (SQLException e) {
e.printStackTrace();
return false;
}
}

public void retrieveAndPrintAllDeliveryAreas() {
try {
statement = connect.createStatement();
resultSet = statement.executeQuery("SELECT * FROM DeliveryAreas");

while (resultSet.next()) {
int id = resultSet.getInt("IDNumber");
String areaName = resultSet.getString("areaName");
int numberOfCustomers = resultSet.getInt("numberOfCustomers");

System.out.println("ID: " + id +
", Area Name: " + areaName +
", Number of Customers: " + numberOfCustomers);
}
} catch (SQLException e) {
e.printStackTrace();
} finally {
try {
if (resultSet != null) resultSet.close();
if (statement != null) statement.close();
} catch (SQLException ex) {
ex.printStackTrace();
}
}
}

public boolean updateDeliveryAreaDetails(DeliveryArea area) {
boolean updateSuccessful = true;
try {
if (isAreaIdExists(area.getIDNumber())) 
	
	{
		preparedStatement = connect.prepareStatement("UPDATE DeliveryAreas SET areaName=?, numberOfCustomers=? WHERE IDNumber=?");
		preparedStatement.setString(1, area.getAreaName());
		preparedStatement.setInt(2, area.getNumberOfCustomers());
		preparedStatement.setInt(3, area.getIDNumber());
		preparedStatement.executeUpdate();
	} 
else {
	System.out.println("DeliveryArea with ID " + area.getIDNumber() + " does not exist. Cannot update.");
	updateSuccessful = false;
	}
} 
catch (SQLException e) 
{
	updateSuccessful = false;
	e.printStackTrace();
}
return updateSuccessful;
}

public boolean deleteDeliveryAreaById(int areaId) {
	
	boolean deleteSuccessful = false;
	try {
	if (isAreaIdExists(areaId)) {
		preparedStatement = connect.prepareStatement("DELETE FROM DeliveryAreas WHERE IDNumber=?");
		preparedStatement.setInt(1, areaId);
	
	int rowsAffected = preparedStatement.executeUpdate();
	
	if (rowsAffected > 0)
	{
		deleteSuccessful = true;
	} 
	else
	{
		System.out.println("Failed to delete DeliveryArea with ID " + areaId + ".");
	}
	} 
	else
	{
		System.out.println("DeliveryArea with ID " + areaId + " does not exist. Cannot delete.");
	}
	} 
	catch (SQLException e) {
		e.printStackTrace();
	}
	return deleteSuccessful;
	}
	@Override
	public boolean isDeliveryAreaIdExists(int areaId) {
		try 
		{
			preparedStatement = connect.prepareStatement("SELECT IDNumber FROM DeliveryAreas WHERE IDNumber = ?");
			preparedStatement.setInt(1, areaId);
			resultSet = preparedStatement.executeQuery();
		
		return resultSet.next(); 
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		
	return false;
		}
	}
	//-------------------------------------------   CRUD for Admin  --------------------------------------
	
	public boolean ifAdminIdExists(int idNumber) {
	 boolean exists = false;
	 try {
	     preparedStatement = connect.prepareStatement("SELECT id_number FROM admins WHERE id_number = ?");
	     preparedStatement.setInt(1, idNumber);
	     resultSet = preparedStatement.executeQuery();
	     exists = resultSet.next();
	 } catch (SQLException e) {
	     e.printStackTrace();
	 }
	 return exists;
	}
	//insertNewsagentDetails method
	public boolean insertAdminDetails(Admin admin) {
	 boolean insertSuccessful = true;
	 try {
	     if (!ifAdminIdExists(admin.getIdNumber())) {
	         preparedStatement = connect.prepareStatement("INSERT INTO admins (id_number, username, password) VALUES (?, ?, ?)");
	         preparedStatement.setInt(1, admin.getIdNumber());
	         preparedStatement.setString(2, admin.getUsername());
	         preparedStatement.setInt(3, admin.getPassword());
	         preparedStatement.executeUpdate();
	     } else {
	         System.out.println("Admin with ID " + admin.getIdNumber() + " already exists.");
	         insertSuccessful = false;
	     }
	 } catch (SQLException e) {
	     insertSuccessful = false;
	     e.printStackTrace();
	 }
	 return insertSuccessful;
	}
	public boolean updateAdminDetails(Admin admin) throws NewsagentExceptionHandler {
	 boolean updateSuccessful = true;
	 try {
	     // Check if the ID exists before updating
	     if (ifAdminIdExists(admin.getIdNumber())) {
	         preparedStatement = connect.prepareStatement("UPDATE admins SET username=?, password=? WHERE id_number=?");

	         preparedStatement.setString(1, admin.getUsername());
	         preparedStatement.setInt(2, admin.getPassword());

	         preparedStatement.executeUpdate();
	     } else {
	         // Throw an exception if the ID is not found
	         throw new NewsagentExceptionHandler("Admin with ID " + admin.getIdNumber() + " does not exist. Cannot update.");
	     }
	 } catch (SQLException e) {
	     updateSuccessful = false;
	     e.printStackTrace(); // You may log or handle the SQL exception as needed
	 }
	 return updateSuccessful;
	}



	public Admin getAdminById(int idNumber) throws NewsagentExceptionHandler {
	    Admin admin = null;
	    try {
	        preparedStatement = connect.prepareStatement("SELECT * FROM admins WHERE id_number = ?");
	        preparedStatement.setInt(1, idNumber);
	        resultSet = preparedStatement.executeQuery();

	        // Check if the result set contains a row
	        if (resultSet.next()) {
	            String adminName = resultSet.getString("username");
	            int password = resultSet.getInt("password");

	            admin = new Admin(adminName, idNumber, password);
	        } else {
	            // Admin with the given ID does not exist
	            throw new NewsagentExceptionHandler("Admin with ID " + idNumber + " not found.");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Log or return an indication of failure
	    } finally {
	        try {
	            if (resultSet != null) resultSet.close();
	            if (preparedStatement != null) preparedStatement.close();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }

	    return admin;
	}




	public void retrieveAndPrintAllAdmins() {
	 try {
	     statement = connect.createStatement();
	     resultSet = statement.executeQuery("SELECT * FROM admins");

	     while (resultSet.next()) {
	         int id = resultSet.getInt("id");
	         
	         String adminName = resultSet.getString("username");
	         int idNumber = resultSet.getInt("id_number");
	         int password = resultSet.getInt("password");

	         System.out.println("ID: " + id +
	                 ", Admin username: " + adminName +
	                 ", ID Number: " + idNumber +
	                 ", Password: " + password);
	     }
	 } catch (SQLException e) {
	     e.printStackTrace();
	 } finally {
	     // Close the resources to prevent memory leaks
	     try {
	         if (resultSet != null) resultSet.close();
	         if (statement != null) statement.close();
	     } catch (SQLException ex) {
	         ex.printStackTrace();
	     }
	 }
	}

	public boolean deleteAdminById(int idNumber) throws NewsagentExceptionHandler {
	 boolean deleteSuccessful = false;
	 try {
	     // Check if the ID exists before deleting
	     if (ifAdminIdExists(idNumber)) {
	         preparedStatement = connect.prepareStatement("DELETE FROM admins WHERE id_number=?");
	         preparedStatement.setInt(1, idNumber);
	         preparedStatement.executeUpdate();
	         deleteSuccessful = true;
	     } else {
	         // Throw an exception if the ID is not found
	         throw new NewsagentExceptionHandler("Admin with ID " + idNumber + " does not exist. Cannot delete.");
	     }
	 } catch (SQLException e) {
	     e.printStackTrace(); // You may log or handle the SQL exception as needed
	 }
	 return deleteSuccessful;
	}

	public boolean authenticateAdmin(String adminUsername, int enteredPin) throws NewsagentExceptionHandler {
	 Connection connection = null;
	 PreparedStatement preparedStatement = null;
	 ResultSet resultSet = null;

	 try {
	     String query = "SELECT * FROM admins WHERE username = ? AND password = ?";
	     connection = DriverManager.getConnection("jdbc:mysql://" + host + "/newsagent?" + "user=" + user + "&password=" + password);
	     preparedStatement = connection.prepareStatement(query);
	     preparedStatement.setString(1, adminUsername);
	     preparedStatement.setInt(2, enteredPin);

	     resultSet = preparedStatement.executeQuery();

	     // If there is a match in the database, return true; otherwise, return false
	     return resultSet.next();
	 } catch (SQLException e) {
	     throw new NewsagentExceptionHandler("Error during authentication: " + e.getMessage());
	 } finally {
	     try {
	         if (resultSet != null) resultSet.close();
	         if (preparedStatement != null) preparedStatement.close();
	         if (connection != null) connection.close();
	     } catch (SQLException e) {
	         e.printStackTrace();
	     }
	 }
	}
// ----------------------------------  Delivery docket CRUD  -------------------------
	
	
	
}

