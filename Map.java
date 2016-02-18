
/**
 * It holds three Location objects.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 11/10/15
 */
public class Map
{
    // instance variables
    private String name;
    private Location loc1;
    private Location loc2;
    private Location loc3;

    /**
     * Constructor for user input locations.
     */
    public Map(double xCor1, double yCor1, double xCor2, double yCor2, double xCor3, double yCor3, String nName)
    {
        name = nName;
        loc1 = new Location(xCor1, yCor1);
        loc2 = new Location(xCor2, yCor2);
        loc3 = new Location(xCor3, xCor3);
    }

    /**
     * Constructor for default locaitons.
     */
    public Map()
    {
        name = "Default Map";
        loc1 = new Location();
        loc2 = new Location(3,0);
        loc3 = new Location(2,2);
    }

    /**
     * This Methods finds the largest distance between the points.
     * @return A double data type for the largest distance.
     */
    public double getLargestDistance()
    {
        double d12 = loc1.distanceTo(loc2);
        double d13 = loc1.distanceTo(loc3);
        double d23 = loc2.distanceTo(loc3);
        if(d12 > d13 && d12 > d23)
            return d12;
        else if(d13 > d12 && d13 > d23)
            return d13;
        else if(d23 > d12 && d23 > d13)
            return d23;
        else
            return 0;
    }

    /**
     * This Methods finds the perimeter of the triangle made by the points.
     * @return A double data type for the perimeter.
     */
    public double calcPerimeter()
    {
        if(isTriangle())
        {
            double p1 = loc1.distanceTo(loc2);
            double p2 = loc1.distanceTo(loc3);
            double p3 = loc2.distanceTo(loc3);
            double p = p1 + p2 + p3;

            return p;
        }
        else
            return -1;
    }

    /**
     * This Methods finds the area of the triangle made by the points.
     * @return A double data type for the area.
     */
    public double calcArea()
    {
        if(isTriangle())
        {
            double a;
            double p = this.calcPerimeter();
            double d1 = loc1.distanceTo(loc2);
            double d2 = loc1.distanceTo(loc3);
            double d3 = loc2.distanceTo(loc3);

            a = Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
            return a;
        }
        else
            return -1;
    }

    /**
     * This Methods finds the diameter of the bounding circle.
     * @return A double data type for the circle diameter.
     */
    public double calcBoundingCircleDiameter()
    {
        if(isTriangle())
        {
            double cD;
            double p = this.calcPerimeter();
            double a = this.calcArea();

            cD = p / (2 * a);
            return cD;
        }
        else
            return -1;
    }

    /**
     * This Methods finds the area of the bounding circle.
     * @return A double data type for the circle area.
     */
    public double calcBoundingCircleArea()
    {
        if(isTriangle())
        {
            double cA;
            double PI = Math.PI;
            double r = this.calcBoundingCircleDiameter()/2;

            cA = PI * Math.pow(r,2);
            return cA;
        }
        else
            return -1;
    }

    /**
     * This Methods finds if the map forms a triangle.
     * @return A boolean data type for if it is a triangle or not.
     */
    public boolean isTriangle()
    {
        boolean loc1isloc2;
        boolean loc1isloc3;
        boolean loc2isloc3;
        loc1isloc2 = loc1.equals(loc2);
        loc1isloc3 = loc1.equals(loc3);
        loc2isloc3 = loc2.equals(loc3);

        return (!loc1isloc2 && !loc1isloc3 && !loc2isloc3);
    }
}

