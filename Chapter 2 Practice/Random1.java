import java.util.Random;

/**
 * Write a description of class Random here.
 * 
 * @author Scott Smith
 * @version (a version number or a date)
 */
public class Random1
{
    public static void main(String[] args)
    {
        
        Random generator = new Random();
        for(int x=0; x<20; x++)
        {
            int number=generator.nextInt(100);
            System.out.println(number);
        }
    }
}
