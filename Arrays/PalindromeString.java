public class PalindromeString {
    public static boolean isAlphanumeric(char ch){
        if((Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')||
        (ch >= '0' && ch <= '9')){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            char left = s.charAt(i);
            char right = s.charAt(j);
            if(!isAlphanumeric(left)){
                i++;
                continue;
            }
            if(!isAlphanumeric(right)){
                j--;
                continue;
            }
            else if(Character.toLowerCase(left) == Character.toLowerCase(right)){
                i++;
                j--;
            }
            else{
                return false;
            }
            
        }
        return true;    
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race e car"));
    }
}
