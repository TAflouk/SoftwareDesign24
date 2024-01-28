package template;

import java.io.Serializable;

// CarModel class represents a Studnet and implements Serializable for object serialization
public class Student implements Serializable {
	private static final int  MAX_ID_NUMBER = 500;
    private String name;  // name of the Studnet
    private String surname;  // surname of the Studnet
    private int id;  // id of the Studnet

    // Constructor to initialize the Studnet with name, suranem, and id
    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    // Constructor to initialize the Studnet with name, suranem, and id
    public Student() {

    }

    public boolean validateName(String name)throws StudentExceptionHandler
    {
    	   // Check if the name is null or empty
        if (name == null || name.isEmpty()) {
            throw new StudentExceptionHandler("Name cannot be null or empty");
        }

        // Check if the length is less than 3 or more than 10
        if (name.length() < 3 || name.length() > 10) {
            throw new StudentExceptionHandler("Name length must be between 3 and 10 characters");
        }

        // Check if the name contains only characters from a to z (case-insensitive)
        if (!name.matches("[a-zA-Z]+")) {
            throw new StudentExceptionHandler("Name must contain only characters from a to z");
        }

        // If all checks pass, the name is valid
        return true;	
    }
    public boolean validateSurname(String surname)throws StudentExceptionHandler
    {
    	   // Check if the name is null or empty
        if (surname == null || surname.isEmpty()) {
            throw new StudentExceptionHandler("Surname cannot be null or empty");
        }

        // Check if the length is less than 3 or more than 10
        if (surname.length() < 3 || surname.length() > 10) {
            throw new StudentExceptionHandler("Surname length must be between 3 and 10 characters");
        }

        // Check if the name contains only characters from a to z (case-insensitive)
        if (!surname.matches("[a-zA-Z]+")) {
            throw new StudentExceptionHandler("Surname must contain only characters from a to z");
        }

        // If all checks pass, the name is valid
        return true;
    }
    public boolean validateID(int id) throws StudentExceptionHandler
    {
    	if(id < 1 )
    	{
    		throw new StudentExceptionHandler("ID cannot be less than 1");
    	}
    	if(id > MAX_ID_NUMBER )
    	{
    		throw new StudentExceptionHandler("ID cannot be greater than 500");
    	}
    	return id > 1 && id < MAX_ID_NUMBER;
    }
    
    // Getter method to retrieve the name of the Studnet
    public String getName() {
        return name;
    }

    // Getter method to retrieve the suranme of the Studnet
    public String getSurname() {
        return surname;
    }

    // Getter method to retrieve the id of the Studnet
    public int getId() {
        return id;
    }

    // Override the toString method to represent the Student as a string
    @Override
    public String toString() {
        return name + " " + surname + " " + id;
    }
}




