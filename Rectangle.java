package mdx.ac.mt.model;

public class Rectangle extends TwoDShapes{
    final private char shapeID = 'R';
    private double height;
    private double width;
    
    public Rectangle(double heightInput, double widthInput)
    {//constructor takes params from user input in client
        noOfSides = 4;//overridden 
        //sets area of shapes depending on input passed to constructor
        //when instance of Rectangle is created
        this.shapeArea = setArea(heightInput, widthInput);
    }
    
    //overriding setArea 
    public double setArea(double height, double width) 
    { //sets area based on params passed by constructor
        double tempArea = (height * width);
        
        this.shapeArea = tempArea;
        return this.shapeArea;
    }
}
