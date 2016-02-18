
/**
 * Write a description of class Planet here.
 * 
 * @author Matt Scalzo 
 * @version (a version number or a date)
 */
public class Planet
{
    // instance variables
    private String name;
    private double mass;//in 10^24 kg
    private double diameter;//in km
    private double sunDistance;//in 10^6 km
    private boolean isAPlanet;
    public static final double G = 6.67e-11;  //in m^3s-2kg-1

    /**
     * Constructor for objects of class Planet
     */
    public Planet()
    {
        // initialise instance variables
        name = "Earth";
        mass = 5.97;
        diameter = 12756;
        sunDistance = 149.6;
        isAPlanet = true;
    }

    public Planet(String pName, double pMass, double pDiameter, double pSunDistance, boolean pIsAPlanet)
    {
        name = pName;
        mass = pMass;
        diameter = pDiameter;
        sunDistance = pSunDistance;
        isAPlanet = pIsAPlanet;
    }

    public String getName()
    {
        return name;
    }

    public double getMass()
    {
        return mass;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public double getSunDistance()
    {
        return sunDistance;
    }

    public boolean getIsAPlanet()
    {
        return isAPlanet;
    }

    public void toggleIsAPlanet()
    {
        isAPlanet = !isAPlanet;
    }

    public void printInfo()
    {
        System.out.println("Planet Name: " + name);
        System.out.println("Planet Mass: " + mass);
        System.out.println("Planet diameter: " + diameter);
        System.out.println("Planet distance from sun: " + sunDistance);
        if(isAPlanet)
            System.out.println(name + " is a planet.");
        else
            System.out.println(name + " is not a planet.");
    }

    public double calcGravForce(Planet other)
    {
        return (this.mass * other.mass * G)/ Math.pow(Math.abs(this.sunDistance - other.sunDistance),2);
    }

}

