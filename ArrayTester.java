/**
 * Write a description of class Test here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 1/13/16
 */
public class ArrayTester
{
    public static void main(String[] args)
    {
        int[] Powerball = new int[6];
        System.out.println("These are your PowerBall numbers:");
        for(int i = 0; i < 6; i++)
        {
            if(i != 5)
            {
                Powerball[i] = (int)(Math.random() * 69 + 1);
                System.out.println(Powerball[i]);
            }
            else
            {
                Powerball[i] = (int)(Math.random() * 26 + 1);
                System.out.println(Powerball[i]);
            }
        }
        
        System.out.println("Helpful sayings:");
        String[] Sayings = new String[5];
        
        Sayings[0] = "Measure twice, cut once.";
        Sayings[1] = "Look both ways before crossing the street.";
        Sayings[2] = "Practice makes perfect.";
        Sayings[3] = "Everything in moderation, including moderation.";
        Sayings[4] = "Think before you speak. Read before you think.";
        for(int i = 0; i < 5; i++)
        {
             System.out.println(Sayings[i]);
        }
        
        System.out.println("Random Saying:");
        System.out.println(Sayings[(int)(Math.random() * 4 + 1)]);
    }
}


