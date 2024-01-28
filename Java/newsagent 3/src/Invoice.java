import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;



public class Invoice {
    private String city;
    private String country;
    private int id;
    private String home_address;
    private String name;
    private int[] date;
    private int[] time;
    private double balance;
    private String newspaperName;
    private int newspaperNumber;
    private String newsagentName;
    private boolean successfulTickBox;
    private boolean unsuccessfulTickBox;
    private boolean returnedTickBox;
    private boolean customerPaid;
    private double total_amount;

	public Invoice(int id, String home_address, String name, int[] date, int[] time, double balance,
			String newspaperName, int newspaperNumber, String newsagentName, boolean successfulTickBox,
			boolean unsuccessfulTickBox, boolean returnedTickBox, boolean customerPaid, double total_amount) {
		super();
		this.id = id;
		this.home_address = home_address;
		this.name = name;
		this.date = date;
		this.time = time;
		this.balance = balance;
		this.newspaperName = newspaperName;
		this.newspaperNumber = newspaperNumber;
		this.newsagentName = newsagentName;
		this.successfulTickBox = successfulTickBox;
		this.unsuccessfulTickBox = unsuccessfulTickBox;
		this.returnedTickBox = returnedTickBox;
		this.customerPaid = customerPaid;
		this.total_amount = total_amount;
	}
	public Invoice() {

	}

	
	public boolean validateBalance(double num)  throws NewsagentExceptionHandler
	{
		return true;
	}
    public boolean validateId(int id) throws NewsagentExceptionHandler {
        if (id < 1) {
            throw new NewsagentExceptionHandler("Enter valid id over 0");
        }
        if (id > 300) {
            throw new NewsagentExceptionHandler("Please enter a valid number below 300");
        }
        return id > 0 && id <= 300;
    }

    public boolean validateDeliveryDriverName(String name) throws NewsagentExceptionHandler {
        if (name == null || name.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Delivery driver name cannot be empty");
        }
        if (!name.matches("^[a-zA-Z -']+$")) {
            throw new NewsagentExceptionHandler("Delivery driver name contains invalid characters");
        }
        if (name.length() > 50) {
            throw new NewsagentExceptionHandler("Delivery driver name is too long");
        }
        return true;
    }

    public boolean validateCustomerName(String name) throws NewsagentExceptionHandler {
        if (name == null || name.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Customer name cannot be empty");
        }
        if (!name.matches("^[a-zA-Z -']+$")) {
            throw new NewsagentExceptionHandler("Customer name contains invalid characters");
        }
        if (name.length() > 50) {
            throw new NewsagentExceptionHandler("Customer name is too long");
        }
        return true;
    }
    
    public boolean validateHomeAddress(String address, String city, String country) throws NewsagentExceptionHandler {
        if (address == null || address.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Home address cannot be empty");
        }
        if (city == null || city.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("City address cannot be empty");
        }
        if (country == null || country.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Country address cannot be empty");
        }

        if (address.length() > 50) {
            throw new NewsagentExceptionHandler("Home address is too long");
        }
        if (city.length() > 50) {
            throw new NewsagentExceptionHandler("City address is too long");
        }
        if (country.length() > 50) {
            throw new NewsagentExceptionHandler("Country address is too long");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Home address cannot be empty");
        }
        if (city == null || city.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("City address cannot be empty");
        }
        if (country == null || country.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Country address cannot be empty");
        }

        if (address.length() > 50 || city.length() > 50 || country.length() > 50) {
            throw new NewsagentExceptionHandler("One of the address components is too long");
        }
        // Use the getCity() and getCountry() methods


        //this.validateHomeAddress(address, city, country);

        return true;
    }
    public boolean validateDate(int[] date) throws NewsagentExceptionHandler {
        int year = date[0];
        int month = date[1];
        int day = date[2];

        if (year < 1 || year > 9999) {
            throw new NewsagentExceptionHandler("Invalid year");
        }
        if (month < 1 || month > 12) {
            throw new NewsagentExceptionHandler("Invalid month");
        }
        
        if (day < 1 || day > 31) {
            throw new NewsagentExceptionHandler("Invalid day");
        }

        // Validate the entered date further
        if (!isValidDate(year, month, day)) {
            throw new NewsagentExceptionHandler("Invalid date");
        }

        return true;
    }

    private boolean isValidDate(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }


