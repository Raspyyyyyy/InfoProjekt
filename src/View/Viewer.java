package View;

import DatenStruktur.List;
import DatenStruktur.Queue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Viewer {
private JFrame frame;

private List<String> MeineListe;
private JTextField ageField;
private JComboBox<String> diseaseComboBox;
private JButton takeMedicationButton;
private Queue<String> pQueue;
private JScrollPane queueScrollPane;
private JTextField nameField;
private JButton enqueueButton;
public Viewer(){

    frame = new JFrame("Queue Application");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    queueScrollPane = new JScrollPane();
    frame.add(queueScrollPane, BorderLayout.CENTER);

    JPanel infoPanel = new JPanel(new GridLayout(4, 2));
    nameField = new JTextField();
    ageField = new JTextField();
    String[] diseases = {"Bauchschmerzen", "Allergie", "Husten","Kopfschmerzen","Muskelschmerzen","andere"};
    diseaseComboBox = new JComboBox<>(diseases);

    infoPanel.add(new JLabel("Name:"));
    infoPanel.add(nameField);
    infoPanel.add(new JLabel("Alter:"));
    infoPanel.add(ageField);
    infoPanel.add(new JLabel("Krankheit:"));
    infoPanel.add(diseaseComboBox);

    frame.add(infoPanel, BorderLayout.WEST);
    frame.setSize(600, 300);
    frame.setLocationRelativeTo(null);

    /*
    enqueueButton.addActionListener(e -> {
        String patientInfo = "Name: " + nameField.getText() + ", Alter: " + ageField.getText() +
                ", Krankheit: " + diseaseComboBox.getSelectedItem();
        int selectedDiseaseIndex = diseaseComboBox.getSelectedIndex();
       // model.enqueue(patientInfo, selectedDiseaseIndex);
        //updateQueueList();
        //dequeueNextPatient();
       // clearInputFields();
    });
    */

    }

    public void createEnqueueButton(){

    enqueueButton = new JButton("Enqueue");

    frame.add(enqueueButton,BorderLayout.SOUTH);

            }

    }




























