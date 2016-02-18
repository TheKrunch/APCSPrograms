
/**
 * Write a description of class WordScrambler here.
 * 
 * @author Matt Scalzo
 * @version 1.0 - 2/1/16
 */
public class WordScrambler
{
    private String[] scrambledWords;
    private String[] defaultWords = {"word", "grape", "apple", "orange"};
    
    public WordScrambler()
    {
        scrambledWords = mixedWords(defaultWords);
    }
    
    public WordScrambler(String[] wordArr)
    {
        scrambledWords = mixedWords(wordArr);
    }
    
    private String recombine(String word1, String word2)
    {
        String scrambled = "";
        int L1 = word1.length()/2;
        int L2 = word2.length()/2;
        scrambled = word1.substring(0,L1) + word2.substring(L2);
        return scrambled;
    }
    
    private String[] mixedWords(String[] words)
    {
        int L = words.length;//one thing to note, for arrays you use .length without the ().
        String[] newWords = new String[L];
        for(int i = 0; i < L; i = i+2)
        {
            newWords[i] = recombine(words[i], words[i+1]);
            newWords[i+1] = recombine(words[i+1], words[i]);
        }
        
        return newWords;
    }
}



