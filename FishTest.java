/**
 * Write a description of class testFish here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 2/18/16
 */

import java.util.ArrayList;

public class FishTest
{
    public static void main(String[] args)
    {
        System.out.println('\f');//This clears the terminal.
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
        
        school.get(1).setColor("white");
        school.get(2).setColor("red");
        school.get(6).setColor("yellow");
        school.get(13).setColor("brown");
        school.get(16).setColor("purple");
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        school.add(new Fish());
        school.add(0, new Fish());
        school.add(11, new Fish());
        
        int numFish = 0;
        for(Fish i: school)
        {
            numFish ++;
            i.setAge((int)(Math.random() * 60));
        }
        System.out.println("Number of Fish: " + numFish);
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        for(Fish i: school)
        {
            i.swim();
        }
        nemo.swim();
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        school.remove(5);
        school.remove(12);
        school.remove(15);
        school.remove(4);
        school.remove(18);
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        for(Fish i: school)
        {
            if(i.getAge() > 40)
            {
                i.die();
            }
        }
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        for(Fish i: school)
        {
            if(i.getIsAlive() == false)
            {
                System.out.println("Color: " + i.getColor());
                System.out.println("Age: " + i.getAge());
            }
        }
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        ArrayList <Fish> theGreatBeyond = new ArrayList<Fish>();
        
        for(int i = 0; i < school.size(); i++)
        {
            Fish temp;
            if(school.get(i).getIsAlive() == false)
            {
                System.out.println(i);
                temp = school.remove(i);
                theGreatBeyond.add(temp);
            }
        }
        
         for(int i = 0; i < school.size(); i++)//Calling this for loop twice I solved a problem.
        {
            Fish temp;
            if(school.get(i).getIsAlive() == false)
            {
                System.out.println(i);
                temp = school.remove(i);
                theGreatBeyond.add(temp);
            }
        }
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        for(Fish i: theGreatBeyond)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
        
        for(int i = 0; i < 5; i++)
        {
            school.add(new Fish());
        }
        
        for(Fish i: school)
        {
            i.swim();
        }
        System.out.println("****************");//This is to break up the outputs in the terminal.
    }
}









