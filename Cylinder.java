package mdx.ac.mt.model;

public class Cylinder extends ThreeDShapes {
    final private char shapeID = 'Y';//ID
    final private double Pi = 3.14;
    private double radius;
    private double height;
    
    public Cylinder(double radiusInput, double heightInput)
    {//constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        this.shapeVolume = setVolume(radiusInput, heightInput);
    }
    
    //overriding setArea 
    public double setVolume(double radius, double height) 
    { //sets area based on params passed by constructor
        double tempVolume = ((Pi)*(radius*radius)*(height));//formula for vol of sph
        
        this.shapeVolume = tempVolume;
        return this.shapeVolume;
    }
}
