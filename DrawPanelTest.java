/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIchapt4;

/**
 *
 * @author Lenovo S540
 */
//chapter 4
import javax.swing.JFrame;

public class DrawPanelTest {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel); 
        application.setSize(250, 250); 
        application.setVisible(true);
    }
}
