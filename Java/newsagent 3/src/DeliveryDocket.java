

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author TAflouk
 * @Date 09-09-23
 * @LastModified 21-11-23
 * @Time 22:30
 */
public class DeliveryDocket 
{/**
	 * Receipt Class that is genrated by the Newsagent to the Delivery to start the work 
	 * Attributes:
	 	- docketName: str
		- idNumber: int
		- DriverId: int
		- items: ArrayList<>
		- statusOfSuccess: bool
		-  date: int[]
		- time: int[]
		- customerName: str
		- custAddress: str
		- price: int
		- publicationName
		- stateNumber: int
		- returnPublication: bool
		- deliveryID: int
		- customerID: int

	returns: DeliveryDocket
	 */
	// -- CONSTANTS -- 
	private static int MAX_PRICE = 5;
	private static double MAX_BALANCE = 300;
	private static int MAX_ID_NUMBER = 300;
	private static int MAX_NAME_LENGTH = 15;
	public static double getMAX_BALANCE() {
		return MAX_BALANCE;
	}
	private int driverIDnumebr;
	private String customerName;
	private int customerID;
	private int price;
	private int[] date;
	private int[] time;
	private int stateNumber;
	private String customerHomeAddress; // 
	private int customerBalance;
	private boolean statusOfSuccess;
	private boolean statusOfReturned;
	private String publicationName;
	private int docketIDNumber;
//	CREATE TABLE newsagent.DeliveryDockets (
//		    docketIDNumber INT PRIMARY KEY,
//		    driverIDnumebr INT,
//		    customerName VARCHAR(255),
//		    customerID INT,
//		    price INT,
//		    dateDay INT,
//		    dateMonth INT,
//		    dateYear INT,
//		    timeHour INT,
//		    timeMinute INT,
//		    stateNumber INT,
//		    customerHomeAddress VARCHAR(255),
//		    customerBalance INT,
//		    statusOfSuccess BOOLEAN,
//		    statusOfReturned BOOLEAN,
//		    publicationName VARCHAR(255)
//		);

	// -- GLOBAL --
	/* validate ID less that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public DeliveryDocket() 
	{

	}
	public static void setMAX_BALANCE(double mAX_BALANCE) {
		MAX_BALANCE = mAX_BALANCE;
	}
	private static int MAX_STATE_NUMBER = 50;	
	// -- INSTANCE VARIABLES --
	public DeliveryDocket(int docketIDNumber, int driverIDnumebr, String customerName, int customerID, int price,
			int[] date, int[] time, int stateNumber, String customerHomeAddress, int customerBalance,
			boolean statusOfSuccess, boolean statusOfReturned, String publicationName) {
		super();
		this.docketIDNumber = docketIDNumber;
		this.driverIDnumebr = driverIDnumebr;
		this.customerName = customerName;
		this.customerID = customerID;
		this.price = price;
		this.date = date;
		this.time = time;
		this.stateNumber = stateNumber;
		this.customerHomeAddress = customerHomeAddress;
		this.customerBalance = customerBalance;
		this.statusOfSuccess = statusOfSuccess;
		this.statusOfReturned = statusOfReturned;
		this.publicationName = publicationName;
	}

	

	@Override
	public String toString() {
		return "DeliveryDocket [docketIDNumber=" + docketIDNumber + ", driverIDnumebr=" + driverIDnumebr
				+ ", customerName=" + customerName + ", customerID=" + customerID + ", price=" + price + ", date="
				+ Arrays.toString(date) + ", time=" + Arrays.toString(time) + ", stateNumber=" + stateNumber
				+ ", customerHomeAddress=" + customerHomeAddress + ", customerBalance=" + customerBalance
				+ ", statusOfSuccess=" + statusOfSuccess + ", statusOfReturned=" + statusOfReturned
				+ ", publicationName=" + publicationName + "]";
	}
	public static int getMAX_PRICE() {
		return MAX_PRICE;
	}

	public static void setMAX_PRICE(int mAX_PRICE) {
		MAX_PRICE = mAX_PRICE;
	}

	public static int getMAX_ID_NUMBER() {
		return MAX_ID_NUMBER;
	}

	public static void setMAX_ID_NUMBER(int mAX_ID_NUMBER) {
		MAX_ID_NUMBER = mAX_ID_NUMBER;
	}

	public static int getMAX_NAME_LENGTH() {
		return MAX_NAME_LENGTH;
	}

	public static void setMAX_NAME_LENGTH(int mAX_NAME_LENGTH) {
		MAX_NAME_LENGTH = mAX_NAME_LENGTH;
	}

	public int getDocketIDNumber() {
		return docketIDNumber;
	}

	public void setDocketIDNumber(int docketIDNumber) {
		this.docketIDNumber = docketIDNumber;
	}

	public int getDriverIDnumebr() {
		return driverIDnumebr;
	}

	public void setDriverIDnumebr(int driverIDnumebr) {
		this.driverIDnumebr = driverIDnumebr;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
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

	public int getStateNumber() {
		return stateNumber;
	}

	public void setStateNumber(int stateNumber) {
		this.stateNumber = stateNumber;
	}

	public String getCustomerHomeAddress() {
		return customerHomeAddress;
	}

	public void setCustomerHomeAddress(String customerHomeAddress) {
		this.customerHomeAddress = customerHomeAddress;
	}

	public int getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(int customerBalance) {
		this.customerBalance = customerBalance;
	}

	public boolean isStatusOfSuccess() {
		return statusOfSuccess;
	}

	public void setStatusOfSuccess(boolean statusOfSuccess) {
		this.statusOfSuccess = statusOfSuccess;
	}

	public boolean isStatusOfReturned() {
		return statusOfReturned;
	}

	public void setStatusOfReturned(boolean statusOfReturned) {
		this.statusOfReturned = statusOfReturned;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}
	
	


	/* validate ID less that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(int)
	 * retruns: bool
	 * */
	
