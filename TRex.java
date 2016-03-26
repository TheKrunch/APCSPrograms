
/**
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 3/3/16
 */
public class TRex extends Pet
{
    private String sound;
    
    public TRex()
    {
        super();
        sound = "Rarrrrr";
    }
    
    public TRex(String tRexName)
    {
        super(tRexName);
        sound = "Rarrrrr";
    }
    
    public String speak()
    {
        return sound + " " + super.speak();
    }
}
