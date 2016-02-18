
/**
 * Write a description of class StringStuff here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 12/4/15
 */
public class StringStuff
{
    public static void main(String[] args)
    {
        System.out.println("This is, a test.".indexOf(","));

    }

    public int findComma(String str)
    {
        return str.indexOf(",");
    }

    public boolean isVowel(String word)
    {
        return word.substring(0,1).equals("a") || word.substring(0,1).equals("e") || word.substring(0,1).equals("i") || word.substring(0,1).equals("o") || word.substring(0,1).equals("u") || word.substring(0,1).equals("A") || word.substring(0,1).equals("E") || word.substring(0,1).equals("I") || word.substring(0,1).equals("O") || word.substring(0,1).equals("U");
    }

    public String removeMiddle(String word)
    {
        int n = word.length();
        int m = n / 2;

        if(m * 2 == n)
            return word.substring(0,m-1) + word.substring(m+1,n);
        else
            return word.substring(0,m) + word.substring(m+1,n);
    }

    public String chopSwitch(String word)
    {
        int n = word.length();
        int m = n / 2;

        return word.substring(m,n) + word.substring(0,m);
    }

    public String scroll(String word)
    {
        int n = word.length();

        return word.substring(1,n) + word.substring(0,1);
    }

    public String swapO2X(String word)
    {
        int n = word.length();
        String newWord = "";
        
        for(int i = 0; i < n; i++)
        {
            String s = word.substring(i,i+1);
            if(s.equals("x"))
            {
                newWord = newWord + "o";
                //System.out.println(newWord);
            }
            else
            {
                newWord = newWord + s;
                //System.out.println(newWord);
            }
        }
        
        return newWord;
    }
}
 


         