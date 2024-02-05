/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String toPrint ="";
        for (int i=0; i<s.length(); i++)
        {
            if (((int) s.charAt(i)>=32 && (int) s.charAt(i)<=64)|| ((int) s.charAt(i)>=97 && (int) s.charAt(i)<=122)|| ((int) s.charAt(i)>=91 && (int) s.charAt(i)<=96)|| ((int) s.charAt(i)>=123 && (int) s.charAt(i)<=126))
            toPrint += s.charAt(i);
            else
            toPrint += (char) (((int) s.charAt(i)) + 32);
        }
        return toPrint;
    }
}