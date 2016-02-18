/**
 * Write a description of class Message here.
 * 
 * @author Matt Scalzo 
 * @version 1.0 - 1/3/16
 */
public class Message
{
    String message;
    boolean encrypted;

    public Message(String nMessage)
    {
        message = nMessage;
        encrypted = false;

        for(int i = 0; i < message.length(); i++)
        {
            String s = message.substring(i,i+1);
            if(s.equals("~"))
            {
                encrypted = true;
            }
        }
    }
    
    public int length()
    {
        return message.length();
    }
    
    public String substring(int from, int to)
    {
        return message.substring(from,to);
    }
    
    public String substring(int from)
    {
        return message.substring(from);
    }
    
    public int indexOf(String str)
    {
        return message.indexOf(str);
    }
    
    public int compareTo(String other)
    {
        return message.compareTo(other);
    }
}


