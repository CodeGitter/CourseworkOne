package mdx.ac.mt.model;

public class Triangle extends TwoDShapes{
    final private char shapeID = 'T';//ID
    
    private double shortLeg;
    private double longLeg;
    
    public Triangle(double shortLegInput, double longLegInput)
    {//constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of Rectangle is created
        this.shapeArea = setArea(shortLegInput, longLegInput);
    }
    
    //overriding setArea 
    public double setArea(double shortLeg, double longLeg) 
    { //sets area based on params passed by constructor
        double tempArea = ((shortLeg*longLeg)/2);//formula for area of tri
        
        this.shapeArea = tempArea;
        return this.shapeArea;
    }
}
