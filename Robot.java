
/**
 * Write a description of class Robot here.
 * 
 * @author Matt Scalzo
 * @version 1.0 - 2/3/16
 */
public class Robot
{
    private int[] hall;
    private int pos;//Current position (tile number) of Robot
    private boolean facingRight;//True means this robot is facing right
    
    public Robot()
    {
        int[] temp = {1,0,3,5,2,1};
        hall = temp;
        pos = 1;
        facingRight = true;
    }
    
    private boolean forwardMoveBlocked()
    {
        if(pos == hall.length -1 && facingRight == true)
            return true;
        else if(pos == 0 && facingRight == false)
            return true;
        else
            return false;
    }
    
    private void move()
    {
        if(forwardMoveBlocked() == true)
            facingRight = !facingRight;
        else if(hall[pos] == 0 && facingRight == true)
            pos++;
        else if(hall[pos] == 0 && facingRight == false)
            pos--;
        else if(forwardMoveBlocked() == false && facingRight == true)
        {
            hall[pos] = hall[pos] - 1;
            pos++;
        }
        else if(forwardMoveBlocked() == false && facingRight == false)
        {
            hall[pos] = hall[pos] - 1;
            pos--;
        }
        System.out.println("Things to pick up." + hall[pos]);
        System.out.println("Hall position" + pos);
    }
    
    public int clearHall()
    {
        int numMoves = 0;
        while(!hallIsClear())
        {
            move();
            numMoves++;
        }
        return numMoves;
    }
    
    private boolean hallIsClear()
    {
        int clear = 0;
        for(int i: hall)
        {
            if(i == 0)
                clear = clear;
            else
                clear++;
        }
        
        if(clear > 0)
            return false;
        else
            return true;
    }
    
    public boolean getHallIsClear()
    {
        return hallIsClear();
    }
}





