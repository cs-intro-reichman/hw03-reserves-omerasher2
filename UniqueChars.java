/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = "yael played the yokelele";
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s)
    {
        String s1;
        String toPrint ="";
        for (int i=0; i<s.length(); i++)
        {
            char current = s.charAt(i);
            s1 = s.substring(0, i);
            if (s1.indexOf(current) == -1 || current == ' ')
                toPrint += current;

        }
        return toPrint;
    } 
    }
 