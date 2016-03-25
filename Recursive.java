
/**
 * Write a description of class Recursive here.
 * 
 * @author Matt Scalzo 
 * @version 3/25/16
 */
public class Recursive
{
    public static long fib(long number) 
    {
        if ((number == 0) || (number == 1)) // base cases
            return number;
        else
        // recursion step
            return fib(number - 1) + fib(number - 2);
    }
}
