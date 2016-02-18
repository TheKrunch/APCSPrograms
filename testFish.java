
/**
 * Write a description of class testFish here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 2/18/16
 */

import java.util.ArrayList;

public class testFish
{
    public static void main(String[] args)
    {
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        ArrayList <Fish> school = new ArrayList<Fish>();
        
        for(int i = 0; i < 20; i++)
        {
            school.add(new Fish());
        }
        
        for(Fish i: school)
        {
            i.setColor("blue");
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        school.get(7).setColor("green");
        school.get(7).swim();
        
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        Fish aFish = new Fish();
        school.add(aFish);
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        Fish nemo = school.remove(20);
    }
}
