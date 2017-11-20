package mdx.ac.mt.model;

public class Circle extends TwoDShapes{
    final private char shapeID = 'C';
    final private double Pi = 3.14;
    private double radius;
    private double diameter;
    
    public Circle(double radiusInput)
    {//constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of Rectangle is created
        this.shapeArea = setArea(radiusInput);
    }
    
    //overriding setArea 
    public double setArea(double radius) 
    { //sets area based on params passed by constructor
        double tempArea = (Pi * (radius*radius));//formula for area of circle
        
        this.shapeArea = tempArea;
        return this.shapeArea;
    }
}
