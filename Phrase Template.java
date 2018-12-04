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
        int loc ;
        int indexCount = 0;
        String temp = currentPhrase;
        if( currentPhrase.indexOf(str) != -1){
            for( int i =0; i< n; i++){
                loc = currentPhrase.indexOf(str);
                temp = temp.substring(loc + str.length());
                if(i < n-1){ indexCount += loc+str.length();}
                else if(i== n-1){ indexCount += loc;}
            }
            return indexCount;
        }
        else
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
