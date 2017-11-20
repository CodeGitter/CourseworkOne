package mdx.ac.mt.model;

public class Sphere extends ThreeDShapes{
    final private char shapeID = 'S';//ID
    final private double Pi = 3.14;
    private double radius;
    
    public Sphere(double radiusInput)
    {//constructor takes params from user input in client
        
        //sets area of shapes depending on input passed to constructor
        //when instance of this class is created
        this.shapeVolume = setVolume(radiusInput);
    }
    
    //overriding setArea 
    public double setVolume(double radius) 
    { //sets area based on params passed by constructor
        double tempVolume = ((4/3)*(Pi)*(radius*radius*radius));//formula for vol of sph
        
        this.shapeVolume = tempVolume;
        return this.shapeVolume;
    }
}
