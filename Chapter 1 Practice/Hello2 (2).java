import javax.swing.JOptionPane;

public class Hello2
{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("What is your name: ");
        System.out.print("Your name is: " + name + "\n");
    }
}
