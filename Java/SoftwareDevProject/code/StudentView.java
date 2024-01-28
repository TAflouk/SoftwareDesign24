package template;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

// CarView class represents the GUI for displaying and interacting with the list of Students
public class StudentView extends JFrame {
    private DefaultListModel<String> studentListModel;  // Model for the JList displaying Students
    private JList<String> studentList;  // JList to display the list of Students

    private JButton addButton;  // Button to add a new Student
    private JButton deleteButton;  // Button to delete a selected Student
    private JButton editButton;  // Button to edit a selected Student

    // Constructor to initialize the Student GUI
    public StudentView() {
        setTitle("Student Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(400, 300);

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);

        addButton = new JButton("Add Student");
        deleteButton = new JButton("Delete Student");
        editButton = new JButton("Edit Student");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(editButton);

        add(new JScrollPane(studentList), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Method to update the JList with the latest list of Student
    public void updateStudentList(ArrayList<Student> students) {
    	studentListModel.clear();
        for (Student s : students) {
        	studentListModel.addElement(s.toString());
        }
    }

    // Method to add an ActionListener to the "Add Student" button
    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    // Method to add an ActionListener to the "Delete Student" button
    public void addDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }

    // Method to add an ActionListener to the "Edit Student" button
    public void addEditButtonListener(ActionListener listener) {
        editButton.addActionListener(listener);
    }

    // Getter method to retrieve the JList of Student
    public JList<String> getStudentList() {
        return studentList;
    }
}