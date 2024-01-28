package template;

import java.rmi.Naming;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
    	
        try {
            // Look up the remote object (StudentController) from the RMI registry
        	StudentControllerInterface carController = (StudentControllerInterface) Naming.lookup("rmi://localhost/StudentController");
            // Create instances of StudentView and CarGUIController
            StudentView carView = new StudentView();
            StudentGUIController carGUIController = new StudentGUIController(carController, carView);
            // Update the list of Student using the GUI controller
            carGUIController.updateStudentList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}