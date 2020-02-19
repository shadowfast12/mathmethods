
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Rectangle
{
    // instance variables - replace the example below with your own
    private int length;
    private int width;
    private double perimeter;
    
    public Rectangle()
    {
        length = 0;
        width = 0;
        perimeter = 0.00;
    }
    
    public void calcPerimeter()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Length of the Rectangle: ");
        length = inpt.nextInt();
        System.out.print("Width of the Rectangle: ");
        width = inpt.nextInt();
        perimeter = 2*(length+width);
        System.out.println("Perimeter of Rectangle: "+perimeter);
    }
    
    
}