	public boolean validateDocketIDNumber(Integer id) throws NewsagentExceptionHandler 
	{
		String name = "Delivery Docket ";
        if (id == 0) 
        {
            throw new NewsagentExceptionHandler(name+"ID cannot be 0");
        } 
        if (id < 0) {
            throw new NewsagentExceptionHandler(name+"ID must be a positive number");
        } 
        if(id > MAX_ID_NUMBER) 
        {
            throw new NewsagentExceptionHandler(name+"ID must be less than or equal to " + MAX_ID_NUMBER);
        }
	return (id > 0 && id <= MAX_ID_NUMBER);
	}
	/* validate ID less that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateDriverIDnumebr(int id) throws NewsagentExceptionHandler 
	{
		String name = "Delivery Driver ";
        if (id == 0) 
        {
            throw new NewsagentExceptionHandler(name+"ID cannot be 0");
        } 
        if (id < 0)
        {
            throw new NewsagentExceptionHandler(name+"ID must be a positive number");
        } 
        if(id > MAX_ID_NUMBER) 
        {
            throw new NewsagentExceptionHandler(name+"ID must be less than or equal to " + MAX_ID_NUMBER);
        }
	return (id > 0 && id <= MAX_ID_NUMBER);
	}
	
	/* validate Customer name.length()  grater than 0 and less than 20 and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateCustomerName(String name) throws NewsagentExceptionHandler
	{
	    if (name.equals("")) 
	    {
	        throw new NewsagentExceptionHandler("Customer Name cannot be null");
	    }
	    name = name.trim();
	    if (name.isEmpty()) 
	    {
	        throw new NewsagentExceptionHandler("Customer Name cannot be empty");
	    }
	    if (name.length() > MAX_NAME_LENGTH) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with fewer than " + MAX_NAME_LENGTH + " characters");
	    }
	    // Check if the name contains only letters from 'a' to 'z'
	    if (!name.matches("^[a-zA-Z]*$")) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with only letters from 'a' to 'z'");
	    }
	    if (name.length() < 3) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with at least 3 letters");
	    }
	    return true;
	}
	
	/* validate ID that grater than 0 and less than MAX_ID_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateCustomerID(int id) throws NewsagentExceptionHandler 
	{
		String name = "Customer ";
        if (id == 0) 
        {
            throw new NewsagentExceptionHandler(name+"ID cannot be 0");
        } 
        if (id < 0)
        {
            throw new NewsagentExceptionHandler(name+"ID must be a positive number");
        } 
        if(id > MAX_ID_NUMBER) 
        {
            throw new NewsagentExceptionHandler(name+"ID must be less than or equal to " + MAX_ID_NUMBER);
        }
	return (id > 0 && id <= MAX_ID_NUMBER);
	}
	
	/* validate price that grater than MIN_PRICE and less than MAX_PRICE and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validatePrice(double price) throws NewsagentExceptionHandler 
	{
		// MAX_PRICE = 5;
        if (price == 0) 
        {
            throw new NewsagentExceptionHandler("Price cannot be 0");
        } 
        if (price < 0)
        {
            throw new NewsagentExceptionHandler("Price must be a positive number");
        } 
        if(price > MAX_PRICE) 
        {
            throw new NewsagentExceptionHandler("Price must be less than or equal to " + MAX_PRICE);
        }
		return price > 0 && price <= MAX_PRICE;
	}
	
	/* validate date that grater than 0 and less than MAX_DAY and make sure its type
	 * args(LocalDate)
	 * retruns: bool
	 * */
	public boolean validateDate(int[] date) throws NewsagentExceptionHandler {
	    LocalDate currentDate = LocalDate.now();
	    if (date.length != 3) {
	        throw new NewsagentExceptionHandler("Invalid time format. Expected an array of three integers: [day, month, year]");
	    }

	    if (date[0] < 1 || date[0] > 31) {
	        throw new NewsagentExceptionHandler("Day must be between 1 and 31");
	    }

	    if (date[1] < 1 || date[1] > 12) {
	        throw new NewsagentExceptionHandler("Month must be between 1 and 12");
	    }

	    if (date[2] < 1) {
	        throw new NewsagentExceptionHandler("Year must be a positive number");
	    }

	    if (date[0] != currentDate.getDayOfMonth() || date[1] != currentDate.getMonthValue() || date[2] != currentDate.getYear()) {
	        throw new NewsagentExceptionHandler("Please enter the current date: " + currentDate);
	    }

	    return true;
	}
//	public boolean validateDate(int[] date) throws NewsagentExceptionHandler 
//	{
//		
//		LocalDate localDate = null;
//		int currentDay = localDate.getDayOfMonth();
//		int currentMonth = localDate.getMonthValue();
//		int currentYear = localDate.getYear();
//		if(date[0] < 1)
//		{
//			throw new NewsagentExceptionHandler("Day must positive number");
//		}
//		if(date[0] > 31)
//		{
//			throw new NewsagentExceptionHandler("Day must less or equal to 12");
//		}
//		
//		if(date[1] > 12)
//		{
//			throw new NewsagentExceptionHandler("Month must be less than or equal to 12");
//		}
//		if(date[1] < 1)
//		{
//			throw new NewsagentExceptionHandler("Month must be positive  number");
//		}
//		
//		if(date[2] < 1)
//		{
//			throw new NewsagentExceptionHandler("Year must be positive  number");
//		}
//
//		if(date[0] != currentDay)
//		{
//			throw new NewsagentExceptionHandler("Please enter a valid day to match the current date " + localDate.getDayOfMonth());
//		}
//		if(date[1] != currentMonth)
//		{
//			throw new NewsagentExceptionHandler("Please enter a valid month to match the current date " + localDate.getMonthValue());
//		}	
//		if(date[2] != currentYear)
//		{
//			throw new NewsagentExceptionHandler("Please enter a valid year to match the current year date "+ localDate.getYear());
//		}
//	
//		return date[0] == localDate.getDayOfMonth() && date[1] == localDate.getMonthValue() && date[2] == localDate.getYear();
//		
//		
//	}
	
