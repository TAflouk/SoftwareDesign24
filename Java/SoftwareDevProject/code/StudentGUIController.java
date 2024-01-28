
package template;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

// CarGUIController class manages the interaction between the StudentView and the StudentController
public class StudentGUIController {
	
    private StudentControllerInterface studentController;  // Reference to the remote StudentController
    private StudentView studentView;  // Reference to the GUI representation of cars

    // Constructor for StudentGUIController, takes references to StudentController and StudentView
    public StudentGUIController(StudentControllerInterface studentController, StudentView studentView) {
        this.studentController = studentController;
        this.studentView = studentView;

        // Add listeners for the GUI buttons
        studentView.addAddButtonListener(new AddButtonListener());
        studentView.addDeleteButtonListener(new DeleteButtonListener());
        studentView.addEditButtonListener(new EditButtonListener());
    }

    // Update the Student list in the GUI by retrieving the latest list from the server
    public void updateStudentList() {
        try {
            ArrayList<Student> s = studentController.getStudentList();
            studentView.updateStudentList(s);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    // ActionListener for the "Add" button in the GUI
    private class AddButtonListener implements ActionListener {
    	Student validateObj = new Student();
        @Override
        public void actionPerformed(ActionEvent e) {
            // Prompt the user to input details for a new student
            String name = JOptionPane.showInputDialog("Enter Student Name:");
            String surname = JOptionPane.showInputDialog("Enter Student Surname:");
            String id2 = JOptionPane.showInputDialog("Enter Student ID:");
            

            try {
                // Parse the input and create a new student
                int id = Integer.parseInt(id2);
                validateObj.validateID(id);
                validateObj.validateName(name);
                validateObj.validateSurname(surname);
                
                Student newStudent = new Student(name, surname, id);
                
                // Add the new student to the server and update the GUI
                studentController.addStudent(newStudent);
                updateStudentList();
                
                
            } 
            catch (StudentExceptionHandler e1) {
				// TODO Auto-generated catch block
            	JOptionPane.showMessageDialog(studentView, e1.getMessage());
			}catch (RemoteException ex) {
                // Handle invalid input or remote exception
                JOptionPane.showMessageDialog(studentView, "Remote Exception in StudentGUIController.");
            }
            catch (NumberFormatException err) {
                // Handle invalid input or remote exception
                JOptionPane.showMessageDialog(studentView, "Invalid input. Please enter a valid ID.");
            }
        }
    }

    // ActionListener for the "Delete" button in the GUI
    private class DeleteButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Get the selected index from the GUI's Student list
            int selectedIndex = studentView.getStudentList().getSelectedIndex();
            if (selectedIndex != -1) {
                try {
                    // Delete the selected Student from the server and update the GUI
                	studentController.deleteStudent(selectedIndex);
                	updateStudentList();
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                }
            } else {
                // Inform the user if no Student is selected for deletion
                JOptionPane.showMessageDialog(studentView, "Select a Student to delete.");
            }
        }
    }

    // ActionListener for the "Edit" button in the GUI
    private class EditButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
        	Student validateObj = new Student();

            // Get the selected index from the GUI's student list
            int selectedIndex = studentView.getStudentList().getSelectedIndex();
            if (selectedIndex != -1) {
                try {
                    // Get the details of the selected student
                	Student s = studentController.getStudentList().get(selectedIndex);
                    String name = JOptionPane.showInputDialog("Edit Name:", s.getName());
                    String surname = JOptionPane.showInputDialog("Edit Surname:", s.getSurname());
                    String id = JOptionPane.showInputDialog("Edit ID:", s.getId());

                    try {
                        // Parse the input and create an updated student
                        int id2 = Integer.parseInt(id);
                        validateObj.validateID(id2);
                        validateObj.validateName(name);
                        validateObj.validateSurname(surname);
                        
                        Student updatedCar = new Student(name, surname, id2);
                        
                        // Edit the selected student on the server and update the GUI
                        studentController.editStudent(selectedIndex, updatedCar);
                        updateStudentList();
                    }catch (StudentExceptionHandler e1) {
        				// TODO Auto-generated catch block
                    	JOptionPane.showMessageDialog(studentView, e1.getMessage());
        			} catch (NumberFormatException ex) {
                        // Handle invalid input for the ID
                        JOptionPane.showMessageDialog(studentView, "Invalid input. Please enter a valid ID.");
                    }
                } catch (RemoteException ex) {
                    ex.printStackTrace();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else {
                // Inform the user if no Student is selected for editing
                JOptionPane.showMessageDialog(studentView, "Select a Student to edit.");
            }
        }
    }
}