/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import javax.swing.*;

public class EmojiTest {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, 
                "Select an emoji:\n1 - Smiley\n2 - Angry\n3 - Sad\n4 - Blush", 
                "Emoji Selector", JOptionPane.QUESTION_MESSAGE);

        try {
            int selectedEmoji = Integer.parseInt(input); 

            // Create frame and panel
            JFrame frame = new JFrame("Emoji Drawer");
            DrawEmoji emojiPanel = new DrawEmoji(selectedEmoji);
            frame.add(emojiPanel);
            frame.setSize(240, 240);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (NumberFormatException e) {
            // Handle invalid input
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number between 1 and 4.");
        }
    }
}