import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello3
{
    public static void main(String[] args) throws Exception {
        URL imageLoc = new URL("http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLoc));
    }
}
