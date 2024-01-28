import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {
	private int idNumber;
	private String username;
	private int password;
	
	public Admin() {
		
	}
	
	public Admin(String username, int idNumber, int password) throws NewsagentExceptionHandler{
		
		try {
			validatePassword(password);
			validateUsername(username);
			validateIdNumber(idNumber);
		}
		catch(NewsagentExceptionHandler e) {
			throw e;
		}
		
		this.username = username;
		this.password = password;
		this.idNumber = idNumber;
	}
	
	public void validateIdNumber(int idNumber) throws NewsagentExceptionHandler{
		if (idNumber <= 0 || idNumber >= Integer.MAX_VALUE) {
			throw new NewsagentExceptionHandler("Please provide a valid id greater than 0");
		}
	}
	
	public boolean validateUsername(String name) throws NewsagentExceptionHandler {
        if (name == null) {
            throw new NewsagentExceptionHandler("Enter name cannot be null");
        }
        if (name.length() < 3) {
            throw new NewsagentExceptionHandler("Name is too short");
        }
        if (name.length() > 10) {
            throw new NewsagentExceptionHandler("Name is too long");
        }
        if (!name.matches("[a-zA-Z ]*")) {
            throw new NewsagentExceptionHandler("Invalid name");
        }
        return true;
	}
	
	public boolean validatePassword(int password) throws NewsagentExceptionHandler{
        try {
            String pinString = String.valueOf(password);
            
            if (!pinString.matches("\\d{4}")) {
                throw new NewsagentExceptionHandler("PIN must be exactly 4 digits");
            }

            this.password = password;
            return true;
        } catch (InputMismatchException e) {
            throw new NewsagentExceptionHandler("Invalid PIN format. Please enter a numeric value.");
        }
	}

	public int getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}
	
	public boolean createAdmin() throws NewsagentExceptionHandler {
		boolean result = false;
		boolean result2 = false;
		boolean result3 =  false;
		int id = 0;
		String idString = "";
		String username = "";
		int password = 0;
		String passwordStr = "";
		Scanner scanner = new Scanner(System.in);
		while(!result) {
			
	        System.out.println("Enter Admin username:");
	        username = scanner.nextLine();
	        
	        try {
	            validateUsername(username);
	            result =true;
	        }
	        catch(InputMismatchException e) {
	        	System.out.println("Enter a 4 digit pin for the password");
	        	
	        }
	        catch (NewsagentExceptionHandler e) {
	            System.out.println(e.getMessage());
	            result =  false;
	        }
	        
		}
	        while(!result2) {
		        System.out.println("Enter Admin password:");
		         passwordStr = scanner.next();
		        try {
		        	password = Integer.parseInt(passwordStr);
		            validatePassword(password);
		            result2 =true;
		        }
		        catch (NumberFormatException e) {
	                System.out.println("Enter a 4 digit pin for the password.");
	            }
		        catch(InputMismatchException e) {
		        	System.out.println("Enter a 4 digit pin for the password");
		        	
		        }
		        catch (NewsagentExceptionHandler e) {
		            System.out.println(e.getMessage());
		            result2 = false;
		        }
		        
	        }

	        while(!result3) {
		        System.out.println("Enter Admin id number:");
		         idString = scanner.next();
		        try {
		        	id = Integer.parseInt(idString);
		            validateIdNumber(id);
		            result3 =true;
		        }
		        catch (NumberFormatException e) {
	                System.out.println("Enter a 4 digit pin for the password.");
	            }
		        catch (NewsagentExceptionHandler e) {
		            
		            result3 =  false;
		        }
		        catch(InputMismatchException e) {
		        	System.out.println("Enter a positive integer for the id number");
		        	 scanner.nextLine();
		        }
	        }

	        
	        try {
				Admin admin = new Admin(username, id, password);
				AdminSQLInterface sql = new MySQLAccess();
				result = sql.insertAdminDetails(admin);
				if(result)
				{
					System.out.println("Created Successfully");
				}
			} catch (NewsagentExceptionHandler e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		
		return result;
		}
		
	
	public boolean updateAdmin() throws Exception {
        try {
        	AdminSQLInterface sql = new MySQLAccess();
            return sql.updateAdminDetails(this);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public void readAdmin(int id) throws NewsagentExceptionHandler
	{
	    try {
	        AdminSQLInterface sql = new MySQLAccess();

	        // Check if admin with the given ID exists
	        if (sql.ifAdminIdExists(id)) {
	            // Admin exists, retrieve and print the admin details
	            Admin admin = sql.getAdminById(id);
	            System.out.println(admin.toString());
	        } else {
	            // Admin does not exist, throw an exception
	            throw new NewsagentExceptionHandler("Admin with ID " + id + " does not exist.");
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Handle SQL exception appropriately, log or rethrow
	    } 
	}
	public void readAllAdmin() {
        
		try {
			AdminSQLInterface sql = new MySQLAccess();
			sql.retrieveAndPrintAllAdmins();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	public boolean deleteAdmin(int id) throws NewsagentExceptionHandler {
	       try {
	            AdminSQLInterface sql = new MySQLAccess();
	            return sql.deleteAdminById(id);
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	}

	@Override
	public String toString() {
		return "Admin [idNumber=" + idNumber + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
