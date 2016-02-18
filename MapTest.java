
/**
 * This class tests the Map class.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 11/12/15
 */
public class MapTest
{
    public static void main(String[] args)
    {
        Map map1 = new Map();
        System.out.println("This should print the largest distance between 2 points for (0,0), (3,0), and (2,2)");
        System.out.println(map1.getLargestDistance());
        System.out.println("This should print the perimeter for the points (0,0), (3,0), and (2,2)");
        System.out.println(map1.calcPerimeter());
        System.out.println("This should print the area for the points (0,0), (3,0), and (2,2)");
        System.out.println(map1.calcArea());
        System.out.println("This should print the bounding circle diameter for the points (0,0), (3,0), and (2,2)");
        System.out.println(map1.calcBoundingCircleDiameter());
        System.out.println("This should print the bounding circle area for the points (0,0), (3,0), and (2,2)");
        System.out.println(map1.calcBoundingCircleArea());
    }
}


