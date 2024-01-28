package Newsagent;

public class Invoice {
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


        return true;
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


    
}