	/* validate time is grater than 0 and less than MAX_TIME and make sure its type
	 * args(int[])
	 * retruns: bool
	 * */
	public boolean validateTime(int[] time) throws NewsagentExceptionHandler {
	    if (time.length != 3) {
	        throw new NewsagentExceptionHandler("Invalid time format. Expected an array of three integers: [hour, minute, second]");
	    }

	    int hour = time[0];
	    int minute = time[1];
	    int second = time[2];

	    if (hour < 0 || hour > 23) {
	        throw new NewsagentExceptionHandler("Hour must be between 0 and 23");
	    }
	    if (minute < 0 || minute > 59) {
	        throw new NewsagentExceptionHandler("Minute must be between 0 and 59");
	    }
	    if (second < 0 || second > 59) {
	        throw new NewsagentExceptionHandler("Second must be between 0 and 59");
	    }
	    return true;
	}
	/* validate state number is grater than 0 and less than MAX_NUMBER and make sure its type
	 * args(int)
	 * retruns: bool
	 * */
	public boolean validateStateNumber(int stateNumber) throws NewsagentExceptionHandler {
	    if(stateNumber <= 0) 
	    {
	        throw new NewsagentExceptionHandler("State number must be greater than 0");
	    }

	    if(stateNumber > MAX_STATE_NUMBER)
	    {
	        throw new NewsagentExceptionHandler("State number must be less than " + MAX_STATE_NUMBER);
	    }
	    return stateNumber > 0 && stateNumber <= MAX_STATE_NUMBER;
	}
	
