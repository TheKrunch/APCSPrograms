/**
 * Write a description of class Cipher here.
 * 
 * @author Matt Scalzo
 * @version 1.0 - 1/3/16
 */
public class Cipher
{
    private Message sMessage;
    private String sKey;

    /**
     * Constructor for objects of class Cipher
     */
    public Cipher(String message, String key)
    {
       sMessage = new Message(message);
       sKey = key;
    }
    
    public Message encrypt()
    {
        int n = sMessage.length();
        int shift;
        int cord;
        String eMessage = "";
        
        for(int i = 0; i < n; i++)
        {
            shift = indexInPlain(sKey.substring(i,i+1));
            cord = indexInPlain(sMessage.substring(i,i+1));
            eMessage = eMessage + getEncrypted(shift,cord);
        }
        Message nMessage = new Message(eMessage + "~");
        return nMessage;
    }
    
    public Message decrypt()
    {
        int n = sMessage.length();
        int shift;
        int cord;
        String dMessage = "";
        
        for(int i = 0; i < n-1; i++)
        {
            shift = indexInPlain(sKey.substring(i,i+1));
            cord = indexInShifted(sMessage.substring(i,i+1),shift);
            dMessage = dMessage + getDecrypted(cord);
        }
        Message nMessage = new Message(dMessage);
        return nMessage;
    }
    
    
    public String getEncrypted(int shift, int cord)
    {
        System.out.println("****************");
        System.out.println(shift);
        System.out.println(cord);
        Alphabet key = new Alphabet(shift);
        String s = key.getSAlphabet();
        return s.substring(cord,cord+1);
    }
    
    public String getDecrypted(int cord)
    {
       System.out.println("****************");
       System.out.println(cord);
       Alphabet key = new Alphabet(0);
       String p = key.getPAlphabet();
       return p.substring(cord,cord+1);
    }
    
    public int indexInPlain(String letter)
    {
        Alphabet check = new Alphabet(0);
        String p = check.getPAlphabet();
        return p.indexOf(letter);
    }
    
    public int indexInShifted(String letter, int shift)
    {
        Alphabet check = new Alphabet(shift);
        String s = check.getSAlphabet();
        return s.indexOf(letter);
    }
}


