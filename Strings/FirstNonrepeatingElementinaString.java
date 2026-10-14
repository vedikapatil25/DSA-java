package Strings;

public class FirstNonrepeatingElementinaString {
    public static void main(String[] args) {
        String s = "programming";
        char[] ch = s.toCharArray();
        
        for(int i = 0; i< ch.length;i++){
            int count = 1;
            for(int j=0; j<ch.length;j++){
            if(ch[i] == ch[j]){
                count++;
            }
            }
            if(count == 1){
                System.out.println("First Non-repeating element is: " + ch[i]);
                break;
            }
            
        }

        }
    }