	public static int getMAX_STATE_NUMBER() {
		return MAX_STATE_NUMBER;
	}

	public static void setMAX_STATE_NUMBER(int mAX_STATE_NUMBER) {
		MAX_STATE_NUMBER = mAX_STATE_NUMBER;
	}

	
	/* validate Customer Home Address that grater than 0 and less than MAX_HOUSE_NUMBER and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	private void validateElement(String elementName, String value) throws NewsagentExceptionHandler {
	    
		if (value.isEmpty()) {
	        throw new NewsagentExceptionHandler("Invalid " + elementName + ". It should not be empty.");
	    }

	    if (value.contains(" ")) {
	        throw new NewsagentExceptionHandler("Invalid " + elementName + ". It should not contain spaces.");
	    }

	    if (value.length() > 40) {
	        throw new NewsagentExceptionHandler("Invalid " + elementName + ". It should have a length less than or equal to 40.");
	    }
		if (value.length() < 4) {
	        throw new NewsagentExceptionHandler("Invalid " + elementName + ". It should not be less than 4 letters.");
	    }


	    if (!value.matches("[a-zA-Z]+")) {
	        throw new NewsagentExceptionHandler("Invalid " + elementName + ". It should contain only letters (a-z or A-Z).");
	    }
	}
	public boolean validateCustomerHomeAddress(String address, String city, String country) throws NewsagentExceptionHandler {
	    validateElement("Address", address);
	    validateElement("City", city);
	    validateElement("Country", country);

	    // If all validations pass, return true
	    return true;
	}
	/* validate Customer Customer Balance  grater than 0 and less than MAX_BALANCE = (3 montho max * monthly price) and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateCustomerBalance(double balance) throws NewsagentExceptionHandler 
	{
        if (balance == 0) 
        {
            throw new NewsagentExceptionHandler("Balance cannot be 0");
        } 
		if(balance < 0)
		{
			throw new NewsagentExceptionHandler("Balance cannot be negative number.");
		}
		if(balance > MAX_BALANCE)
		{
			throw new NewsagentExceptionHandler("Balance cannot greater than " + MAX_BALANCE);
		}
		return balance < MAX_BALANCE && balance > 1;
	}
	/* validate Customer Status Of Success  to discuss
	 * args(None)
	 * retruns: bool
	 * */
//	public boolean validateCustomerStatusOfSuccess() 
//	{
//		throw new RuntimeException();
//	}
//	/* validate Customer Status Of Returned to discuss
//	 * args(None)
//	 * retruns: bool
//	 * */
//	public boolean validateCustomerStatusOfReturned() 
//	{
//		throw new RuntimeException();
//	}
	/* validate name is grater than 0 and less than MAX_NAME_LENGTH and make sure its type
	 * args(None)
	 * retruns: bool
	 * */
	public boolean validateCustomerPublicationName(String name) throws NewsagentExceptionHandler
	{

	    if (name.equals("")) 
	    {
	        throw new NewsagentExceptionHandler("Customer Name cannot be null");
	    }
	    name = name.trim();
	    if (name.isEmpty()) 
	    {
	        throw new NewsagentExceptionHandler("Customer Name cannot be empty");
	    }
	    if (name.length() > MAX_NAME_LENGTH) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with fewer than " + MAX_NAME_LENGTH + " characters");
	    }
	    // Check if the name contains only letters from 'a' to 'z'
	    if (!name.matches("^[a-zA-Z]*$")) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with only letters from 'a' to 'z'");
	    }
	    if (name.length() < 3) 
	    {
	        throw new NewsagentExceptionHandler("Enter a valid name with at least 3 letters");
	    }
	    return true;
		
	}
}
