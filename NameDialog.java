/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIchapt3;

/**
 *
 * @author Lenovo S540
 */
//chapter 3
import javax.swing.JOptionPane;

public class NameDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        String message
                = String.format("Welcome, %s, to Java Programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
