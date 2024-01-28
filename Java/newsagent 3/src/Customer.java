

import java.sql.SQLException;
import java.util.Scanner;

public class Customer {
    // Class Instance
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    // CONSTANT
    private final int MAX_ID_NUMBER = 300;
    // GOLBAL Variables
    static int counter;

    public Customer(int id, String custName, String custAddr, String custPhone) throws NewsagentExceptionHandler {
        // Validate Input
        try {
            validateName(custName);
            validateAddress(custAddr);
            validatePhoneNumber(custPhone);
        } catch (NewsagentExceptionHandler e) {
            throw e;
        }

        // Set Attributes
        this.id = id;
        this.name = custName;
        this.address = custAddr;
        this.phoneNumber = custPhone;
        counter++;
    }
    void setId(int custId) {
        id = custId;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return this.id;
    }



    public Customer() {
    }

    public boolean validateCustomerID(int id) throws NewsagentExceptionHandler {
        if (id == 0) {
            throw new NewsagentExceptionHandler("ID number can not be zero");
        }
        if (id < 1) {
            throw new NewsagentExceptionHandler("ID number can not be negative.");
        }
        if (id > MAX_ID_NUMBER) {
            throw new NewsagentExceptionHandler("ID number can not be over" + MAX_ID_NUMBER);
        }
        return id != 0 && id > 1 && id < MAX_ID_NUMBER;
    }

    public int getMAX_ID_NUMBER() {
        return MAX_ID_NUMBER;
    }

    public void validateName(String custName) throws NewsagentExceptionHandler {
        // Agree Formatting Rules on "Customer Name"
        // E.G. Name String must be a minimum of 2 characters and a maximum of 20 characters

        if (custName.isBlank() || custName.isEmpty())
            throw new NewsagentExceptionHandler("Customer Name NOT specified");
        else if (custName.length() < 2)
            throw new NewsagentExceptionHandler("Customer Name does not meet minimum length requirements");
        else if (custName.length() > 20)
            throw new NewsagentExceptionHandler("Customer Name does not exceed maximum length requirements");
    }

    public void validateAddress(String custAddr) throws NewsagentExceptionHandler {
        // Agree Formatting Rules on "Customer Address"
        // E.G. Name String must be a minimum of 5 characters and a maximum of 30 characters

        if (custAddr.isBlank() || custAddr.isEmpty())
            throw new NewsagentExceptionHandler("Customer Address NOT specified");
        else if (custAddr.length() < 5)
            throw new NewsagentExceptionHandler("Customer Address does not meet minimum length requirements");
        else if (custAddr.length() > 30)
            throw new NewsagentExceptionHandler("Customer Address does not exceed maximum length requirements");
    }

    public void validatePhoneNumber(String custPhone) throws NewsagentExceptionHandler {
        // Agree Formatting Rules on "Customer PhoneNumber"
        // E.G. Name String must be a minimum of 7 characters and a maximum of 15 characters

        if (custPhone.isBlank() || custPhone.isEmpty())
            throw new NewsagentExceptionHandler("Customer PhoneNumber NOT specified");
        else if (custPhone.length() < 7)
            throw new NewsagentExceptionHandler("Customer PhoneNumber does not meet minimum length requirements");
        else if (custPhone.length() > 15)
            throw new NewsagentExceptionHandler("Customer PhoneNumber does not exceed maximum length requirements");
    }

    public void readCustomers() throws Exception {
        CustomerController sql = new MySQLAccess();
        sql.printAllCustomerDetails();
    }

    public boolean createCustomer() {
        Scanner scanner = new Scanner(System.in);

        // Validate and set customer ID
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Enter a valid ID between 1-" + this.MAX_ID_NUMBER + ":");
                int inputId = Integer.parseInt(scanner.nextLine());
                validId = this.validateCustomerID(inputId);
                if (validId) {
                    this.setId(inputId);
                } else {
                    System.out.println("Invalid ID. Please try again.");
                }
            } catch (NewsagentExceptionHandler e) {
                System.out.println(e.getMessage());
            }
        }

        // Collect and validate customer name
        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        try {
            this.validateName(customerName);
            this.setName(customerName);
        } catch (NewsagentExceptionHandler e) {
            System.out.println(e.getMessage());
            return false;
        }

        // Collect and validate customer address
        System.out.println("Enter customer address:");
        String customerAddress = scanner.nextLine();

        try {
            this.validateAddress(customerAddress);
            this.setAddress(customerAddress);
        } catch (NewsagentExceptionHandler e) {
            System.out.println(e.getMessage());
            return false;
        }

        // Collect and validate customer phone number
        System.out.println("Enter customer phone number:");
        String customerPhoneNumber = scanner.nextLine();

        try {
            this.validatePhoneNumber(customerPhoneNumber);
            this.setPhoneNumber(customerPhoneNumber);
        } catch (NewsagentExceptionHandler e) {
            System.out.println(e.getMessage());
            return false;
        }

        System.out.println("Customer created successfully!");
        return true;
    }
    
    public boolean deleteCustomer() throws Exception {
        try {
            CustomerController sql = new MySQLAccess();
            return sql.deleteCustomer(this.id);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateCustomer() throws Exception {
        try {
            CustomerController sql = new MySQLAccess();
            return sql.updateCustomer(this);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
