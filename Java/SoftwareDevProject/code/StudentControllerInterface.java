package template;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

// CarControllerInterface defines the remote interface for interacting with the StudentController class.
public interface StudentControllerInterface extends Remote {
    
    // Method to add a Student to the Student list
    void addStudent(Student car) throws RemoteException;

    // Method to delete a Student from the Student list based on its index
    void deleteStudent(int index) throws RemoteException;

    // Method to edit a Student in the Student list based on its index with updated information
    void editStudent(int index, Student updatedCar) throws RemoteException;

    // Method to retrieve the current list of Student
    ArrayList<Student> getStudentList() throws RemoteException;
}
