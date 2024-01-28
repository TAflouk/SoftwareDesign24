import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author taflouk
 * @Date: 26-10-23 @Time:7:40
 * @LastModified: 26-10-23 @Time:7:80
 */
public class Publication {
	/** 
	 *  - title: str
		- idNumber: int
		- price:int
		- author:str
		- freq: int
		- count: int
		- customerID: int
		
	 */
	// -- CONSTANTS -- 
	final static int MAX = 9000;
	final static int MIN = 0;
	final static  int MAX_PRICE = 5;
	final static int MAX_ID_NUMBER = 300;
	// -- INSTANCE VARIABLES --
	private String title;
	private int idNumber;
	private double price;
	private String author;
	private String frequency;
	// -- GLOBAL --
	private static  int publicationCounter; // Counter for the number of publication
	
	//private int customerID;
	
	
	public Publication() 
	{
	}
	
	public Publication(String title, int idNumber, double price, String author, String frequncy) 
	{		
		this.title = title;
		this.idNumber = idNumber;
		this.price = price;
		this.author = author;
		this.frequency = frequncy;
		publicationCounter++;
		
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getFrequncy() {
		return this.frequency;
	}

	public void setFrequency(String setFrequency) {
		this.frequency = setFrequency;
	}

	public static int getPublicationCounter() {
		return publicationCounter;
	}

	public static void setPublicationCounter(int publicationCounter) {
		Publication.publicationCounter = publicationCounter;
	}

	public static int getMax() {
		return MAX;
	}

	public static int getMin() {
		return MIN;
	}

	public static int getMaxPrice() {
		return MAX_PRICE;
	}

	
	/* validate title less that grater than 0 and less than 10 and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateTitle(String str) throws NewsagentExceptionHandler
	{
        if (!str.matches("^[a-zA-Z -']+$")) {
            throw new NewsagentExceptionHandler("Customer name contains invalid characters");
        }
		if(str.equals(""))
		{
			throw new NewsagentExceptionHandler("Title cannot be empty");
		}
	    if (str.trim().isEmpty()) 
	    {
	        throw new NewsagentExceptionHandler("No spaces enter valid Title.");
	    }
		if(str.length() > 10)
		{
			throw new NewsagentExceptionHandler("Title is too long");
		}
		if(str.length() < 4)
		{
			throw new NewsagentExceptionHandler("Title is too short");
		}
		return !str.equals("") && str.length() < 10 && !str.trim().isEmpty();
		
		//throw new RuntimeException();
	}
	
	
	/* validate title less that grater than 0 and less than MAX int and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateIDNumber(int id) throws NewsagentExceptionHandler
	{
		try {
			if(id < 1 ) 
			{
				throw  new NewsagentExceptionHandler("You cannot enter a negative number");
			}
			if(id > MAX_ID_NUMBER)
			{
				throw  new NewsagentExceptionHandler("You cannot go over 300");
			}
		}
		catch (NumberFormatException e) {
	        throw new NewsagentExceptionHandler("Invalid input. Please enter a valid ID number.");
	    }

		return 0 < id && MAX_ID_NUMBER >= id; 
	}
	/* validate Author length (instaance class) that grater than 0 and less than 20 int and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateAuthor(String str) throws NewsagentExceptionHandler
	{
		if(str.equals(""))
		{
			throw new NewsagentExceptionHandler("Author Cannot be empty");
		}
		if(str.length() > 10)
		{
			throw new NewsagentExceptionHandler("Author is too long");
		}
		if(str.length() < 3)
		{
			throw new NewsagentExceptionHandler("Author is too short");
		}
		return !str.equals("") && str.length() < 10;
		
	}
	/* validate title less that grater than 0 and less than MAX_PRICE price int and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validatePrice(double price) throws NewsagentExceptionHandler
	{
		if(price > MAX_PRICE ) 
		{
			throw  new NewsagentExceptionHandler("Enter a valid price less or equal to 5");
		}
		if(price < 1.0)
		{
			throw  new NewsagentExceptionHandler("Enter a valid price greater than 0");
		}
		return 0 < price && 5.0 >= price; 
	}
	/* validate title less that(daily, weekly, monthly)
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateFrequency(String str)throws NewsagentExceptionHandler
	{

		if(str.toLowerCase().equals("") || str == null)
		{
			throw new NewsagentExceptionHandler("Please do not enter an EMPTY day");
		}
	    
	    if (str.trim().isEmpty()) 
	    {
	        throw new NewsagentExceptionHandler("Frequency cannot be empty");
	    }
	    String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	    boolean valid = false;
	    for (String day : weekdays)
	    {
	        if (str.toLowerCase().equals(day.toLowerCase())) 
	        {
	            valid = true;
	            break; // Day is found, exit the loop
	        }
	    }
	    if (!valid) 
	    {
	        throw new NewsagentExceptionHandler("Enter one of the following days \"Monday\", \"Tuesday\", \"Wednesday\", \"Thursday\", \"Friday\", \"Saturday\", \"Sunday\"");
	    }

	    return valid;
		    
		}
	
	public boolean createPublication(Publication newPublication)  {
		boolean results = false;
		try {
			PublicationInterface  i = new MySQLAccess();
			if(i.insertPublicationDetails(newPublication))
			{
				results = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			results = false;
			e.printStackTrace();
		}
	        return results;
	}
	public Publication createPublication2(Publication newPublication, Scanner scanner) throws NewsagentExceptionHandler {
	    try {
	        System.out.println("Enter title:");
	        String titleInput = scanner.nextLine();
	        newPublication.validateTitle(titleInput);
	        newPublication.setTitle(titleInput);

	        System.out.println("Enter ID number:");
	        int id = scanner.nextInt();
	        newPublication.validateIDNumber(id);
	        newPublication.setIdNumber(id);
	        scanner.nextLine();  // Consume the newline character

	        System.out.println("Enter price:");
	        double price = scanner.nextDouble();
	        newPublication.validatePrice(price);
	        newPublication.setPrice(price);
	        scanner.nextLine();  // Consume the newline character

	        System.out.println("Enter author:");
	        String author = scanner.nextLine();
	        newPublication.validateAuthor(author);
	        newPublication.setAuthor(author);
	        //scanner.nextLine();  // Consume the newline character

	        System.out.println("Enter frequency:");
	        String frequency = scanner.nextLine();
	        newPublication.validateFrequency(frequency);
	        newPublication.setFrequency(frequency);

	        return newPublication;
	    } catch (InputMismatchException e) {
	        throw new NewsagentExceptionHandler("Invalid input. Please enter valid information.");
	    } catch (NewsagentExceptionHandler e) {
	        throw new NewsagentExceptionHandler("Error: " + e.getMessage());
	    }
	}

	
	public Publication updatePublication(Publication newPublication, Scanner scanner) throws SQLException {
	    boolean exit = false;
	    Menu m = new Menu(null);
	    PublicationInterface updater = new MySQLAccess();

	    System.out.println("Enter a valid existing ID: ");
	    int id = 0;
	    while (true) {
	        try {
	            id = scanner.nextInt();
	            try {
					this.validateIDNumber(id);
				} catch (NewsagentExceptionHandler e) {

					e.printStackTrace();
				}
	            if (updater.isPublicationIdExists(id)) {
	                break; // Exit the loop if ID is valid and exists
	            } else {
	                System.out.println("Publication with ID " + id + " does not exist. Enter a valid ID: ");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a valid ID number.");
	            scanner.nextLine(); // Clear the scanner buffer
	        }
	    }

	    scanner.nextLine(); // Consume the newline character left in the buffer

	    while (!exit) {
	        System.out.println("\nYou are updating Publication:\n");
	        System.out.println("\t1. Reset title");
	        System.out.println("\t2. Reset idNumber");
	        System.out.println("\t3. Reset price");
	        System.out.println("\t4. Reset author");
	        System.out.println("\t5. Reset frequency");
	        System.out.println("\t7. Back\n");

	        System.out.print("Enter your choice: ");
	        try {
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character left in the buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter new title: ");
	                    String title = scanner.nextLine();
	                    this.validateTitle(title);
	                    newPublication.setTitle(title);
	        	    	m.simulateLoading("Updating", 3, 500);
	                    System.out.println("Updated successfully.");
	                    break;

	                case 2:
	                    System.out.print("Enter new idNumber: ");
						int newIdNumber = scanner.nextInt();
						
						if(this.validateIDNumber(newIdNumber)) {
							newPublication.setIdNumber(newIdNumber);
							updater.updatePublicationDetails(newPublication);
		        	    	m.simulateLoading("Updating", 3, 500);

							System.out.println("Updated successfully.");
						}
	                    break;

	                case 3:
	                    System.out.print("Enter new price: ");
	                    double newPrice = scanner.nextDouble();
	                    
	                    
	                    
						if(this.validatePrice(newPrice)) 
						{
							newPublication.setPrice(newPrice);
							updater.updatePublicationDetails(newPublication);
		        	    	m.simulateLoading("Updating", 3, 500);

							System.out.println("Updated successfully.");
						}
	                    break;

	                case 4:
	                    System.out.print("Enter new author: ");
	                    scanner.nextLine(); // Consume the newline character left in the buffer
	                    String author = scanner.nextLine();
	                    newPublication.setAuthor(author);
	                    
						if(this.validateAuthor(author)) 
						{
							newPublication.setAuthor(author);
							updater.updatePublicationDetails(newPublication);
		        	    	m.simulateLoading("Updating", 3, 500);

							System.out.println("Updated successfully.");
						}
	                    break;

	                case 5:
	                    System.out.print("Enter new frequency: ");
	                    scanner.nextLine(); // Consume the newline character left in the buffer
	                    String newFrequency = scanner.nextLine();
	                    
	                    
	                    
						if(this.validateFrequency(newFrequency)) 
						{
							newPublication.setFrequency(newFrequency);
							updater.updatePublicationDetails(newPublication);
		        	    	m.simulateLoading("Updating", 3, 500);

							System.out.println("Updated successfully.");
						}
	                    break;

	                case 7:
	                    System.out.println("Back.");
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Please enter a valid choice.");
	            scanner.nextLine(); // Clear the scanner buffer
	            
	            
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred. Please try again.");
	            scanner.nextLine(); // Clear the scanner buffer
	        }
	    }

	    return newPublication;
	}
	
	public boolean deletePublication(Publication publication,int id) throws SQLException 
	
	{Menu m = new Menu(null);
		boolean results = false;
		PublicationInterface updater = null;
	    try {
	    	updater = new MySQLAccess();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	    if(updater.isPublicationIdExists(id))
	    	
	    {
	    	m.simulateLoading("searching", 3, 500);
	    	System.out.println("Publication "+ id + " deleted successfully");
	    	}
	    else
	    {
	    	System.out.println("Publication "+ id+ " does not exist");
	    }

	    return false;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Publication [title=" + title + ", idNumber=" + idNumber + ", price=" + price + ", author=" + author
				+ ", frequency=" + frequency + "]";
	}

	public void readPublication() throws SQLException 
	
	{
		Menu m = new Menu(null);
		Publication publication = new Publication();
		Scanner in = new Scanner(System.in);
		boolean results = false;
		PublicationInterface updater = null;
	    try {
	    	updater = new MySQLAccess();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    System.out.println("Enter a valid id");
	    int id = in.nextInt();
	    
	    if(updater.isPublicationIdExists(id))
	    {
	    	m.simulateLoading("searching", 3, 500);
	    	publication = updater.findPublicationById(id);
	    	
	    	System.out.println("Publication with"+ id + " found");
	    	System.out.println(publication);
	    }
	    else
	    {
	    	System.out.println("Publication "+ id+ " does not exist");
	    }
		
	}



}
	


	


