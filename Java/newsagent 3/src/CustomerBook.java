
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerBook
{
    private int customerBookID;
    private String name;
    private String surname;
    private String homeAddress;
    private double balance;

    static int counter;

    public int getCustomerID() {
        return customerBookID;
    }

    public void setCustomerID(int customerID) {
        this.customerBookID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public CustomerBook() {
    }

    public CustomerBook(int customerID, String name, String surname, String homeAddress, double balance, int customerBookID) throws NewsagentExceptionHandler {
        try {
            validateName(name);
            validateAddress(homeAddress);
        } catch (NewsagentExceptionHandler e) {
            throw e;
        }

        this.customerBookID = customerBookID;
        this.name = name;
        this.surname = surname;
        this.homeAddress = homeAddress;
        this.balance = balance;
        counter++;
    }

    public boolean createCustomerBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String customerBookName = scanner.nextLine();
        try {
            validateName(customerBookName);
            setName(customerBookName);
        } catch (NewsagentExceptionHandler e) {
            System.out.println(e.getMessage());
            return false;
        }
        System.out.println("Enter Customer Surname:");
        String customerBookSurname = scanner.nextLine();
        setSurname(customerBookSurname);
        System.out.println("Enter Customer Home Address:");
        String customerBookHomeAddress = scanner.nextLine();
        try {
            validateAddress(customerBookHomeAddress);
            setHomeAddress(customerBookHomeAddress);
        } catch (NewsagentExceptionHandler e) {
            System.out.println(e.getMessage());
            return false;
        }

        System.out.println("Enter Customer Balance:");
        double customerBookBalance;
        try {
            customerBookBalance = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid balance format, please enter a valid number.");
            return false;
        }
        setBalance(customerBookBalance);
        System.out.println("Customer book created successfully!");
        return true;
    }


    
    public void validateName(String bookName) throws NewsagentExceptionHandler {
        if (bookName.isBlank() || bookName.isEmpty())
            throw new NewsagentExceptionHandler("Customer book name not specified.");
        // Add other rules as needed.
    }

    public void validateAddress(String bookAddress) throws NewsagentExceptionHandler {
        if (bookAddress.isBlank() || bookAddress.isEmpty())
            throw new NewsagentExceptionHandler("Customer book address not specified.");
        // Add other rules as needed.
    }

    public void readCustomerBooks() throws Exception {
        CustomerBookController sql = new MySQLAccess();
        sql.printAllCustomerBookDetails();
    }

    public boolean deleteCustomerBook(int customerBookID) throws Exception {
        try {
            CustomerBookController sql = new MySQLAccess();
            return sql.deleteCustomerBookById(customerBookID);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
	public String toString() {
		return "CustomerBook [customerBookID=" + customerBookID + ", name=" + name + ", surname=" + surname
				+ ", homeAddress=" + homeAddress + ", balance=" + balance + "]";
	}

	public boolean updateCustomerBook() throws Exception {
        try {
            CustomerBookController sql = new MySQLAccess();
            return sql.updateCustomerBook(this);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
