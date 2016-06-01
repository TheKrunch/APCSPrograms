
/**
 * Write a description of class RandomDraw here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomDraw
{

    private boolean wonDraw;
    private double nDucks;

    /**
     * Constructor for objects of class RandomDraw
     */
    public RandomDraw(double ducks)
    {
        nDucks = ducks;
        wonDraw = Draw();
    }

    public boolean Draw()
    {
        if(Math.random() > (1/(nDucks - 1)))
        {
            return false;
        }
        else
            return true;
    }
}
