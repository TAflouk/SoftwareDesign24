import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author taflouk
 *
 */
public class Receipt  {
	/**
	 * Receipt Class that is genrated by the Newsagent when a Customer pays the Monthly invoice here
	 * Attributes:
	 *  - customerName: str
		- idNumber: int
		- customerID
		- customerName: str
		- price: int
		- date: int[]
		- time: int[]
		- homeAddress: str
		- balance: int
		- publicationName: str
		- count: int
	returns: Receipt
	 */
	// -- CONSTANTS -- 
	
	private static int MAX_ID_NUMBER = 300; // cant be less than that 
	private static int MAX_DAY_OF_MONTH = 30 ; // days per month
	private static int MAX_HOUR = 60; // SECONDS/MINUTES/HOURS
	private static int MAX_PRICE;
	private static int CURRENT_YEAR = 2023;
	private static int MAX_BALANCE = 1000; // euro
	
	// -- INSTANCE VARIABLES --


	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private int customerID;
	private double price;
	private int[] date; // need to be fixed
	private int idNumber;
	private String customerName;
	private LocalDate localDate;
	private int[] time;
	private String homeAddress;
	private double balance;
	private String publicationName;
	// -- GLOBAL -- 
	private static  int receiptCounter; // Counter for the number of Reciept
	
	
	public Receipt(int idNumber, String customerName, int customerID, double price, int[] date, int[] time, String home, double balance, String publicationName, String name) 

	{
		this.idNumber = idNumber;
		this.customerName = customerName;
		this.customerID = customerID;
		this.price = price;
		this.date = date;
		this.time = time;
		this.homeAddress = home;
		this.balance = balance;
		this.publicationName = publicationName; // not done testing
		this.name = name;
		receiptCounter++;
	}
	public Receipt() 
	{
	}


	@Override
	public String toString() {
		return "Receipt [name=" + name + ", customerID=" + customerID + ", price=" + price + ", date="
				+ Arrays.toString(date) + ", idNumber=" + idNumber + ", customerName=" + customerName + ", time="
				+ Arrays.toString(time) + ", homeAddress=" + homeAddress + ", balance=" + balance + ", publicationName="
				+ publicationName + "]";
	}
	
	public static int getMAX_ID_NUMBER() {
		return MAX_ID_NUMBER;
	}
	
	public static void setMAX_ID_NUMBER(int mAX_ID_NUMBER) {
		MAX_ID_NUMBER = mAX_ID_NUMBER;
	}
	
