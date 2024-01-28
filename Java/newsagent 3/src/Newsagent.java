

public class Newsagent {
	
	@Override
	public String toString() {
		return "Newsagent [newsagentName=" + newsagentName + ", idNumber=" + idNumber + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + ", password=" + pin + "]";
	}

	private String newsagentName;
	private int idNumber;
	private String address;
	private int phoneNumber;
	private int pin;
	
	
    public Newsagent(String newsagentName, int idNumber, String address, int phoneNumber, int pin) {
        this.newsagentName = newsagentName;
        this.idNumber = idNumber;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
    }
    
    public Newsagent() {

    }
    
    
    public boolean validateName(String name) throws NewsagentExceptionHandler {
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
            throw new NewsagentExceptionHandler("Invalid name numbers not accepted");
        }

        this.newsagentName = name;
        return true;
    }
    public boolean validatePinNumber(int pin) throws NewsagentExceptionHandler {
        try {
            String pinString = String.valueOf(pin);
            
            if (!pinString.matches("\\d{4}")) {
                throw new NewsagentExceptionHandler("PIN must be exactly 4 digits");
            }

            this.pin = pin;
            return true;
        } catch (NumberFormatException e) {
            throw new NewsagentExceptionHandler("Invalid PIN format. Please enter a numeric value.");
        }
    }

	
	public boolean validateId(int id) {
		return false;
	}
	
	public boolean validateAddress(String id) {
		return false;
	}
	
	public boolean validatePhoneNumber(int id) {
		return false;
	}
	
	public boolean validatePassword(String password) {
		return false;
	}
	
	
	public String getNewsagentName() {
		return newsagentName;
	}

	public void setNewsagentName(String newsagentName) {
		this.newsagentName = newsagentName;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPassword() {
		return this.pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return this.pin;
	}


	
	public void updateNewsagent(String name, int id, String username, String password ) {
		
	}
	
	public void deleteNewsagent() {
		 
	}
	
	public void readNewsagent() {
		
	}
}

