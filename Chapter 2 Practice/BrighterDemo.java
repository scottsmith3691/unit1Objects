import java.awt.Color;
import javax.swing.JFrame;

/**
 * Write a description of class BrighterDemo here.
 * 
 * @author Scott Smith
 * @version (a version number or a date)
 */
public class BrighterDemo
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor=Color.PINK;
        frame.getContentPane().setBackground(myColor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
    }
}
