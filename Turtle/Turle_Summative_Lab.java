import java.awt.Color;

/**
 * Write a description of class Turle_Summative_Lab here.
 * 
 * @author Scott Smith 
 * @version (a version number or a date)
 */
public class Turle_Summative_Lab
{
    public static void main(String args[]) throws InterruptedException
    {
        World turtleWorld = new World(740,480);
        
        //Creates the S
        Turtle turtle1 = new Turtle(turtleWorld);
        turtle1.penUp();
        turtle1.turnLeft();
        turtle1.forward(175);
        turtle1.turnRight();
        turtle1.forward(100);
        turtle1.turnLeft();
        turtle1.setPenColor(Color.BLUE);
        turtle1.penDown();
        turtle1.forward(100);
        turtle1.turnLeft();
        turtle1.forward(100);
        turtle1.turnLeft();
        turtle1.forward(100);
        turtle1.turnRight();
        turtle1.forward(100);
        turtle1.turnRight();
        turtle1.forward(100);
        turtle1.penUp();
        
        //Creates the C
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.penUp();
        turtle2.turnLeft();
        turtle2.setPenColor(Color.CYAN);
        turtle2.forward(50);
        turtle2.penDown();
        turtle2.forward(100);
        turtle2.turnLeft();
        turtle2.forward(100);
        turtle2.turnLeft();
        turtle2.forward(100);
        
        //Creates the O
        Turtle turtle3 = new Turtle(turtleWorld);
        turtle3.penUp();
        turtle3.turnLeft();
        turtle3.forward(25);
        turtle3.turnRight();
        turtle3.turnRight();
        turtle3.turnRight();
        turtle3.forward(150);
        turtle3.turnLeft();
        turtle3.forward(100);
        turtle3.turnLeft();
        turtle3.setPenColor(Color.GREEN);
        turtle3.forward(50);
        turtle3.penDown();
        turtle3.forward(100);
        turtle3.turnLeft();
        turtle3.forward(100);
        turtle3.turnLeft();
        turtle3.forward(100);
        turtle3.turnLeft();
        turtle3.forward(100);
        
        //Creates the T
        Turtle turtle4 = new Turtle(turtleWorld);
        turtle4.penUp();
        turtle4.turnRight();
        turtle4.turnRight();
        turtle4.forward(100);
        turtle4.turnLeft();
        turtle4.forward(150);
        turtle4.turnLeft();
        turtle4.setPenColor(Color.RED);
        turtle4.penDown();
        turtle4.forward(150);
        turtle4.turnLeft();
        turtle4.forward(50);
        turtle4.turnLeft();
        turtle4.turnLeft();
        turtle4.forward(100);
        turtle4.turnLeft();
        turtle4.turnLeft();
        turtle4.forward(50);
        turtle4.turnRight();
        turtle4.forward(50);
        
        //Creates the T
        Turtle turtle5 = new Turtle(turtleWorld);
        turtle5.penUp();
        turtle5.turnRight();
        turtle5.turnRight();
        turtle5.forward(100);
        turtle5.turnLeft();
        turtle5.forward(275);
        turtle5.turnLeft();
        turtle5.setPenColor(Color.PINK);
        turtle5.penDown();
        turtle5.forward(150);
        turtle5.turnLeft();
        turtle5.forward(50);
        turtle5.turnLeft();
        turtle5.turnLeft();
        turtle5.forward(100);
        turtle5.turnLeft();
        turtle5.turnLeft();
        turtle5.forward(50);
        turtle5.turnRight();
        turtle5.forward(50);
        
        //Creates the Box
        Turtle turtle6 = new Turtle(turtleWorld);
        turtle6.penUp();
        turtle6.forward(175);
        turtle6.turnRight();
        turtle6.forward(350);
        turtle6.turnLeft();
        turtle6.turnLeft();
        turtle5.setPenColor(Color.BLUE);
        turtle6.penDown();
        
     
        for(int x=0; x<30; x++)
        {
            
            turtle6.forward(685);
            turtle6.turnLeft();
            Thread.sleep(200);
            turtle6.forward(345);
            turtle6.turnLeft();
            Thread.sleep(200);
            turtle6.forward(685);
            turtle6.turnLeft();
            Thread.sleep(200);
            turtle6.forward(345);
            turtle6.turnLeft();
            Thread.sleep(200);
        }
    }
}
