
public class WordPlay {

	/**
	 * @param args
	 */
	public boolean isTrue(){
		return true;
	}
	
    public static boolean isPalindrome (String str) {

        if (str == null || str.length () <= 1){
            return true;
        }

        char first = str.charAt (0);
        char last = str.charAt (str.length () - 1);
        
        if (first == last){
            return isPalindrome(str.substring(1, str.length()-1));
        }
        
        return false;
    }
    
	public static void main (String[] args) {

        String str = "remmer";
        if (isPalindrome(str))
            System.out.println ("Ja det er det!");
        else
            System.out.println ("NEJ!");
    }

}
