public class DeliveryArea {

    private int IDNumber;
    private String areaName;
    private int numberOfCustomers;

    final int MAX_ID_NUMBER = 300;
    final int MAX_CUSTOMER_NUMBER = 400;

    public DeliveryArea(int iDNumber, String areaName, int numberOfCustomers) {
        super();
        IDNumber = iDNumber;
        this.areaName = areaName;
        this.numberOfCustomers = numberOfCustomers;
    }

    public boolean validateIDNumber(int id) throws NewsagentExceptionHandler {
        if (id < 1) {
            throw new NewsagentExceptionHandler("ID cannot be less than 1");
        }

        if (id > MAX_ID_NUMBER) {
            throw new NewsagentExceptionHandler("ID cannot be greater than " + MAX_ID_NUMBER);
        }

        return true;
    }

 // Updated validateareaName method
    public boolean validateareaName(String name) throws NewsagentExceptionHandler {
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



    public boolean validatenumberOfCustomers(int numberOfCustomers) throws NewsagentExceptionHandler {
        if (numberOfCustomers < 1) {
            throw new NewsagentExceptionHandler("Number of customers cannot be less than 1");
        }

        if (numberOfCustomers > MAX_CUSTOMER_NUMBER) {
            throw new NewsagentExceptionHandler("Number of customers cannot be greater than " + MAX_CUSTOMER_NUMBER);
        }

        return true;
    }

    // Getters and setters

    @Override
    public String toString() {
        return "DeliveryArea [IDNumber=" + IDNumber + ", areaName=" + areaName + ", numberOfCustomers="
                + numberOfCustomers + "]";
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int iDNumber) {
        IDNumber = iDNumber;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
}