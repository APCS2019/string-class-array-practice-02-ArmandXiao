public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
        /* implementation not shown */
        int loc = -1;            // location of the lastest str
        int count = 1;     // the number of time str ouccurs
        int start = 0;          // the start position of the str in the cutted string
        int sub = -1;            // the new substring of cutted string
        while(currentPharse.substring(start).indexOf(str) !=-1) // 截取部分找str 如果找不到 推出 while loop
        {   
           sub = currentPharse.substring(start).indexOf(str);
           start = sub + 1;
           loc += start;
           count++;
           if( count == n){ return loc-1;}
        }
        return -1;
    }
    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        /* to be implemented in part(a) */
        return currentPhrase.substring(0, findNthOccurrence(str,n)) + repl + currentPhrase.substring(findNthOccurrence(str,n)+str.length());
        
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        /* to be implemented in part(b) */
        int nth = 1;
        while( currentPhrase.indexOf(str) == -1){
            nth++;
        }
        return currentPhrase.findNthOccurrence(str, nth-1);
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {
 
    }
}
