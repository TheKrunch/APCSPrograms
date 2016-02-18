
/**
 * Location.java - a class to find and store x and y cordinates.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 11/9/15
 */
public class Location 
{
    /**
     * x and y coordinates.
     * @param xCor and yCor Double variables.
     */
    private double xCor;
    private double yCor;

    /**
     * Constructors
     */
    public Location()
    {
        // Instance variables
        xCor = 0.0;
        yCor = 0.0;
    }

    public Location(double nXCor, double nYCor)
    {
        //Instance variables
        xCor = nXCor;
        yCor = nYCor;
    }

    /**
     * This is the distanceTo Method, it finds the distance between two locations.
     * @param Other Location object.
     * @return A double data type for the distance between the 2 locations.
     */

    public double distanceTo(Location nLocation)
    {
        double d;
        d = Math.sqrt(Math.pow(nLocation.getXCor() - this.getXCor(),2) + Math.pow(nLocation.getXCor() - this.getXCor(),2));
        return d;
    }

    public boolean equals(Location oLocation)
    {
        return (Math.abs(this.getXCor() - oLocation.getXCor()) < .000000000000005 && Math.abs(this.getYCor() - oLocation.getYCor()) < .000000000000005);
    }

    /**
     * This is the getXCor Method, it returns xCor.
     * @return A double data type for the xCor.
     */
    public double getXCor()
    {
        return xCor;
    }

    /**
     * This is the getYCor Method, it returns yCor.
     * @return A double data type for the yCor.
     */
    public double getYCor()
    {
        return yCor;
    }
}