	public static int getMAX_DAY_OF_MONTH() {
		return MAX_DAY_OF_MONTH;
	}
	public static void setMAX_DAY_OF_MONTH(int mAX_DAY_OF_MONTH) {
		MAX_DAY_OF_MONTH = mAX_DAY_OF_MONTH;
	}
	public static int getMAX_HOUR() {
		return MAX_HOUR;
	}
	public static void setMAX_HOUR(int mAX_HOUR) {
		MAX_HOUR = mAX_HOUR;
	}
	public static int getMAX_PRICE() {
		return MAX_PRICE;
	}
	public static void setMAX_PRICE(int mAX_PRICE) {
		MAX_PRICE = mAX_PRICE;
	}
	public static int getCURRENT_YEAR() {
		return CURRENT_YEAR;
	}
	public static void setCURRENT_YEAR(int cURRENT_YEAR) {
		CURRENT_YEAR = cURRENT_YEAR;
	}
	public static int getMAX_BALANCE() {
		return MAX_BALANCE;
	}
	public static void setMAX_BALANCE(int mAX_BALANCE) {
		MAX_BALANCE = mAX_BALANCE;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int[] getDate() {
		return date;
	}
	public void setDate(int[] date) {
		this.date = date;
	}
	public int[] getTime() {
		return time;
	}
	public void setTime(int[] time) {
		this.time = time;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPublicationName() {
		return publicationName;
	}
	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	public static int getReceiptCounter() {
		return receiptCounter;
	}
	public static void setReceiptCounter(int receiptCounter) {
		Receipt.receiptCounter = receiptCounter;
	}


	/* validate ID less that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 */
	public boolean validateIDnumber(int id) throws NewsagentExceptionHandler 
	{
		//throw new RuntimeException();
		if(id < 1 ) 
		{
			throw  new NewsagentExceptionHandler("You cannot enter a negative number");
		}
		if(id > MAX_ID_NUMBER)
		{
			throw  new NewsagentExceptionHandler("You cannot go over 300");
		}
		return 0 < id && MAX_ID_NUMBER >= id; 
	}
	/* validate Customer name.length() is grater than 0 and less than 20 and make sure its type
	 * args(None)
	 * retruns: bool
	 */
	public boolean validateCustomerName(String name) throws NewsagentExceptionHandler
	{
        if (name == null || name.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Customer name cannot be empty");
        }
        if (!name.matches("^[a-zA-Z -']+$")) {
            throw new NewsagentExceptionHandler("Customer name contains invalid characters");
        }
		if(name.length() <= 2)
		{
			throw new NewsagentExceptionHandler("Enter a valid name more than 2 letters");
		}
		
        if (name.length() > 12) {
            throw new NewsagentExceptionHandler("Customer name is too long");
        }
		return name.length() < 12 && name.matches("^[a-zA-Z -']+$") && name != null && !name.trim().isEmpty();
	}
	/* validate ID less that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 */
	public boolean validateCustomerID(int id) throws NewsagentExceptionHandler 
	{
		if(id < 1 ) 
		{
			throw  new NewsagentExceptionHandler("You cannot enter a negative number");
		}
		if(id > MAX_ID_NUMBER)
		{
			throw  new NewsagentExceptionHandler("You cannot go over 300");
		}
		return 0 < id && MAX_ID_NUMBER >= id; 
	}
	/* validate ID less that price than 0 and less than MAX_PRICE and make sure its type
	 * args(double)
	 * retruns: bool
	 */
	public boolean validatePrice(double price) throws NewsagentExceptionHandler 
	{
		if(price > 5.0 ) 
		{
			throw  new NewsagentExceptionHandler("Enter a valid price less or equal to 5");
		}
		if(price < 1.0)
		{
			throw  new NewsagentExceptionHandler("Enter a valid price greater than 0");
		}
		return 0 < price && 5.0 >= price; 

	}
	/* validate date grater than 0 and less than MAX_DAY_OF_MONTH and make sure its type
	 * args(None)
	 * retruns: bool
	 */
	public boolean validateDate(int[] date) throws NewsagentExceptionHandler 
	{
		if(date[0] < 1)
		{
			throw new NewsagentExceptionHandler("Enter a valid day, day cannot belwo 1");
		}
		if(date[1] < 1)
		{
			throw new NewsagentExceptionHandler("Enter a valid month, month cannot belwo 1");
		}
		if(date[2] < CURRENT_YEAR || date[2] > CURRENT_YEAR)
		{
			throw new NewsagentExceptionHandler("Enter a valid year under CURRENT date");
		}
		//------------------
		if(date[0] > 30)
		{
			throw new NewsagentExceptionHandler("Enter a valid day belwo 31");
		}
		if(date[1] > 12)
		{
			throw new NewsagentExceptionHandler("Enter a valid month belwo 12");
		}
		
		return true;
	}
	
	public boolean validatePublicationName(String name) throws NewsagentExceptionHandler
	{
        if (name == null || name.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Customer name cannot be empty");
        }
        if (!name.matches("^[a-zA-Z -']+$")) {
            throw new NewsagentExceptionHandler("Customer name contains invalid characters");
        }
		if(name.length() <= 2)
		{
			throw new NewsagentExceptionHandler("Enter a valid name more than 2 letters");
		}
		
        if (name.length() > 12) {
            throw new NewsagentExceptionHandler("Customer name is too long");
        }
		return name.length() < 12 && name.matches("^[a-zA-Z -']+$") && name != null && !name.trim().isEmpty();
		
	}
	
	public boolean validateDay(int day) throws NewsagentExceptionHandler {
	    LocalDate currentDate = LocalDate.now();

	    if (day < 1 || day > 31) {
	        throw new NewsagentExceptionHandler("Enter a valid day between 1 and 31");
	    }

	    // Assuming you want to ensure the entered day is not in the past
	    if (currentDate.getDayOfMonth() > day) {
	        throw new NewsagentExceptionHandler("Enter a valid day that is not in the past");
	    }

	    return true;
	}
	public boolean validateMonth(int month) throws NewsagentExceptionHandler {
	    LocalDate currentDate = LocalDate.now();

	    if (month < 1 || month > 12) {
	        throw new NewsagentExceptionHandler("Enter a valid month between 1 and 12");
	    }

	    // Assuming you want to ensure the entered month is not in the past
	    if (currentDate.getMonthValue() > month) {
	        throw new NewsagentExceptionHandler("Enter a valid month that is not in the past");
	    }

	    return true;
	}
	public boolean validateYear(int year) throws NewsagentExceptionHandler { // --------------------------=====================================--
	    LocalDate currentDate = LocalDate.now();

	    // Assuming you want to set a reasonable range for valid years
	    int minValidYear = 1900;
	    int maxValidYear = currentDate.getYear() + 10; // Adjust the range as needed

	    if (year < minValidYear || year > maxValidYear) {
	        throw new NewsagentExceptionHandler("Enter a valid year between " + minValidYear + " and " + maxValidYear);
	    }

	    return true;
	}
	
//	
//	public boolean validateDate(int[] date) throws NewsagentExceptionHandler {
//	    int day = date[0];
//	    int month = date[1];
//	    int year = date[2];
//
//	    // Check if the month is valid
//	    if (month < 1 || month > 12) {
//	        throw new NewsagentExceptionHandler("Enter a valid month between 1 and 12");
//	    }
//
//	    // Check if the day is valid based on the month
//	    int maxDay = LocalDate.of(year, month, 1).lengthOfMonth();
//	    if (day < 1 || day > maxDay) {
//	        throw new NewsagentExceptionHandler("Enter a valid day between 1 and " + maxDay);
//	    }
//
//	    // Check if the year is valid (you may want to adjust the range based on your requirements)
//	    int currentYear = LocalDate.now().getYear();
//	    if (year < currentYear) {
//	        throw new NewsagentExceptionHandler("Enter a valid year equal to or greater than the current year");
//	    }
//
//	    return true;
//	}
	/* validate date grater than 0 and less than MAX_HOUR and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateTime(int[] time) throws NewsagentExceptionHandler 
	{
		if(time[0] < 0)
		{
			throw new NewsagentExceptionHandler("Enter valid hours cannot be negative");
		}
		if(time[1] < 0)
		{
			throw new NewsagentExceptionHandler("Enter a valid minutes cannot be negative");
		}
		if(time[2] < 0)
		{
			throw new NewsagentExceptionHandler("Enter valid seconds cannot be negative");
		}
		if(time[0] > 24)
		{
			throw new NewsagentExceptionHandler("Enter valid hours belwo 24");
		}
		if(time[1] > 60)
		{
			throw new NewsagentExceptionHandler("Enter valid minutes belwo 60");
		}
		if(time[2] > 60)
		{
			throw new NewsagentExceptionHandler("Enter valid seconds belwo 60");
		}
		return true;
	}
	public boolean validateHours(int hour) throws NewsagentExceptionHandler {
	    assert hour >= 0 : "Hours cannot be negative";
	    assert hour <= 23 : "Hours should be below 24";

	    if (hour < 0) {
	        throw new NewsagentExceptionHandler("Enter valid hours, cannot be negative");
	    }
	    if (hour > 23) {
	        throw new NewsagentExceptionHandler("Enter valid hours, below 24");
	    }

	    return true;
	}
	public boolean validateMinutes(int minutes) throws NewsagentExceptionHandler {
	    assert minutes >= 0 : "Minutes cannot be negative";
	    assert minutes <= 59 : "Minutes should be below 60";

	    if (minutes < 0) {
	        throw new NewsagentExceptionHandler("Enter valid minutes, cannot be negative");
	    }
	    if (minutes > 59) {
	        throw new NewsagentExceptionHandler("Enter valid minutes, below 60");
	    }

	    return true;
	}
	/* validate Home address length is greater than 0 and less than 50 and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
//	public  boolean validateHomeAddress(int num1, String str1, int num2, String str2) throws NewsagentExceptionHandler {
//	    if (str1.trim().isEmpty() || str2.trim().isEmpty()) {
//	        throw new NewsagentExceptionHandler("Please Do not enter spaces ENTER VALID EIRCODE");
//	    }
//
//	    if (!str1.matches("^[a-zA-Z -']+$") || !str2.matches("^[a-zA-Z -']+$")) {
//	        throw new NewsagentExceptionHandler("Eircode contains invalid characters");
//	    }
//
//	    if (num1 < 0 || num2 < 0) {
//	        throw new NewsagentExceptionHandler("Enter a valid Eircode number over 0");
//	    }
//
//	    if (num1 > 99 || num2 > 99) {
//	        throw new NewsagentExceptionHandler("Enter a valid Eircode number below 100");
//	    }
//
//	    if (str1.length() > 2 || str2.length() > 2 || str1.length() < 2 || str2.length() < 2) {
//	        throw new NewsagentExceptionHandler("Enter a valid Eircode 2 Letters");
//	    }
//	    return true;
//	}
	
	public  boolean validateHomeAddress(String str1) throws NewsagentExceptionHandler {
	    if (str1.trim().isEmpty() || str1.trim().isEmpty()) {
	        throw new NewsagentExceptionHandler("Please Do not enter spaces ENTER VALID EIRCODE");
	    }
	    if (str1.length() > 2 || str1.length() < 2) {
	        throw new NewsagentExceptionHandler("Enter a valid Eircode 2 Letters");
	    }
	    if (!str1.matches("^[a-zA-Z -']+$")) {
	        throw new NewsagentExceptionHandler("Eircode contains invalid characters");
	    }


	    return true;
	}
	
	public  boolean validateHomeAddress(int num2) throws NewsagentExceptionHandler {


	    if ( num2 < 0) {
	        throw new NewsagentExceptionHandler("Enter a valid Eircode number belwo 0");
	    }

	    if (num2 > 99) {
	        throw new NewsagentExceptionHandler("Enter a valid Eircode number below 100");
	    }

	    return true;
	}
	/* validate balance length is greater than 0 and less than 3 month order and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateBalance(double balance) throws NewsagentExceptionHandler
	{// MAX_BALANCE
		if(balance < 1)
		{
			throw new NewsagentExceptionHandler("Enter valid number belwo 1");
		}
		if(balance > MAX_BALANCE)
		{
			throw new NewsagentExceptionHandler("Enter valid number over 1000");
		}
		return 0 < balance && balance < MAX_BALANCE;
		
	}
//	
//    public boolean updateReceiptDetails33() throws SQLException, NewsagentExceptionHandler {
//        boolean updateSuccessful = false;
//        Scanner scanner = new Scanner(System.in);
//        ReceiptUpdater updater = new MySQLAccess(); // Initialize the updater here
//
//        try {
//            System.out.print("Enter the Receipt ID to update: ");
//            int idToUpdate = scanner.nextInt();
//            ReceiptUpdater sql = new MySQLAccess();
//
//            if (sql.isReceiptIdExists(idToUpdate)) {
//                Receipt receiptFounded = sql.findReceiptById(idToUpdate);
//                System.out.println(receiptFounded);
//                System.out.println("What attribute do you want to change?");
//                System.out.println("1. All attributes");
//                System.out.println("2. Receipt Name");
//                System.out.println("3. Price ");
//                System.out.println("4. Date ");
//                System.out.println("5. Time ");
//                System.out.println("6. Customer Name ");
//                System.out.println("7. Home Address ");
//                System.out.println("8. balance ");
//                System.out.println("9. Publication Name ");
//                System.out.println("10. Publication Name ");
//                int choice;
//
//                while (true) {
//                    try {
//                        System.out.print("Enter your choice: ");
//                        choice = scanner.nextInt();
//                        if (choice >= 1 && choice <= 9) {
//                            break;
//                        } else {
//                            System.out.println("Invalid choice. Please enter a number between 1 and 9.");
//                        }
//                    } catch (InputMismatchException e) {
//                        System.out.println("Invalid input. Please enter a number.");
//                        scanner.nextLine();
//                    }
//                }
//
//                switch (choice) {
//                    case 2:
//                        System.out.println("Enter a new name:");
//                        String newName;
//                        while (true) {
//                            newName = scanner.next();
//                            try {
//                                this.validateCustomerName(newName);
//                                break;
//                            } catch (NewsagentExceptionHandler e) {
//                                System.out.println(e.getMessage());
//                                System.out.println("Enter a new name:");
//                            }
//                        }
//                        receiptFounded.setName(newName);
//                        break;
//
//                    case 3:
//                        System.out.println("Enter a new price:");
//                        int price;
//                        while (true) {
//                            try {
//                                price = scanner.nextInt();
//                                this.validatePrice(price);
//                                break;
//                            } catch (NewsagentExceptionHandler e) {
//                                System.out.println(e.getMessage());
//                                System.out.println("Enter a new price:");
//                            }
//                        }
//                        receiptFounded.setPrice(price);
//                        break;
//
//                    case 4:
//                        System.out.println("Enter a new day:");
//                        int newDay;
//                        while (true) {
//                            try {
//                                newDay = scanner.nextInt();
//                                this.validateDay(newDay);
//                                break;
//                            } catch (NewsagentExceptionHandler e) {
//                                System.out.println(e.getMessage());
//                                System.out.println("Enter a new day:");
//                            }
//                        }
//
//                        System.out.println("Enter a new month:");
//                        int newMonth;
//                        while (true) {
//                            try {
//                                newMonth = scanner.nextInt();
//                                this.validateMonth(newMonth);
//                                break;
//                            } catch (NewsagentExceptionHandler e) {
//                                System.out.println(e.getMessage());
//                                System.out.println("Enter a new month:");
//                            }
//                        }
//
//                        System.out.println("Enter a new year:");
//                        int newYear;
//                        while (true) {
//                            try {
//                                newYear = scanner.nextInt();
//                                this.validateYear(newYear);
//                                break;
//                            } catch (NewsagentExceptionHandler e) {
//                                System.out.println(e.getMessage());
//                                System.out.println("Enter a new year:");
//                            }
//                        }
//
//                        int[] newDate = {newDay, newMonth, newYear};
//                        receiptFounded.setDate(newDate);
//                        break;
//
//                    default:
//                        String attributeName = "yourAttributeName"; // Replace with the actual attribute name
//                        boolean updateSuccessfulAttribute = updateAttribute(attributeName, scanner, updater);
//
//                        if (updateSuccessfulAttribute) {
//                            System.out.println(attributeName + " updated successfully.");
//                        } else {
//                            System.out.println("Update failed for " + attributeName);
//                        }
//                        break;
//                }
//
//                System.out.println("After updating:");
//                sql.updateReceiptDetails(receiptFounded);
//                System.out.println(sql.findReceiptById(idToUpdate));
//                updateSuccessful = true;
//
//                if (updateSuccessful) {
//                    System.out.println("Receipt with ID " + idToUpdate + " updated successfully.");
//                } else {
//                    System.out.println("Update failed. Please check your input.");
//                }
//            } else {
//                System.out.println("Receipt with ID " + idToUpdate + " does not exist. Cannot update.");
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid ID.");
//        }
//
//        return updateSuccessful;
//    }
    public boolean createReceipt() throws NewsagentExceptionHandler {
        boolean createdSuccessfully = false;
        Scanner scanner = new Scanner(System.in);

        try {
            Receipt newReceipt = new Receipt();

            // ID
            System.out.print("Enter the Receipt ID: ");
            int id = scanner.nextInt();
            while (!validateIDnumber(id)) {
                System.out.print("Invalid ID. Please enter a valid ID: ");
                id = scanner.nextInt();
            }
            newReceipt.setIdNumber(id);

            // Consume the newline character
            scanner.nextLine();

            // Customer Name
            System.out.print("Enter the Customer Name: ");
            String customerName = scanner.nextLine();
            while (!validateCustomerName(customerName)) {
                System.out.print("Invalid Customer Name. Please enter a valid name: ");
                customerName = scanner.nextLine();
            }
            newReceipt.setCustomerName(customerName);

            // Consume the newline character
            //scanner.nextLine();

            // Customer ID
            System.out.print("Enter the Customer ID: ");
            int customerID = scanner.nextInt();
            while (!validateCustomerID(customerID)) {
                System.out.print("Invalid Customer ID. Please enter a valid ID: ");
                customerID = scanner.nextInt();
            }
            newReceipt.setCustomerID(customerID);

            // Price
            System.out.print("Enter the Price: ");
            double price = scanner.nextDouble();
            while (!validatePrice(price)) {
                System.out.print("Invalid Price. Please enter a valid price: ");
                price = scanner.nextDouble();
            }
            newReceipt.setPrice(price);

            // Date
            int[] date = new int[3];
            System.out.print("Enter the Day: ");
            date[0] = scanner.nextInt();
            System.out.print("Enter the Month: ");
            date[1] = scanner.nextInt();
            System.out.print("Enter the Year: ");
            date[2] = scanner.nextInt();
            while (!validateDate(date)) {
                System.out.print("Invalid Date. Please enter a valid date: ");
                System.out.print("Enter the Day: ");
                date[0] = scanner.nextInt();
                System.out.print("Enter the Month: ");
                date[1] = scanner.nextInt();
                System.out.print("Enter the Year: ");
                date[2] = scanner.nextInt();
            }
            newReceipt.setDate(date);

         // Time
            int[] time = new int[2];
            while (true) {
                try {
                    System.out.print("Enter the Hour: ");
                    int hour = scanner.nextInt();
                    validateHours(hour);
                    time[0] = hour;

                    System.out.print("Enter the Minute: ");
                    int minute = scanner.nextInt();
                    validateMinutes(minute);
                    time[1] = minute;

                    break; 
                } catch (NewsagentExceptionHandler e) {
                    System.out.println("Invalid Time. " + e.getMessage());
                    scanner.nextLine();
                }
            }
            newReceipt.setTime(time);

         // Home Address
            System.out.print("Enter the Home Address (Eircode from 2 letters): ");
            String homeAddress1 = scanner.nextLine().trim();
            int homeAddressNum1 = -1; 

            while (true) {
                try {
                    validateHomeAddress(homeAddress1);
                    
                    System.out.print("Enter the Home Address (Eircode from 0-99): ");
                    homeAddressNum1 = scanner.nextInt();
                    validateHomeAddress(homeAddressNum1);
                    break; // Break out of the loop if both parts are valid
                } catch (NewsagentExceptionHandler e) {
                    System.out.println("Invalid Home Address. " + e.getMessage());

                    // Handle the exception locally (optional)
                    // For example, you can print a message or take corrective action

                    // Reset values to re-enter the loop
                    homeAddress1 = scanner.nextLine().trim();
                }
            }
            String finalHomeAddress = homeAddress1 + "," + homeAddressNum1;

            // Balance
            System.out.print("Enter the Balance: ");
            double balance = scanner.nextDouble();
            while (!validateBalance(balance)) {
                System.out.print("Invalid Balance. Please enter a valid balance: ");
                balance = scanner.nextDouble();
            }
            newReceipt.setBalance(balance);

            // Publication Name
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter the Publication Name: ");
            String publicationName = scanner.nextLine();
            while (!validatePublicationName(publicationName)) {
                System.out.print("Invalid Publication Name. Please enter a valid name: ");
                publicationName = scanner.nextLine();
            }
            newReceipt.setPublicationName(publicationName);

            // Additional attributes if needed...

            // Print the created receipt
            System.out.println("Receipt Created:");
            System.out.println(newReceipt);;
            
            try {
				ReceiptUpdater receiptUpdater = new MySQLAccess();
				if(receiptUpdater.insertReceiptDetailsAccount(newReceipt))
				{
					createdSuccessfully = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

            // Optionally, you can save the receipt to a database or perform other actions

            
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        }

        return createdSuccessfully;
    }



	public boolean updateReceiptDetails() throws SQLException {
	    boolean updateSuccessful = false;
	    
	    Scanner scanner = new Scanner(System.in);
	    try {
	        System.out.print("Enter the Receipt ID to update: ");
	        int idToUpdate = scanner.nextInt();
	        
	        
	        ReceiptUpdater sql = new MySQLAccess();
	        
	        
	        if (sql.isReceiptIdExists(idToUpdate))
	        {
	            Receipt receiptFounded = sql.findReceiptById(idToUpdate);
	            System.out.println(receiptFounded);
	            System.out.println("What attribute do you want to change?");
	            System.out.println("1. All attributes");
	            System.out.println("2. Receipt Name");
	            System.out.println("3. Price ");
	            System.out.println("4. Date ");
	            System.out.println("5. Time ");
	            System.out.println("6. Customer Name ");
	            System.out.println("7. Home Address ");
	            System.out.println("8. balance ");
	            System.out.println("9. Publication Name ");
	            System.out.println("10. Back to Receipt menu");
	            int choice;
	            //boolean exit = false;
	            while (true) {
	                try {
	                    System.out.print("Enter your choice: ");
	                    choice = scanner.nextInt();
	                    if (choice >= 1 && choice <= 10) 
	                    {
	                        break;
	                    } 
	                    else 
	                    {
	                        System.out.println("Invalid choice. Please enter a number between 1 and 9.");
	                    }
	                } 
	                catch (InputMismatchException e) {
	                    System.out.println("Invalid input. Please enter a number.");
	                    scanner.nextLine(); 
	                }
	            }
	            switch (choice) {
	                case 2:
	                    System.out.println("Enter a new name:");
	                    String newName;
	                    while (true) {
	                        newName = scanner.next();
	                        try {
	                            this.validateCustomerName(newName);
	                            sql.updateReceiptDetails(receiptFounded);
	                            
	                            break; 
	                        } catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new name:");
	                        }
	                    }
	                    receiptFounded.setName(newName);
	                    break;
	                case 3:
	                    System.out.println("Enter a new price:");
	                    int price;
	                    while (true) {
	                        try
	                        {
	                            price = scanner.nextInt();
	                            this.validatePrice(price);
	                            sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } 
	                        catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new price:");
	                        }
	                    }
	                    receiptFounded.setPrice(price);
	                    break;
	                case 4:
	                    System.out.println("Enter a new day:");
	                    int newDay;
	                    while (true) {
	                        try {
	                            newDay = scanner.nextInt();
	                            this.validateDay(newDay);
	                            System.out.println("Enter a new month:");
	                            int newMonth = scanner.nextInt();
	                            this.validateMonth(newMonth);
	                            System.out.println("Enter a new year:");
	                            int newYear = scanner.nextInt();
	                            this.validateYear(newYear);
	                            int[] newDate = {newDay, newMonth, newYear};
	                            receiptFounded.setDate(newDate);
	                            sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } 
	                        catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new day:");
	                        }
	                    }
	                    break;
	                    
	                case 5:
	                    System.out.println("Enter a new hour:");
	                    int hour;
	                    while (true) {
	                        try {
	                            hour = scanner.nextInt();
	                            this.validateHours(hour);
	                            System.out.println("Enter a new minutes:");
	                            int minute = scanner.nextInt();
	                            this.validateMinutes(minute);
	                            int[] setTime = {hour, minute};
	                            receiptFounded.setTime(setTime);
	                            sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new hour:");
	                        }
	                    }
	                    break;
	                case 6:
	                    System.out.println("Enter a new name:");
	                    String customerName;
	                    while (true) {
	                        try {
	                        	customerName = scanner.nextLine();
	                        	this.validateCustomerName(customerName);
	                        	sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } 
	                        catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new name:");
	                        }
	                    }
	                    receiptFounded.setCustomerName(customerName);
	                    break;
	                case 7:
	                    String homeAddress;
	                    int homeAddressNum;
	                    String homeAddress2;
	                    int homeAddressNum2;
	                    String finalStr = "";

	                    System.out.println("Enter a new Eircode from 2 letters: ");
	                    while (true) {
	                        try {
	                            homeAddress = scanner.nextLine();
	                            this.validateHomeAddress(homeAddress);

	                            System.out.println("Enter a new Eircode (0-99): ");
	                            homeAddressNum = scanner.nextInt();
	                            scanner.nextLine(); // Consume the newline character
	                            this.validateHomeAddress(homeAddressNum);

	                            System.out.println("Enter a new Eircode from 2 letters again: ");
	                            homeAddress2 = scanner.nextLine();
	                            this.validateHomeAddress(homeAddress2);

	                            System.out.println("Again enter a new Eircode (0-99): ");
	                            homeAddressNum2 = scanner.nextInt();
	                            scanner.nextLine(); // Consume the newline character
	                            this.validateHomeAddress(homeAddressNum2);

	                            finalStr += homeAddress + "," + homeAddressNum + "," + homeAddress2 + "," + homeAddressNum2;
	                            sql.updateReceiptDetails(receiptFounded);

	                            break;
	                        } catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new home address:");
	                        }
	                    }
	                    receiptFounded.setHomeAddress(finalStr);
	                    break;
	                case 8:
	                    System.out.println("Enter a new balance:");
	                    double balance;
	                    while (true) {
	                        try {
	                        	balance = scanner.nextDouble();
	                            this.validateBalance(balance);
	                            sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } 
	                        catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new price:");
	                        }
	                    }
	                    receiptFounded.setBalance(balance);
	                    break;
	                case 9:
	                    System.out.println("Enter a new publication name:");
	                    String publicationName;
	                    scanner.nextLine(); // Consume the newline character
	                    while (true) {
	                        try {
	                            publicationName = scanner.nextLine();
	                            this.validatePublicationName(publicationName);
	                            sql.updateReceiptDetails(receiptFounded);
	                            break;
	                        } catch (NewsagentExceptionHandler e) {
	                            System.out.println(e.getMessage());
	                            System.out.println("Enter a new publication name:");
	                        }
	                    }
	                    receiptFounded.setPublicationName(publicationName);
	                    break;
	                case 10:
	                    System.out.println("Back to receipt menu");
	                    Menu m = new Menu(null);
	                    m.generateReceiptMenu();
	                    break;
	             default:
	                 System.out.println("Invalid choice. No attribute updated.");
	            }
	            System.out.println("After updating:");
	            sql.updateReceiptDetails(receiptFounded);
	            System.out.println(sql.findReceiptById(idToUpdate));
	            updateSuccessful = true;

	            if (updateSuccessful) {
	                System.out.println("Receipt with ID " + idToUpdate + " updated successfully.");
	            } else {
	                System.out.println("Update failed. Please check your input.");
	            }
	        } else {
	            System.out.println("Receipt with ID " + idToUpdate + " does not exist. Cannot update.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid ID.");
	    }
	    return updateSuccessful;
	}
//	  @FunctionalInterface
//	    private interface AttributeUpdater {
//	        String update() throws InputMismatchException;
//	    }
	private boolean updateAttribute(String attributeName, Scanner scanner, ReceiptUpdater updater) {
	    System.out.print("Do you want to update the " + attributeName + "? (y/n): ");
	    if (scanner.next().equalsIgnoreCase("y")) {
	        try {
	            System.out.print("Enter new " + attributeName + ": ");
	            int newValue = scanner.nextInt();	            
	            boolean updateSuccessful =  true;//updater(getIdNumber(), newValue);

	            if (updateSuccessful) {
	                System.out.println(attributeName + " updated to: " + newValue);
	            } else {
	                System.out.println("Update failed for " + attributeName);
	            }
	            return updateSuccessful;
	        } catch (InputMismatchException e) {
	            System.out.println("Invalid input. Update failed for " + attributeName);
	            scanner.nextLine(); // Consume the invalid input to prevent an infinite loop
	        }
	    }
	    return false;
	}
	public boolean deleteReceiptByID(int id ) throws SQLException 
	{
		Receipt receipt = new Receipt();
		Menu m = new Menu(null);
		Scanner sc = new Scanner(System.in);
        boolean validID = false;

        while (!validID) {
            try {
//                System.out.print("Enter a Valid Receipt ID: ");
//                int userInput = sc.nextInt();
                this.validateCustomerID(id);

                if (receipt.validateIDnumber(id)) {
                    ReceiptUpdater receiptUpdater = new MySQLAccess();
                    
                    
                    Receipt foundReceipt = receiptUpdater.findReceiptById(id);

                    if (foundReceipt != null) {
                        System.out.println(foundReceipt);
                        System.out.print("Are you sure you want to delete this receipt? (y/n): ");
                        String confirmationChoice = sc.next().toLowerCase();

                        if (confirmationChoice.equals("y")) {
                            if (receiptUpdater.deleteReceiptById(id)) {
                                m.simulateLoading("Loading", 3, 600);
                                
                                System.out.println("Receipt deleted successfully.");  // not deleted yet 
                            } else {
                                System.out.println("Error occurred while deleting the receipt.");
                            }
                            validID = true;
                        } else {
                            System.out.println("Deletion canceled.");
                            validID = true;
                        }
                    } else {
                        System.out.println("Receipt not found.");
                        System.out.print("Do you want to enter another ID? (y/n): ");
                        String retryChoice = sc.next().toLowerCase();

                        if (!retryChoice.equals("y")) {
                            validID = true;
                        }
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume the invalid input
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (NewsagentExceptionHandler e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Do you want to enter another ID? (y/n): ");
                String retryChoice = sc.next().toLowerCase();

                if (!retryChoice.equals("y")) {
                    validID = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		return true;
		
		
		
	}
	public void readReceipt(int id)
	{
		Menu m = new Menu(null);
		
		ReceiptUpdater r = null;
		try {
			r = new MySQLAccess();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Receipt receipt = new Receipt();
		Scanner sc = new Scanner(System.in);
		try {
			if(r.isReceiptIdExists(id)) 
			{
				Receipt res = r.findReceiptById(id);
				m.simulateLoading("Searching", 3, 500);
				System.out.println("Receipt with ID " + id + " found");
				System.out.println(res);
			}
			if(!r.isReceiptIdExists(id)) 
			{
				System.out.println("Receipt with ID " + id + " does not exist");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
