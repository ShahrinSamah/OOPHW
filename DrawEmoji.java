/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawEmoji extends JPanel {

    private int selectedEmoji;

    public DrawEmoji(int selectedEmoji) {
        this.selectedEmoji = selectedEmoji;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (selectedEmoji) {
            case 1:
                drawSmiley(g);
                break;
            case 2:
                drawAngry(g);
                break;
            case 3:
                drawSad(g);
                break;
            case 4:
                drawBlush(g);
                break;
            default:
                g.drawString("Invalid selection! Please choose between 1 and 4.", 50, 50);
                break;
        }
    }

    // Draw Smiley Emoji
    private void drawSmiley(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200); // Face

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // Left eye
        g.fillOval(135, 65, 30, 30); // Right eye
        g.drawArc(50, 80, 120, 100, 0, -180); // Smile
    }

    // Draw Angry Emoji
    private void drawAngry(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200); // Face

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // Left eye
        g.fillOval(115, 65, 30, 30); // Right eye
        g.drawLine(50, 50, 80, 60); // Left eyebrow
        g.drawLine(120, 60, 150, 50); // Right eyebrow
        g.drawArc(50, 100, 100, 50, 10, 180); // Angry mouth
    }

    // Draw Sad Emoji
    private void drawSad(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200); // Face

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // Left eye
        g.fillOval(120, 65, 30, 30); // Right eye
        g.drawArc(50, 110, 100, 50, 0, 180); // Sad mouth
    }

    // Draw Blush Emoji
    private void drawBlush(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 200, 200); // Face

        g.setColor(Color.BLACK);
        g.fillOval(55, 65, 30, 30); // Left eye
        g.fillOval(135, 65, 30, 30); // Right eye
        g.drawArc(50, 80, 120, 100, 0, -180); // Smile

        // Blush
        g.setColor(Color.PINK);
        g.fillOval(30, 120, 40, 20); // Left blush
        g.fillOval(145, 120, 40, 20); // Right blush
    }
}