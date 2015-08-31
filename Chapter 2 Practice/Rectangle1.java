import java.awt.Rectangle;

/**
 * Write a description of class Rectangle1 here.
 * 
 * @author Scott And Alex 
 * @version (a version number or a date)
 */

public class Rectangle1
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2=r1;
      System.out.println(r1);
      System.out.println(r2);
   }
}