    private int getDaysInMonth(int year, int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    public boolean validateTime(int[] time) throws NewsagentExceptionHandler {
        int hour = time[0];
        int minute = time[1];

        if (hour < 0 || hour > 23) {
            throw new NewsagentExceptionHandler("Invalid hour");
        }
        if (minute < 0 || minute > 59) {
            throw new NewsagentExceptionHandler("Invalid minute");
        }


        return true;
    }
    public boolean validateTotalAmount(double totalAmount) throws NewsagentExceptionHandler {
        if (totalAmount < 0) {
            throw new NewsagentExceptionHandler("Total amount cannot be negative");
        }
        if (totalAmount == 0) {
            throw new NewsagentExceptionHandler("Total amount must be greater than zero");
        }
        if (totalAmount > 1000000.0) { // Adjust this threshold based on your requirements
            throw new NewsagentExceptionHandler("Total amount is too large");
        }


        this.total_amount = totalAmount; 
        return true;
    }
    public void setNewspaperDetails(String newspaperName, int newspaperNumber) throws NewsagentExceptionHandler {
        if (newspaperName == null || newspaperName.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Newspaper name cannot be empty");
        }
        if (newspaperNumber < 1) {
            throw new NewsagentExceptionHandler("Newspaper number must be greater than zero");
        }

        this.newspaperName = newspaperName;
        this.newspaperNumber = newspaperNumber;
    }

    public boolean areNewspaperDetailsVisible() throws NewsagentExceptionHandler {
        if (newspaperName == null || newspaperName.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Newspaper name cannot be empty");
        }
        if (newspaperNumber < 1) {
            throw new NewsagentExceptionHandler("Newspaper number must be greater than zero");
        }


        return true;
    }
    public void setNewsagentName(String newsagentName) {
        this.newsagentName = newsagentName;
    }

    public boolean isNewsagentNameVisible() throws NewsagentExceptionHandler {
        if (newsagentName == null || newsagentName.trim().isEmpty()) {
            throw new NewsagentExceptionHandler("Newsagent name cannot be empty");
        }

        return true;
    }
    public void setSuccessfulTickBox(boolean isVisible) {
        this.successfulTickBox = isVisible;
    }

    public boolean isSuccessfulTickBoxVisible() throws NewsagentExceptionHandler {
        if (!successfulTickBox) {
            throw new NewsagentExceptionHandler("Successful tick box is not visible");
        }
        return true;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHome_address() {
		return home_address;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", home_address=" + home_address + ", name=" + name + ", date="
				+ Arrays.toString(date) + ", time=" + Arrays.toString(time) + ", balance=" + balance
				+ ", newspaperName=" + newspaperName + ", newspaperNumber=" + newspaperNumber + ", newsagentName="
				+ newsagentName + ", successfulTickBox=" + successfulTickBox + ", unsuccessfulTickBox="
				+ unsuccessfulTickBox + ", returnedTickBox=" + returnedTickBox + ", customerPaid=" + customerPaid
				+ ", total_amount=" + total_amount + "]";
	}

	public void setHome_address(String home_address) {
	    this.home_address = (home_address != null) ? home_address.trim() : "Unknown";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getNewspaperName() {
		return newspaperName;
	}

	public void setNewspaperName(String newspaperName) {
		this.newspaperName = newspaperName;
	}

	public int getNewspaperNumber() {
		return newspaperNumber;
	}

	public void setNewspaperNumber(int newspaperNumber) {
		this.newspaperNumber = newspaperNumber;
	}

	public boolean isCustomerPaid() {
		return customerPaid;
	}

	public void setCustomerPaid(boolean customerPaid) {
		this.customerPaid = customerPaid;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getNewsagentName() {
		return newsagentName;
	}

	public boolean isSuccessfulTickBox() {
		return successfulTickBox;
	}

	public boolean isUnsuccessfulTickBox() {
		return unsuccessfulTickBox;
	}

	public boolean isReturnedTickBox() {
		return returnedTickBox;
	}

	public void setUnsuccessfulTickBox(boolean isVisible) {
        this.unsuccessfulTickBox = isVisible;
    }

    public boolean isUnsuccessfulTickBoxVisible() throws NewsagentExceptionHandler {
        if (!unsuccessfulTickBox) {
            throw new NewsagentExceptionHandler("Unsuccessful tick box is not visible");
        }
        return true;
    }

    public void setReturnedTickBox(boolean isVisible) {
        this.returnedTickBox = isVisible;
    }

    public boolean isReturnedTickBoxVisible() throws NewsagentExceptionHandler {
        if (!returnedTickBox) {
            throw new NewsagentExceptionHandler("Returned tick box is not visible");
        }
        return true;
    }
    public void setCustomerName(String name) {
        this.name = name;
    }

    public void setTotalAmount(double totalAmount) {
        this.total_amount = totalAmount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    

    
}
