import java.util.Arrays;
import java.util.Scanner;

public class TestSearching
{
    public static void main (String[] args)
    {
        int[] a = ArrayUtil.randomIntArray(20,10);
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("******");
        System.out.println(Arrays.toString(a));

        BinarySearcher bSearch = new BinarySearcher(a);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer to search for in the array:");
        int target = sc.nextInt();
        System.out.println(bSearch.search(target));
    }
}


