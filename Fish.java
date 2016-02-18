/**
 * This class represents a very simplified Fish; no actual Fish will be harmed in this class
 * @author (Tim Barron)
 * @version (1.0)
 */
public class Fish
{
    // instance variables
    private int age;
    private String color;
    private boolean isAlive;
    /**
     * Default constructor for objects of class Fish
     */
    public Fish()
    {
        age = 1;
        color = "gray";
        isAlive = true;
    }
    //methods

    public void swim()
    {
        if (isAlive)
            System.out.println("The " + color + " fish which is " + age + " years old is swimming....");
        else
            System.out.println("Dead fish can't swim with the fishes.");
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public void die()
    {
        isAlive = false;
    }

    public boolean getIsAlive()
    {
        return isAlive;
    }

}


