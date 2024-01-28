package template;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

// StudentServer class sets up the RMI server for the StudentController
public class Server {
    public static void main(String[] args) {
        try {
            // Create an instance of the StudentController
        	StudentController carController = new StudentController();            
            // Create a registry  and set port
        	LocateRegistry.createRegistry(1099);
        	// Bind the StudentController instance to the registry with the name "StudentController"
            Naming.rebind("StudentController", carController);
            // Print a message indicating that the Student Server is running
            System.out.println("Student Server is running...");
        } catch (Exception e) {
            // Print the stack trace if an exception occurs during server setup
            e.printStackTrace();
        }
    }
}