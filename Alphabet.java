/**
 * Write a description of class Alphabet here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 1/3/16
 */
public class Alphabet
{
    private static String plain = "abcdefghijklmnopqrstuvwxyz ";
    private String shifted;
   
    public Alphabet(int shift)
    {
        shifted = getShifted(shift);
    }
    
    public String getShifted(int shift)
    {
        int n = 27;//this is the length of the alphabet
        int s = shift;//this is how much you are shifting the alphabet
        
        return plain.substring(s,n) + plain.substring(0,s);//this is the shifted alphabet
    }
    
    public String getSAlphabet()
    {
        return shifted;
    }
    
    public String getPAlphabet()
    {
        return plain;
    }
}




