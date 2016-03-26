import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class TestCompare
{
    public static String randomLetter()
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int randInt = (int)(Math.random() * 26);

        return alphabet.substring(randInt);
    }

    public static void main(String[] args)
    {
        BankAccount[] rBank = new BankAccount[100];
        for(int i = 0; i < 100; i++)
        {
            rBank[i] = new BankAccount((i + 1) + " of 100", (Math.random() * 10000));
            System.out.println(rBank[i]);
        }

        Arrays.sort(rBank);
        System.out.println("*** They should now be sorted by balance. ***");
        for(BankAccount i: rBank)
        {
            System.out.println(i);
        }

        ArrayList<TRex> list = new ArrayList<TRex>();
        for(int i = 0; i < 100; i++)
        {
            list.add(new TRex(randomLetter()));
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println("*** They should now be sorted by alphabetical. ***");
        for(TRex i: list)
        {
            System.out.println(i);
        }
    }
}


