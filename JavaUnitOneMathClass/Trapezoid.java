import java.util.Scanner;

public class Trapezoid
{
    private int base1;
    private int base2;
    private int height;
    private double area;
    
    public Trapezoid()
    {
        base1 = 0;
        base2 = 0;
        height = 0;
        area = 0.00;
    }
    
    public void calcArea()
    {
        Scanner inpt = new Scanner(System.in);
        System.out.print("First Base of Trapezoid: ");
        base1 = inpt.nextInt();
        System.out.print("Second Base of Trapezoid: ");
        base2 = inpt.nextInt();
        System.out.print("Height of Trapezoid: ");
        height = inpt.nextInt();
        area = ((base1+base2)*height)/2;
        System.out.print("Area of Trapezoid: "+area);
    }
}