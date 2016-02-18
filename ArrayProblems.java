/**
 * Write a description of class ArrayProblems here.
 * 
 * @author Matt Scalzo 
 * @version 2/11/16
 */

public class ArrayProblems
{
    public static void main(String[] args)
    {
        int[][] num3 = new int[5][7];
        System.out.println("Problem 1:");
        for(int r = 0; r < num3.length; r++)
        {
            for(int c = 0; c < num3[r].length; c++)
            {
                num3[r][c] = 0;
                System.out.println("Row Number: " + r);
                System.out.println("Column Number: " + c);
                System.out.println("Value: " + num3[r][c]);
            }
        }
        
        String[][] arr = {{"Yo","Hi","Testing","Greetings"},{"Dude","Person","Human","Guy"},{"1","2","3","4"}};
        System.out.println("Problem 2:");
        for(int r = 0; r < arr.length; r++)
        {
            for(int c = 0; c < arr[r].length; c++)
            {
                System.out.println(arr[r][c]);
            }
        }
        
        System.out.println("Problem 3:");
        for(int c = 0; c < arr[0].length; c++)
        {
            for(int r = 0; r < arr.length; r++)
            {
                System.out.println(arr[r][c]);
            }
        }
        
        System.out.println("Problem 4:");
        int[][] dia = {{1,0,0,0,0,0,0,0,0,1},{0,1,0,0,0,0,0,0,1,0},{0,0,1,0,0,0,0,1,0,0},{0,0,0,1,0,0,1,0,0,0},{0,0,0,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,0},{0,0,0,1,0,0,1,0,0,0},{0,0,1,0,0,0,0,1,0,0},{0,1,0,0,0,0,0,0,1,0},{1,0,0,0,0,0,0,0,0,1}};
        for(int i = 0; i < 10; i++)
        {
            System.out.println(dia[i][i]);
        }
        System.out.println("*****");
        for(int i = 9; i > -1; i--)
        {
            System.out.println(dia[i][i]);
        }
        
    }
}






