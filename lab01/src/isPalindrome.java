public class isPalindrome {
    public static void main(String [] args){}

    public static String palindrome (String s){
        String lowerCase = s.toLowerCase();
        char [] pal = lowerCase.toCharArray();
        String reverse = "";
        for (int i = pal.length - 1; i>=0; i--){
            reverse+=pal[i];
    }
    return reverse;
    }
    public static boolean isthepalindrome(String s){

        return s.equals(palindrome(s));
    }
}
