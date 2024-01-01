package Model;

import View.Viewer;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MainClass {

public static void main(String[]args) {


 SwingUtilities.invokeLater(() -> {
  try {
   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
  } catch (Exception e) {
   e.printStackTrace();
  }


  Viewer view = new Viewer();
  view.createEnqueueButton();


 });


}
}
